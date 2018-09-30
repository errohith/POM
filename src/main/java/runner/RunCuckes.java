package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/main/java/LearningCum", glue="Steps" , monochrome=false, tags = "@Smoke , @Sanity") //"@Sanity and @Smoke"

public class RunCuckes {
	
}