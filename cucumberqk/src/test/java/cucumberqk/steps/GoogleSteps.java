package cucumberqk.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.HelperFunctions;

public class GoogleSteps {
	WebDriver driver;
	@Given("a web browser is on the Google page")
	public void a_web_browser_is_on_the_Google_page() {
		driver=HelperFunctions.createAppropriateDriver("chrome");
		driver.get("https://www.google.com/");
	}

	@When("the search phrase {string} is entered")
	public void the_search_phrase_is_entered(String string) {
		System.out.println("search parameter="+string);
		By bysearch=By.name("q");
		WebElement element=driver.findElement(bysearch);
		element.sendKeys(string);
		element.sendKeys(Keys.ENTER);	
	}

	@Then("results for {string} are shown")
	public void results_for_are_shown(String string) {
		By searchPageFirstObject = By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a/h3");
		WebElement element = driver.findElement(searchPageFirstObject);
		String strText = element.getText();
		System.out.println("String = " + strText);
		strText = strText.toLowerCase();
		if (strText.contains(string.toLowerCase())) {
			System.out.println("Test is passed");
		}
		else {
			System.out.println("test is failing");
		}
		driver.quit();	
	}
}
