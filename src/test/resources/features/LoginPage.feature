@LP
Feature: Login Feature

  #@tag1
  #Scenario: Verify that user is able to land on Login Page
    #Given The user is on the DS Algo Home Page
    #When The user should click the Sign in link
    #Then The user should be redirected to Sign in page
      
      
      @tag2
Scenario Outline: Login with different credentials
    Given I am on the Loginpage
    When I login with "<sheetName>" and <rowNumber>
    Then I should see the message "<expectedmessage>"

Examples:
    | sheetName          | rowNumber |
    | userCredentials    | 0         | 
    | userCredentials    | 1         |
    | userCredentials    | 2         |
    | userCredentials    | 3         | 
      
 