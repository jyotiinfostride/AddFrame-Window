package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTab {
    WebDriver driver;
    @FindBy(id ="tabButton")
    WebElement Tab;
    @FindBy (id="windowButton")
    WebElement NewWindow;
    @FindBy (id="messageWindowButton")
    WebElement NewMessageWindow;

    public  NewTab (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setTab(){
        Tab.click();
    }
    public void setNewWindow(){
        NewWindow.click();
    }
    public void setNewMessageWindow(){
        NewMessageWindow.click();
    }
}
