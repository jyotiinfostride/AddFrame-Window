package src.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertAppear {
     WebDriver driver;
    String path;
    @Test
    public void Test3() throws InterruptedException {
        path = System.getProperty("user.dir") + "//Driver//Chromedriver.exe";
        // System.setProperty("webdriver.chrome.driver",path);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("timerAlertButton")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(10000);
        Alert AlertAppear = driver.switchTo().alert();
        AlertAppear.accept();
    }
}