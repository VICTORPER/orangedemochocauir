# language: en
# The structure, prose, and grammar of the Gherkin are created in Spanish for best practices.
# This depends heavily on our client.

@authenticationLogin
Feature: Successful Authentication

  As a Test Automation Engineer (TAE)
  I want to perform an authentication test on the website
  To ensure that the robustness and error handling of the web application work correctly

  Background:
    Given "Victor" opens the test website

  @authenticationSuccess
  Scenario: Successful user authentication.
    When he enters the credentials
    Then he will see the home page and waits for validation