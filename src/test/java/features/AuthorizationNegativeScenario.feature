@Authorization
Feature: Authorization

  Scenario Outline: Authorization with empty fields
    When I push in header the button Sign In
    Then I am on Authorization page
    When I fill input Email with data "<email>"
    And I fill input Password with data "<password>"
    When I push in form the button Sign In
    Then authorization failed and text "<errorMessageText>" is displayed

    Examples:
      | email             | password | errorMessageText          |
      | xavi@gmail.com    |          | Invalid email or password |
      |                   | 123456   | Invalid email or password |
      |                   |          | Invalid email or password |

  Scenario Outline: Authorization with empty fields
    When I push in header the button Sign In
    Then I am on Authorization page
    When I fill input Email with data "<email>"
    And I fill input Password with data "<password>"
    When I push in form the button Sign In
    Then authorization failed and text "<errorMessageText>" is displayed

    Examples:
      | email             | password | errorMessageText          |
      | malikexample.com  | 123456   | Invalid email or password |
      | xavi@gmail.com    | ιδιωτικός| Invalid email or password |
      | rox@example.com   | 12AB#m4  | Invalid email or password |