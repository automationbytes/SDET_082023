package tests;

import controllers.WebDriverFactory;
import org.testng.annotations.Test;
import modules.LoginPage;
import pageObjects.PageFactoryInit;
import utils.ExcelReader;
import utils.PropertyReader;

public class TestSauceDemo extends PageFactoryInit {
    @Test(priority = -1, alwaysRun = true)
    public void URLVerify() throws InterruptedException {
        getWebDriver().get(PropertyReader.readProperties("URL"));
        String pageTitle = loginPage().pageTitle();
        System.out.println(pageTitle);
//        loginPage().enterUsername("standard_user");
//        loginPage().enterPassword("secret_sauce");
        loginPage().enterUsername(ExcelReader.getExcelData("SauceLabs", "Username"));
        loginPage().enterPassword(ExcelReader.getExcelData("SauceLabs", "Password"));

        loginPage().clickLogin();
        Thread.sleep(20000);
    }
}
