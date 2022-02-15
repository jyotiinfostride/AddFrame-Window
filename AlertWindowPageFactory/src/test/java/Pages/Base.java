package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    protected Base pageFactory;
    WebDriver driver;

    @BeforeClass
    public void initialization(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        pageFactory=new Base(driver);
        driver.navigate().to("https://demoqa.com/browser-windows");
    }
}
