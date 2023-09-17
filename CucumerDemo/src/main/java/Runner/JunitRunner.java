package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Features/Facebook.feature"},
        glue = {"Steps"},
        plugin = {"pretty",
        "html:reports/htmlreport.html",
        "json:reports/jsonreport.json",
        "junit:reports/xmlreport.xml"},
        publish = true
)


public class JunitRunner {
}
