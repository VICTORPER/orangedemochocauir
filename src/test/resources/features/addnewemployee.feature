# language: en
# The structure, prose, and grammar of the Gherkin are created in Spanish for best practices.
# This depends heavily on our client.

@addEmployee
Feature: Successful Authentication

  As a Test Automation Engineer (TAE)
  I want to perform an authentication test on the website
  To ensure that the robustness and error handling of the web application work correctly

  Background:
    Given "Victor" opens the test website
    And he enters the credentials

  @addemployeesuccess
  Scenario: Add New Employee.
  When I select the "Recruitment" option
  And fill out the first page of the form
  And I select the "add" Button
  And Fill out the second page of the form
  Then the new employee will be added