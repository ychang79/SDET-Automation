#each feature contain one feature
#feature uses Gherkin language


Feature: Test login functionality

Scenario: login with correct username and password

Given user is on login page
When user enter correct username and password
Then user gets confirmation