$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/cucumberqk/featurefiles/atacalc.feature");
formatter.feature({
  "name": "compare",
  "description": "  As a web surfer, I want to search ATA Super Smart Calculator, so that I can learn new things.",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a web browser on the Google page and we search the given url",
  "keyword": "Given "
});
formatter.match({
  "location": "CompareSteps.a_web_browser_on_the_Google_page_and_we_search_the_given_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Simple Google search",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "comparesion is called with two numbers the numbers are 10 and 20",
  "keyword": "When "
});
formatter.match({
  "location": "CompareSteps.comparesion_is_called_with_two_numbers_the_numbers_are_and(Integer,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results is greatest number i.e 20",
  "keyword": "Then "
});
formatter.match({
  "location": "CompareSteps.results_is_greatest_number_i_e(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "comparesion is called with two numbers the numbers are \u003cnum\u003e and \u003cnumc\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "results is greatest number i.e \u003cresult\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "num",
        "numc",
        "result"
      ]
    },
    {
      "cells": [
        "50",
        "30",
        "50"
      ]
    },
    {
      "cells": [
        "1",
        "3",
        "3"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a web browser on the Google page and we search the given url",
  "keyword": "Given "
});
formatter.match({
  "location": "CompareSteps.a_web_browser_on_the_Google_page_and_we_search_the_given_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "comparesion is called with two numbers the numbers are 50 and 30",
  "keyword": "When "
});
formatter.match({
  "location": "CompareSteps.comparesion_is_called_with_two_numbers_the_numbers_are_and(Integer,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results is greatest number i.e 50",
  "keyword": "Then "
});
formatter.match({
  "location": "CompareSteps.results_is_greatest_number_i_e(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a web browser on the Google page and we search the given url",
  "keyword": "Given "
});
formatter.match({
  "location": "CompareSteps.a_web_browser_on_the_Google_page_and_we_search_the_given_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "comparesion is called with two numbers the numbers are 1 and 3",
  "keyword": "When "
});
formatter.match({
  "location": "CompareSteps.comparesion_is_called_with_two_numbers_the_numbers_are_and(Integer,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results is greatest number i.e 3",
  "keyword": "Then "
});
formatter.match({
  "location": "CompareSteps.results_is_greatest_number_i_e(Integer)"
});
formatter.result({
  "status": "passed"
});
});