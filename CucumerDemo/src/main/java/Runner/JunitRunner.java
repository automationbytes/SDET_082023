package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"Steps"},
        plugin = {"pretty",
                "html:reports/html-reports/reports.html",
                "json:reports/json-reports/reports.json",
                "junit:reports/junit-reports/reports.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        publish = true,
        tags = "@Regression"
)


public class JunitRunner {
}
