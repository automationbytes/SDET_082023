package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators
{
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("Tom");
        driver.findElement(By.name("pass")).sendKeys("user123");
        driver.findElement(By.name("login")).click();
    }
}
