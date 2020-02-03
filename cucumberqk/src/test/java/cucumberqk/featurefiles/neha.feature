Feature: Compare two numbers

Scenario: Compare two numbers
    Given a web browser is on the ATA page
    When compare is called with 23 and 56
    Then compare result is 56
    
Scenario Outline: Compare should throw error if invalid numbers are entered
	Given a web browser is on the ATA page
	When compare is called with <number1> and <number2>
	Then error is "<errorMessage>"
	
	Examples: Compare data test
	|number1|number2|errorMessage|
    |30.3|30.9|First Number is not a Valid Number.|
    |30.3|888|First Number is not a Valid Number.|
    |777|30.9|Second Number is not a Valid Number.|
    |1000|1000|'1000' is not a valid number, should be less than 1000.|
    |1000|30|'1000' is not a valid number, should be less than 1000.|
    |30|1000|'1001' is not a valid number, should be less than 1000.|
    |-7|-3|both Numbers are not a Valid Number.|
    |-1|30|First Number is not a Valid Number.|
    |30|-63|second Number is not a Valid Number.|
	