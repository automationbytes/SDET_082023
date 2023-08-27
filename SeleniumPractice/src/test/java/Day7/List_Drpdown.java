package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class List_Drpdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.cssSelector("input#source")).sendKeys("Ban");

        List<WebElement> Sourcedropdown = driver.findElements(By.xpath("//ul[@id=\"ui-id-1\"]/li"));
        for (WebElement s : Sourcedropdown){
            System.out.println(s.getText());
            if (s.getText().equals("Bangalore")){
                s.click();
                break;
            }
        }


        driver.findElement(By.id("destination")).sendKeys("Che");

        List<WebElement> destDropdown = driver.findElements(By.xpath("//ul[@id=\"ui-id-2\"]/li"));
        Thread.sleep(2000);
        for (WebElement d : destDropdown){
            System.out.println(d.getText());
            if (d.getText().contains("Chengalpattu")){
                d.click();
                break;
            }
        }

        driver.findElement(By.xpath("//input[@id=\"datepicker1\"]")).click();

        List<WebElement> date = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td//a"));
        for (WebElement d: date){
            System.out.println(d.getText());
            if (d.getText().equals("15")){
                d.click();
                break;
            }
        }

    }
}
