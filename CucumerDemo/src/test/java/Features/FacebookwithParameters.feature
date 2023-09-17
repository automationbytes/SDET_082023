Feature: To automate Facebook application

  Scenario: To login into facebook application

    Given the user launches the facebook application
    Then the user verifies the facebook logo
    When the user enters the "Tom" in username webedit
    And the user enters the "Face@123" in password webedit
    And the user clicks on login button
