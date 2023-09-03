package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Scrolling_action {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://emicalculator.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Actions actions = new Actions(driver);
        actions.scrollToElement(driver.findElement(By.xpath("//h5/a[contains(text(),'Home Loan EMI Calculator')]")));
        actions.build().perform();

    }

}
