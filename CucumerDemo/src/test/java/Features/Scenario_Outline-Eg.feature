Feature: To automate Facebook application

  Scenario Outline: To login into facebook application using scenario outline <uname>
    Given the user launches the facebook application
    Then the user verifies the facebook logo
    When the user enters the <uname> in username webedit
    And the user enters the <pwd> in password webedit
    And the user clicks on login button
    Examples:
      | uname | pwd        |
      | "Tom" | "Face@123" |
      | "Jack" | "Face@321" |
      | "Tim" | "ILU@123" |
      | "David" | "Face@123" |
      | "Kal" | "Hello@123" |
      | "Mahi" | "Vig@123" |

