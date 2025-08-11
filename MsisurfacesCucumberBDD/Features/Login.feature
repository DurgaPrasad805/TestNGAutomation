#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions 
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: OrangeHRM Login Homepage
  I want to use this feature file to validate all the scenarios realted to OrangeHRM website features

  Background: Initialize all the pages
    Given Initialize all the page objects

  @Sanity
  Scenario: Verify OrangeHrm Homepage is displayed
    Given Launch the application
    Then Verify OrangeHrm Homepage is displayed successfully

  @Sanity @Regression
  Scenario: Verify OrangeHrm LoginPage is displayed
    Given Launch the application
    Then Verify OrangeHrm Homepage is displayed successfully 
    Then Verify OrangeHRM Loginpage is displayed successfully
    And Verify Username field is displayed is succesfully
