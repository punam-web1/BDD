package cucumberqk.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.HelperFunctions;

public class ataCompareSteps {
	
	WebDriver driver;
	String result;
	
	@Given("a web browser is on the ATA page")
	public void a_web_browser_is_on_the_ATA_page() {
	   driver = HelperFunctions.createAppropriateDriver("CHROME");
		driver.get("http://ata123456789123456789.appspot.com/");
	}

	@When("compare is called with {int} and {int}")
	public void compare_is_called_with_and(Integer int1, Integer int2) {
	    driver.findElement(By.id("ID_nameField1")).sendKeys(String.valueOf(int1));
		driver.findElement(By.id("ID_nameField2")).sendKeys(String.valueOf(int2));
		driver.findElement(By.id("gwt-uid-4")).click();
		driver.findElement(By.id("ID_calculator")).click();
	}

	@When("compare is called with {double} and {double}")
	public void compare_is_called_with_and(Double double1, Double double2) {
	    driver.findElement(By.id("ID_nameField1")).sendKeys(String.valueOf(double1));
		driver.findElement(By.id("ID_nameField2")).sendKeys(String.valueOf(double2));
		driver.findElement(By.id("gwt-uid-4")).click();
		driver.findElement(By.id("ID_calculator")).click();
	}

	@Then("error is {string}")
	public void error_is(String string) {
	   String actaulResult=driver.switchTo().alert().getText();
		System.out.println("error message is " + actaulResult);
		String expectedResult= string;
		if(actaulResult.equals(expectedResult))
		{
		System.out.println("the test is pass");

		}
		else
		{
		System.out.println("the test is fail");
		}
		
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		driver.quit();
	}

	@When("compare is called with {double} and {int}")
	public void compare_is_called_with_and(Double double1, Integer int1) {
	   driver.findElement(By.id("ID_nameField1")).sendKeys(String.valueOf(double1));
		driver.findElement(By.id("ID_nameField2")).sendKeys(String.valueOf(int1));
		driver.findElement(By.id("gwt-uid-4")).click();
		driver.findElement(By.id("ID_calculator")).click();
	}

	@When("compare is called with {int} and {double}")
	public void compare_is_called_with_and(Integer int1, Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("ID_nameField1")).sendKeys(String.valueOf(int1));
		driver.findElement(By.id("ID_nameField2")).sendKeys(String.valueOf(double1));
		driver.findElement(By.id("gwt-uid-4")).click();
		driver.findElement(By.id("ID_calculator")).click();
	}
	
	@Then("compare result is {int}")
	public void compare_result_is(Integer int1) {
	// Write code here that turns the phrase above into concrete actions
	//throw new cucumber.api.PendingException();
	result = driver.findElement(By.id("ID_nameField3")).getAttribute("value");	
	if(result.equals(int1.toString())) {
	System.out.println("the test is pass");
	}else {
	System.out.println("test is fail");
	}
	driver.quit();
	}



}
