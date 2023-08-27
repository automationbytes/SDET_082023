package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']")).click();

        driver.findElement(By.xpath("//input[@aria-label=\"First name\"]")).sendKeys("Tom");

        driver.findElement(By.cssSelector("input[name=\"lastname\"]")).sendKeys("Cruise");

        driver.findElement(By.xpath("//label[text()='Male']")).click();
    }
}
