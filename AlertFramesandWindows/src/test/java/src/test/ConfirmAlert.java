package src.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConfirmAlert {
    WebDriver driver;
    String path;
    @Test
    public void confirm(){
        path = System.getProperty("user.dir") + "//Driver//Chromedriver.exe";
        // System.setProperty("webdriver.chrome.driver",path);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("confirmButton")).click();
        Alert ConfirmAlert = driver.switchTo().alert();
        String alertText = ConfirmAlert.getText();
        System.out.println("Alert text is"+alertText);
        ConfirmAlert.accept();
    }
}
