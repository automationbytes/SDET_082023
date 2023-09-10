package modules;

import controllers.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends WebDriverFactory {

    @FindBy(css = "input[id=\"user-name\"]")
    WebElement username_WebEdit;

    @FindBy(xpath = "//input[@id=\"password\"]")
    WebElement password_WebEdit;

    @FindBy(css = "input[name=\"login-button\"]")
    WebElement login_button;

    public void enterUsername(String user){
        username_WebEdit.sendKeys(user);
    }

    public void enterPassword(String pass){
        password_WebEdit.sendKeys(pass);
    }

    public void clickLogin(){
        login_button.click();
    }

    public String pageTitle(){
        return getWebDriver().getTitle();
    }
}

