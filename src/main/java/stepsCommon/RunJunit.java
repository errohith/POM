package stepsCommon;



import cucumber.api.CucumberOptions;


@CucumberOptions(features = "./src/main/java/testCaseFeatures", 
						glue = {"pagesPOM","stepsCommon"},
						//tags= {"@smoke or @sanity"},
						monochrome= true) 
public class RunJunit {


}
