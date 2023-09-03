package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class clicknHold_Release {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://emicalculator.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(By.xpath("//span[text()='50L']/..")));
        actions.release(driver.findElement(By.xpath("//span[text()='175L']/..")));
        actions.build().perform();
    }
}
