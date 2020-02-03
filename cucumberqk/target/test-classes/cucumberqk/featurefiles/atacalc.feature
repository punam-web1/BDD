Feature: compare
  As a web surfer, I want to search ATA Super Smart Calculator, so that I can learn new things.
  Background:
  Given a web browser on the Google page and we search the given url
  Scenario: Simple Google search
    When comparesion is called with two numbers the numbers are 10 and 20
    Then results is greatest number i.e 20

    
    Scenario Outline:
    When comparesion is called with two numbers the numbers are <num> and <numc>
    Then results is greatest number i.e <result>
    
    Examples:
    | num | numc | result |
    | 50 | 30| 50 |
    | 1 | 3 | 3 |
    | -1 | -4 | -1 |
    
    