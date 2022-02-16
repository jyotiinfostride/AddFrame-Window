package src.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frame {
    WebDriver driver;
    String path;
    @Test
    public void iframe(){
        path = System.getProperty("user.dir") + "//Driver//Chromedriver.exe";
        // System.setProperty("webdriver.chrome.driver",path);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        //driver.findElement(By.id("")).click();
        driver.switchTo().frame(0);
        driver.quit();
    }
}
