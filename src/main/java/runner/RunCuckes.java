package runner;


import cucumber.api.CucumberOptions;



@CucumberOptions(features = "./src/main/java/LearningCum", glue="Steps" , monochrome=false, tags = "@Smoke , @Sanity") //"@Sanity and @Smoke"

public class RunCuckes {
	
}