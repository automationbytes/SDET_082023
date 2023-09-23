Feature: NOP Admin Demo using Page Object model

  Scenario Outline: Login the NOP Admin site with <username>
    Given the user launches the NOPAdmin url
    Then the user verifies the header text
    When the user enters <username> in email webEdit
    When the user enters <passwrd> in password webEdit
    Then the user clicks on login button
    Then the user verifies the homePage logo
    And the user logouts the application
    Examples:
      | username     | passwrd      |
      | "admin@yourstore.com" | "admin" |
      | "Vignesh@yourstore.com" | "admin" |

