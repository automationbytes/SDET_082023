package controllers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class WebDriverFactory extends BrowserFactory {
    public static ThreadLocal<WebDriver> wd = new ThreadLocal<>();

    @BeforeTest
    public void beforeMethod() throws Exception {
        new WebDriverFactory();
        WebDriver driver = WebDriverFactory.createDriver();
        setWebDriver(driver);
    }

    public void setWebDriver(WebDriver driver){
        wd.set(driver);
    }

    public static WebDriver getWebDriver(){
        return wd.get();
    }
}
