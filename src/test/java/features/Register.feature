@test
Feature: The user is able to register an account
  Scenario: The user should fill in all fields
    Given User open register page
    When The user fills in all fields with valid data
    And Click register button
    Then User made new account successfully