Feature: Portal Login
#  Background:
#    Given Browser should be invoked
#    When User navigates to portal

  @WebTest
  Scenario: Test for Active Users Home page
    Given User is on landing page
    When User logins with "username" and "password"
    Then User should land on Home page
    And User account should be "active"

  @AndroidTest
  Scenario: Test for Inactive Users Home page
    Given User is on landing page
    When User logins with "username2" and "password2"
    Then User should land on Home page
    And User account should be "inactive"

  @iOSTest
  Scenario: Test for sign up
    Given User is on landing page
    When User sign up with following details
    |john|walker|john.walker@gmail.com|India|Bangalore|
    Then User should land on Home page

  @RegressionTest
  Scenario Outline: Test for multiple user logins
    Given User is on landing page
    When User logins with <username> and <password>
    Then User should land on Home page
    And User account should be <status>
  Examples:
    |username|password|status|
    |john    |wick    |active|
    |james   |bond    |inactive|