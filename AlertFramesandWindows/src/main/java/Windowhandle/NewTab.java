package Windowhandle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class NewTab {
    WebDriver driver;
    String path;
    @Test
    public void test() throws InterruptedException {
        path = System.getProperty("user.dir") + "//Driver//Chromedriver.exe";
        // System.setProperty("webdriver.chrome.driver",path);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.findElement(By.id("tabButton")).click();
//        Thread.sleep(5000);
//        Alert alert = driver.switchTo().alert();
//        String alertMessage= driver.switchTo().alert().getText();
        String parent=driver.getWindowHandle();

        Set<String> s=driver.getWindowHandles();

// Now iterate using Iterator
        Iterator<String> I1= s.iterator();

        while(I1.hasNext())
        {

            String child_window=I1.next();


            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);
                String text = driver.findElement(By.xpath("//h1")).getText();
                System.out.println(text);
                System.out.println(driver.switchTo().window(child_window).getTitle());

                driver.close();
            }

        }

    }
}
