package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)

public class OrangeHrm {

	 static WebDriver driver;
   
	@Given("^open the browser$")
    public void open_the_browser() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
    }

    @When("^open HRM Homepage$")
    public void open_hrm_homepage()  {
    	driver.get("https://opensource-demo.orangehrmlive.com");

    	    }

	@Then("^verify logo is present or not$")
    public void verify_logo_is_present_or_not()  {
   driver.findElement(By.xpath("//div[@id='divLogo']//img"));
   String expected="OrangeHRM";
   String actual=driver.getTitle();
   System.out.println(actual);
   Assert.assertEquals(actual, expected);
   
    }
   
    @And("^Close Browser$")
    public void close_browser() {
    	driver.close();
    	
    }

}