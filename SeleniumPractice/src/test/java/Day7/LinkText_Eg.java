package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Eg {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        //or
    //    driver.navigate().to("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("Kal");
        driver.findElement(By.name("pass")).sendKeys("123Pass65498654");

        //driver.findElement(By.linkText("Forgotten password?")).click();
        driver.findElement(By.partialLinkText("Forgotten pass")).click();

    }
}
