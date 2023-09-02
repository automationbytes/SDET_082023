package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class Wait_Eg {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        //implicit wait for all the elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']")).click();

        driver.findElement(By.xpath("//input[@aria-label=\"First name\"]")).sendKeys("Tom");

        driver.findElement(By.xpath("//label[text()='Custom']")).click();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10L))
                .pollingEvery(Duration.ofSeconds(2L))
                .ignoring(NoSuchElementException.class);

        //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("preferred_pronoun"))));

        Thread.sleep(15000);

        Select dropdown = new Select(driver.findElement(By.name("preferred_pronoun")));
        dropdown.selectByIndex(1);


    }
}
