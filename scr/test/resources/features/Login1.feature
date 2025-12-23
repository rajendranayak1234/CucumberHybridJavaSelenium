Feature: Login functionality

Scenario: Login with Valid credentials
  Given user navigates to login page
  When user enters valid email address "rajendranayak3096@gmail.com" into email field
  And user enters valid password "rajendra@123" into password field
  And user clicks on login button
  Then user should get successfully logged in