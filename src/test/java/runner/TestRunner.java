package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "src/test/resources/features/location.feature",  // Correct relative path

    glue = {"stepDefination" , "hooks"}, // path of the step defination file
    dryRun = false,            //to check the mappingis proper between feature file and step defination file
    monochrome = true,         // display the console output in a proper readable formate
 //  tags ="@Sanity",
    //plugin = {"pretty", "html:target/cucumber-report/reports.html"} //  to generate different type of reporting
   plugin =   {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	    
    
)

 public class TestRunner {}

