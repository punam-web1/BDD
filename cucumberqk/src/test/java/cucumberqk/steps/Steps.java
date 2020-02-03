package cucumberqk.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumberqk.*;
public class Steps {
	Calculator calc=null;
	int result;
	@Given("calculator exists")
	public void calculator_exists() {
	    System.out.println("calculator exists");
		calc= new Calculator();
	}

	@When("add is called with two numbers")
	public void add_is_called_with_two_numbers() {
	   System.out.println("add is called with two numbers");
		result =calc.add(30,40);
	}

	@Then("result is the addition of the two number")
	public void result_is_the_addition_of_the_two_number() {
	    System.out.println("result is the addition of the two number: "+result);
	}
	
	@When("add is called with {int} and {int}")
	public void add_is_called_with_and(Integer int1, Integer int2) {
	    result=calc.add(int1, int2);
	}

	@Then("result is {int}")
	public void result_is(Integer int1) {
	    if(result==int1)
		{
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}

@When("add is called but first number is {int}")
public void add_is_called_but_first_number_is(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	result=calc.add(1000,20);
}

@Then("Error Message should display")
public void error_Message_should_display() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	if(result==-1)
	{
		calc.getErrorMessage();
	}
	else {
	System.out.println("result is the addition of the two number: "+result);
	
}
}

@When("add is called but second number is {int}")
public void add_is_called_but_second_number_is(Integer int1) {
   result=calc.add(20, 1000);
}

@When("add is called but both numbers are {int}")
public void add_is_called_but_both_numbers_are(Integer int1) {
   result=calc.add(1000,1000);
}

@When("add is called but first is negative value")
public void add_is_called_but_first_is_negative_value() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	
	result=calc.add(0,1000);

}

@When("add is called but second is negative value")
public void add_is_called_but_second_is_negative_value() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	result=calc.add(1000,0);

}

@When("add is called and both numbers are negative")
public void add_is_called_and_both_numbers_are_negative() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
    result=calc.add(0,0);

}

@When("add is called and both numbers are double")
public void add_is_called_and_both_numbers_are_double() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	result=calc.add(10.30,10.60);

}

@When("add is called but fist number is double")
public void add_is_called_but_fist_number_is_double() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	result=calc.add(10.30,100);

    
}

@When("add is called but second number is double")
public void add_is_called_but_second_number_is_double() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
    result=calc.add(100,10.60);

}


		}






