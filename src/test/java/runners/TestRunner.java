package runners;


import java.io.File;
import java.io.FileReader;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/features",
		   //path of step definition file
		   glue = {"stepdefs","myhook"},
		   plugin = {"pretty", "junit:target/JUNITReports/report.xml", "html:target/HTMLReports", "json:target/JSONReports/report.json",
				   "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
				   
		monochrome =true,
		strict = true,
		dryRun = false
		
		   )
public class TestRunner {
	
	/*@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig("/com.practiceTest/src/main/java/configs/extent-config.xml");
	}
	*/


}

