package pageObjects;

import controllers.WebDriverFactory;
import modules.LoginPage;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryInit extends WebDriverFactory {

    public LoginPage loginPage(){
        return PageFactory.initElements(getWebDriver(),LoginPage.class);
    }
}
