package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "./src/test/java/features", glue = "Steps", monochrome = true  , dryRun = false ,snippets= SnippetType.CAMELCASE)

public class Runtest extends AbstractTestNGCucumberTests {

}
