#language:en
Feature: Open a web page

  As Victor
  I want to test the list of elements and subFunctions
  To verify the robustness and error handling of the application or website

  @successful
  Scenario: Open WebSite
    Given "Victor" opens the test website
    When he enters the web browser
    Then he will see the page title "cucumber"