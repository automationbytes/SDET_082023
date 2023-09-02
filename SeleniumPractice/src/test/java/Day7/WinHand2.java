package Day7;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class WinHand2 {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.openmultipleurl.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.manage().window().maximize();

        driver.findElement(By.id("list_urls")).sendKeys("https://www.google.com/");
        driver.findElement(By.id("list_urls")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("list_urls")).sendKeys("https://www.bing.com/");
        driver.findElement(By.id("list_urls")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("list_urls")).sendKeys("https://www.yahoo.com/");
        driver.findElement(By.id("list_urls")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("list_urls")).sendKeys("https://www.facebook.com/");
        driver.findElement(By.id("list_urls")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("list_urls")).sendKeys("https://www.instagram.com/");
        driver.findElement(By.id("list_urls")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("#button")).click();


        String ParentWindow = driver.getWindowHandle();
        Set<String> allOpenWindows = driver.getWindowHandles();

        for (String a: allOpenWindows) {
            if(!a.equals(ParentWindow)){
                driver.switchTo().window(a);
                Thread.sleep(10000);
                driver.close();
            }

        }

        driver.switchTo().window(ParentWindow);
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File Screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Screenshot,new File("Screenshot/openmultipleurl.png"));

    }
}
