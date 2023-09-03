package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class doubleClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Actions actions = new Actions(driver);
        actions.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']")));
         actions.build().perform();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

    }
}
