package Day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumProg {
    public static void main(String[] args) {

        //WebDriverManager.chromeDriver.setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver = new FirefoxDriver();
        driver.get("https://www.bing.com/");
    }
}
