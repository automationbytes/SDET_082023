package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHover {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']")));
        action.moveToElement(driver.findElement(By.xpath("//span[text()='Room Heaters']")));
        action.click(driver.findElement(By.xpath("//span[text()='Room Heaters']")));
        action.build().perform();



    }
}
