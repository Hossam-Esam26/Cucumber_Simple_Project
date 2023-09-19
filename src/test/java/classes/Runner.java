package classes;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/java/features",
        glue = "classes",
        tags = "@test",
        plugin ={"html:target/reports/report.html"}
)
public class Runner {
}
