package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webdriverfactory.DriverFactory;

public class HomePage {

    @FindBy(xpath = "//img[@class=\"brand-image-xl logo-xl\"]")
    WebElement logo_WebElement;

    @FindBy (xpath = "//a[text()='Logout']")
    WebElement logout_WebElement;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public boolean ishomepageLogoDisplayed(){
        return logo_WebElement.isDisplayed();
    }

    public void clickLogout(){
        JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();
        js.executeScript("arguments[0].click();",logout_WebElement);
    }
}
