package testRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\karth\\eclipse-workspace\\cucumberDemoOrangeHRM\\src\\test\\java\\feature\\login.feature", 
		glue="stepDefinition")

//in cucumber annotation give the path till pkg of feature file and stepdefinition file to testrunner file

public class Test_Runner {

	
}
