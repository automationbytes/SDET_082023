package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class keyboardAction {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.name("q")).sendKeys("Selenium");
        Actions actions = new Actions(driver);
      //  actions.sendKeys(driver.findElement(By.name("q")),"selenium");
     //   actions.build().perform();
        actions.sendKeys(Keys.ARROW_DOWN);
        actions.sendKeys(Keys.ARROW_DOWN);
        actions.build().perform();
    }
}
