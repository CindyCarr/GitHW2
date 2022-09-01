Feature: Login Feature

  @login
  Scenario: Login Functionality

    When user enters user name and password
    And  user clicking the login button
    Then user is able to log ined in and see the message "Welcome Admin"