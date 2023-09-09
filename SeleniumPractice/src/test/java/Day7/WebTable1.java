package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class WebTable1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/Admin/Product/List");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]")).click();

        Select pagesize = new Select(driver.findElement(By.xpath("//select[@name='products-grid_length']")));
        pagesize.selectByVisibleText("100");
        Thread.sleep(8000); //explicit wait
        List<WebElement> row = driver.findElements(By.xpath("//table[@id=\"products-grid\"]//tr"));
        System.out.println(row.size());
        int rowsize = row.size();
        String productname = "";
        for (int i = 1; i<rowsize;i++){
            productname = driver.findElement(By.xpath("//table[@id=\"products-grid\"]//tr["+i+"]/td[3]")).getText();
            System.out.println(productname);
            if(productname.equals("Nikon D5500 DSLR")){
                driver.findElement(By.xpath("//table[@id=\"products-grid\"]//tr["+i+"]/td[8]/a")).click();
                break;
            }
        }
    }
}
