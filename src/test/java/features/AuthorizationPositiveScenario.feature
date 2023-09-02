@Authorization
Feature: Authorization

  Scenario Outline: Success Authorization
    When I push in header the button Sign In
    Then I am on Authorization page
    When I fill input Email with data "<email>"
    And I fill input Password with data "<password>"
    When I push in form the button Sign In
    Then I am on the Home page "<welcomeSectionText>"

    Examples:
      | email             | password | welcomeSectionText |
      | xavi@gmail.com    | 123456   | As a teacher       |
      | malik@example.com | 123456   | As a student       |

  Scenario: Recover Password
    When I push in header the button Sign In
    Then I am on Authorization page
    When I click link Forgot password
    Then I am on the Forgot password page

  Scenario: Password invisibility
    When I push in header the button Sign In
    Then I am on Authorization page
    When I fill input Password with data "123456"
    Then Password field displays masked characters

  Scenario: Password visibility
    When I push in header the button Sign In
    Then I am on Authorization page
    When I fill input Password with data "123456"
    And I click on eye-crossed icon
    Then Password field displays not masked characters

  Scenario: The ability to copy is disabled for hidden password
    When I push in header the button Sign In
    Then I am on Authorization page
    Then I check if ability to copy is disabled

  Scenario: The ability to cut is disabled for hidden password
    When I push in header the button Sign In
    Then I am on Authorization page
    Then I check if ability to cut is disabled

  Scenario: Button Sign Up in Authorization Form is enabled
    When I push in header the button Sign In
    Then I am on Authorization page
    And I push in form the button Sign Up