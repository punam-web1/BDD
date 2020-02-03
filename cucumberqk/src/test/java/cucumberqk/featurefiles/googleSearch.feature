Feature: Google Searching
  As a web surfer, I want to search Google, so that I can learn new things.
  Background:
  Given a web browser is on the Google page
  Scenario: Simple Google searc
    When the search phrase "cpaat" is entered
    Then results for "cpaat" are shown
    
     Scenario: Simple Google search
    When the search phrase "qualityKiosk" is entered
    Then results for "qualityKiosk" are shown
    
     Scenario: Simple Google search
    When the search phrase "cucumber" is entered
    Then results for "cucumber" are shown
    
     Scenario Outline:Simple Google Search
     
     When the search phrase "<phrase>" is entered
     Then result for "<result>" are shown
     
     Examples: search results
      | phrase | result |
      | cpaat | cp-aat |
      | qualityKiosk | qualityKiosk |
      | cucumber | cucumber |