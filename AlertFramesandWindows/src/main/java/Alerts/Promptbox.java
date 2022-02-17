package Alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Promptbox {
    WebDriver driver;
    String path;
    @Test
    public void box (){
        path = System.getProperty("user.dir") + "//Driver//Chromedriver.exe";
        // System.setProperty("webdriver.chrome.driver",path);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("promtButton")).click();
        Alert promptAlert =driver.switchTo().alert();
        String alertText =promptAlert.getText();
        System.out.println("Alert text is"+ alertText);
        promptAlert.sendKeys("User");
        promptAlert.accept();

    }
}
