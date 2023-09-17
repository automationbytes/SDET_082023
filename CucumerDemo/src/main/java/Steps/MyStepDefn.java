package Steps;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyStepDefn {
    public WebDriver driver;
    @Before
    public void initDriver(){
       driver  = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Given("the user launches the facebook application")
    public void the_user_launches_the_facebook_application() {
        driver.get("https://www.facebook.com/");
    }

    @Then("the user verifies the facebook logo")
    public void the_user_verifies_the_facebook_logo() {
        boolean islogoDisplayed = driver.findElement(By.cssSelector("img[alt=\"Facebook\"]")).isDisplayed();
        Assert.assertTrue(islogoDisplayed);
    }

    @When("the user enters the username in username webedit")
    public void the_user_enters_the_username_in_username_webedit() {
        driver.findElement(By.name("email")).sendKeys("Tom");
    }

    @When("the user enters the password in password webedit")
    public void the_user_enters_the_password_in_password_webedit() {
        driver.findElement(By.name("pass")).sendKeys("Face@123");
         }

    @When("the user clicks on login button")
    public void the_user_clicks_on_login_button() {
        driver.findElement(By.name("login")).click();
    }


}
