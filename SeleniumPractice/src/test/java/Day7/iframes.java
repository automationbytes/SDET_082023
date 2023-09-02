package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class iframes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        //without frame
        driver.findElement(By.xpath("//a[@title=\"Change Orientation\"]")).click();


       // driver.switchTo().frame("iframeResult");

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[id=\"iframeResult\"]")));
        //inside frame
        driver.findElement(By.xpath("//button[text()='Try it']")).click();

        //alert
        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().sendKeys("Devlabs");

        driver.switchTo().alert().dismiss();
        //driver.switchTo().alert().accept();

        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@title=\"Change Orientation\"]")).click();

    }
}
