@Re
Feature: Registration Feature

  @reg1
  Scenario: Verify that the user is able to land on the Registration Page
    Given The user is on the DS Algo Home Page
    When The user clicks the Registration link
    Then The user should be redirected to the Registration page

  @reg2
  Scenario Outline: Login with different credentials
    Given The user is on the Registration page
    When The user registers with "<SheetName>" and <RowNumber>
    Then The user should see "<SheetName>" at row <RowNumber>

    Examples:
      | SheetName     | RowNumber |
      | registration  | 0        |
      | registration  | 1        |
      | registration  | 2        |
      | registration  | 3        |
      | registration  | 4        |

  @reg1
  Scenario Outline: Verify that the user is able to land on the Home page after entering valid username and password
    Given The user is on the Registration page
    When The user registers with "<SheetName>" and row <RowNumber>
    Then The user should see "<SheetName>" at row <RowNumber>

    Examples:
      | SheetName        | RowNumber |
      | registration     | 5        |
