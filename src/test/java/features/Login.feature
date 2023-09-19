@test
Feature: User login to his account
  Scenario: User can login with valid data
    Given User open login page
    When Enter valid "teest" and "123456789"
    And Click on login button
    Then The user will be redirected to the account page
    And User logout