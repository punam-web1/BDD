Feature: User wants to provide add function for the calculator
 Background:
 Given calculator exists
 
  Scenario: Add two numbers
        When add is called with two numbers
    Then result is the addition of the two number
    
   Scenario: Add two given numbers
    Given calculator exists
    When add is called with 30 and 40
    Then result is 70
  
   Scenario: Addition
        When  add is called but first number is 1000
    Then Error Message should display
    
   Scenario: Addition
   
    When  add is called but second number is 1000
     Then Error Message should display
    
    Scenario: Addition
    When  add is called but both numbers are 1000
    Then Error Message should display
    
     Scenario: Addition
    When  add is called but first number is 0
    Then Error Message should display
    
   Scenario: Addition
    When  add is called but second number is 0
     Then Error Message should display
    
    Scenario: Addition
    When  add is called but both numbers are 0
    Then Error Message should display
    
       Scenario: Addition
   When  add is called but first is negative value
    Then Error Message should display
    
    Scenario: Additio
    When  add is called but second is negative value
    Then Error Message should display
    
    Scenario: Addition
        When  add is called and both numbers are negative
    Then Error Message should display
    
    Scenario: Addition
       When  add is called and both numbers are double
    Then Error Message should display
    
    Scenario: Addition
      When  add is called but fist number is double
    Then Error Message should display
    
    Scenario: Addition
    When  add is called but second number is double
    Then Error Message should display
    
    Scenario Outline:
    When  add is called but first number is <num>
    Then Error Message should display
    When  add is called but second number is <num>
    Then Error Message should display
     When  add is called but both numbers are <num>
     Then Error Message should display
    When  add is called but first number is <num1>
    Then Error Message should display
     When  add is called but second number is <num1>
     Then Error Message should display
      When  add is called but both numbers are <num1>
      Then Error Message should display
    Examples: search result    
| num | num1 |
| 1000 | 0 |     
    
   