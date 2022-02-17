package Frame;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;

import static org.openqa.selenium.By.*;

public class Nestedframe {
    WebDriver driver;
    String path;
    @Test

    public void frame(){
        path = System.getProperty("user.dir") + "//Driver//Chromedriver.exe";
        // System.setProperty("webdriver.chrome.driver",path);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();
        int countIframesInPage  = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of frame on the page:"+ countIframesInPage);
        WebElement frame1 = driver.findElement(By.id("frame1"));
        driver.switchTo().frame("frame1");
        WebElement frame1Element = driver.findElement(By.tagName("body"));
        String frame1Text = frame1Element.getText();
        System.out.println("Frame1 is:"+frame1Text);
        int countIframesInframe1 =driver.findElements(By.tagName("iframe")).size();
       System.out.println("Number of iFrames inside the Frame1:"+ countIframesInframe1);
        driver.switchTo().frame(0);
        int countIframesInframe2 =driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of iFrames inside the Frame2:"+ countIframesInframe2);
    }
}
