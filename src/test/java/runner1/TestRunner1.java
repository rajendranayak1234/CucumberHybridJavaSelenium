package runner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="scr/test/resources/features/Login1.feature",
glue= {"stepdefinition1","hooks1"},
publish=true,
dryRun=false,
monochrome=true,
plugin={"pretty","html:target/HTMLreports/report.html"}
)
public class TestRunner1 {
}
