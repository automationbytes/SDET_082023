package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class fileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/file.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("j_idt88:j_idt89_input")).sendKeys("C:\\Users\\Vigne\\Desktop\\Dummy.txt.txt");
    }
}
