package controllers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.PropertyReader;

import java.time.Duration;

public class BrowserFactory {

    static WebDriver driver;
    static WebDriver createDriver() throws Exception {
        switch (initMethod.browser){
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "edge":
                driver = new EdgeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

            default:
                throw new Exception("Supported Browsers are: chrome, firefox and edge");

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(PropertyReader.readProperties("Timeout"))));

        return driver;
    }
}
