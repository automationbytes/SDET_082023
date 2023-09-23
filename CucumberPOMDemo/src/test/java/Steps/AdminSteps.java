package Steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;
import webdriverfactory.DriverFactory;

public class AdminSteps {

    private ConfigReader configReader = new ConfigReader();
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private HomePage homePage = new HomePage(DriverFactory.getDriver());



    @Given("the user launches the NOPAdmin url")
    public void theUserLaunchesTheNOPAdminUrl() {
       // System.out.println("Hello");
        DriverFactory.getDriver().get(configReader.getConfigProp("url"));
    }

    @Then("the user verifies the header text")
    public void theUserVerifiesTheHeaderText() {
        Assert.assertTrue(loginPage.isHeaderDisplayed());
    }

    @When("the user enters {string} in email webEdit")
    public void theUserEntersInEmailWebEdit(String username) {
        loginPage.enterUsername(username);
    }

    @When("the user enters {string} in password webEdit")
    public void theUserEntersInPasswordWebEdit(String passwrd) {
        loginPage.enterPassword(passwrd);
    }

    @Then("the user clicks on login button")
    public void theUserClicksOnLoginButton() {
        loginPage.clickLogin();
    }

    @Then("the user verifies the homePage logo")
    public void theUserVerifiesTheHomePageLogo() {
        Assert.assertTrue(homePage.ishomepageLogoDisplayed());
    }

    @And("the user logouts the application")
    public void theUserLogoutsTheApplication() {
        homePage.clickLogout();
    }
}
