package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectDropdown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/Admin/Order/List");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        Select countrydp = new Select(driver.findElement(By.cssSelector("select[id=\"BillingCountryId\"]")));
        //countrydp.selectByValue("103");

        //countrydp.selectByVisibleText("Italy");

        countrydp.selectByIndex(15);

        for (WebElement c: countrydp.getOptions()) {
            System.out.println(c.getAttribute("value") + " - " + c.getText());
        }


        driver.close();
        driver.quit();

    }
}
