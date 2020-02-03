package cucumberqk.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.HelperFunctions;

public class CompareSteps {
	WebDriver driver;
@Given("a web browser on the Google page and we search the given url")
public void a_web_browser_on_the_Google_page_and_we_search_the_given_url() {
	driver=HelperFunctions.createAppropriateDriver("chrome");
	driver.get("http://ata123456789123456789.appspot.com/");
}


	@When("comparesion is called with two numbers the numbers are {int} and {int}")
	public void comparesion_is_called_with_two_numbers_the_numbers_are_and(Integer int1, Integer int2) {
		System.out.println(int1);
		By click1 = By.xpath("//*[@id=\"ID_nameField1\"]");
		WebElement element = driver.findElement(click1);
		element.sendKeys(String.valueOf(int1));
		By click2 = By.xpath("//*[@id=\"ID_nameField2\"]");
		WebElement element1 = driver.findElement(click2);
		element1.sendKeys(String.valueOf(int2));
		By click3 = By.xpath("//*[@id=\"gwt-uid-4\"]");
		WebElement element2 = driver.findElement(click3);
		element2.click();

	}


	@Then("results is greatest number i.e {int}")
	public void results_is_greatest_number_i_e(Integer int1) {
		By click4 = By.xpath("//*[@id=\"ID_calculator\"]");
		WebElement element3 = driver.findElement(click4);
		element3.click();
		By click5 = By.xpath("//*[@id=\"ID_nameField3\"]");
		String element4=driver.findElement(click5).getAttribute("value");;
		System.out.println("Greatest is "+element4);
		if (element4.equals(String.valueOf(int1))) {
			System.out.println("Test is passed");
		}
		else {
			System.out.println("test is failing");
		}
		driver.close();

	}





}
