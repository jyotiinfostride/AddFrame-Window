package src.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewWindow {
    WebDriver driver;
    String path;
    @Test
    public void Window(){
        path=System.getProperty("user.dir")+"//Driver//Chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("messageWindowButton")).click();
        String MainWindow = driver.getWindowHandle();
        System.out.println("Main window handle is"+MainWindow);

    }
}
