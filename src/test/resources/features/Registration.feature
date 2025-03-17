
@Re
Feature: Registration Feature

  @reg1
  Scenario: Verify that user is able to land on Registration Page
    Given The user is on DS Algo Home Page
    When The user should click the Registration link
    Then The user should be redirected to Registration page
    
    @reg2
 Scenario Outline: Login with different credentials
    Given I am on the Registration 
    When I Register with "<usrName>" and "<pssword>"
    Then I should see  "<expectedMessage>"
    Examples:
      | usrName                   | pssword       | pwdConfirmation         | expectedMessage                      |
      |                           |               |                         | Invalid Username and Password|
      |SeleniumSquad              |               |                         | Invalid Username and Password| 
      |SeleniumSquad              |Squad          | Squad                   | Your password must contain at least 8 characters|
      |SeleniumSquad              |Squa2025       | Squad2025               | The two password fields didn’t match.|
      |SeleniumSquad              |2025           | 2025                    | Your password can’t be entirely numeric|
      |Numpysdet84                |sdet84batch    | sdet84batch             | You are successfully registered|
     
  
