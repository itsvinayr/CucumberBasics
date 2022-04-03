package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions", "hooks"}, stepNotifications = true,
        // tags = "@iOSTest",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cukes.xml"},
        // dryRun = true,
        monochrome = true
)
public class JunitTestRunner {
}
