package src.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ModelDialogs {
    WebDriver driver;
    String path;
    @Test
    public void dialogs(){
        path = System.getProperty("user.dir") + "//Driver//Chromedriver.exe";
        // System.setProperty("webdriver.chrome.driver",path);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
         driver.manage().window().maximize();
        driver.get("https://demoqa.com/ModelDialogs");
       // driver.manage().window().maximize();
        driver.findElement(By.id("showSmallModal")).click();
       // Alert ModelDialogs = driver.switchTo().alert();
       // ModelDialogs.accept();
    }
}
