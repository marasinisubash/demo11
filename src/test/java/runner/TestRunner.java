package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/resources/features",
				glue= {"org.marasinitesting.cucumbercourse.stepDefs"},
				plugin = {"pretty", "html:target/html-report.html","json:target/json-report.json"},
				monochrome = true,
				publish = true
		)
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
