Feature: This feature is  going to add employees in HRMS application

  @addEmployee
  Scenario Outline: Adding employee from cucumber feature file
    When user enters valid admin username and password
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option
    When user enter "<firstName>" , "<middleName>" and "<lastName>"
    And user clicks on save button
    Then employee added successfully
    Examples:
      | firstName | middleName | lastName |
      | Henry     | John       | Miller   |
