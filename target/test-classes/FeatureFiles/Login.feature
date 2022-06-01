Feature: To validate the Login Functionality in Facebook Application
Scenario: To validate the login using invalid username and password
Given User is in the facebook login page
When User enter the invalid username and invalid password
And User click the login button
Then User must be in the invalid credentials page