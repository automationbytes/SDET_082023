package controllers;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import utils.LoggerUtil;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class WebDriverFactory extends BrowserFactory {
    public static ThreadLocal<WebDriver> wd = new ThreadLocal<WebDriver>();

    public ITestResult result; // Declare the ITestResult variable

    @BeforeMethod
    public void beforeMethod(ITestResult testResult) throws Exception {
        result = testResult; // Assign the test result to the result variable
        LoggerUtil.initThreadLocalLogs();
        .0000000000
        new WebDriverFactory();
        WebDriver driver = WebDriverFactory.createDriver();
        setWebDriver(driver);
    }

    public void setWebDriver(WebDriver driver){
        wd.set(driver);
    }

    public static WebDriver getWebDriver(){
        return wd.get();
    }


    public static void saveFullPageScreenshot(String name) throws IOException {
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
                .takeScreenshot(getWebDriver());
        ImageIO.write(screenshot.getImage(), "PNG", new File(name));
    }

    @AfterMethod(alwaysRun = true, enabled = true)
    public void afterMethod(ITestResult result) throws Exception {
        Thread.sleep(2000);
        if (result.getStatus() == ITestResult.FAILURE) {
            saveFullPageScreenshot("./src/test/resources/Reports/Images/" + result.getTestClass().getName() + "."
                    + result.getMethod().getMethodName() + ".png");
        }
        getWebDriver().quit();

        String capturedLogs = LoggerUtil.getThreadLocalLogs();
        if (!capturedLogs.isEmpty()) {
            LoggerUtil.logInfo("Test Steps:\n" + capturedLogs);
        }
        LoggerUtil.removeThreadLocalLogs();
    }

}

