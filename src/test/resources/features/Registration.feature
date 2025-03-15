
@Re
Feature: Registration Feature

  @reg
  Scenario: Verify that user is able to land on Registration Page
    Given The user is on DS Algo Home Page
    When The user should click the Registration link
    Then The user should be redirected to Registration page
    
    #@tag2
 #Scenario Outline: Login with different credentials
    #Given I am on the Registration 
    #When I login with "<userName>"  and "<password>"
    #Then I should see the message "<message>"
    #Examples:
      #| userName                   | password      | message               |
      #|                            |               | Invalid Username and Password|
      #|SeleniumSquad               |               | Invalid Username and Password| 
      #|                            |Squad2025      | Invalid Username and Password |
      #|SeleniumSquad               |12345          | Invalid Username and Password|
     
     
    #@re1
#		Scenario: Verify error message for empty Password field during registration
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering a Username but leaving other fields empty
#		Then an error message "Please fill out this field." should appear below the Password textbox
#
  #@re2
  #	Scenario: Verify error message for empty Password Confirmation field during registration
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering Password and Password Confirmation fields empty
#		Then an error message "Please fill out this field." should appear below the Password Confirmation textbox
#
#	@re3
#		Scenario: Verify error message for invalid username field during registration
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering a username with spacebar characters or other than digits
#		Then the user should see an error message for invalid data
#
#	@re4
#		Scenario: Verify error message for invalid password field during registration
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering a password with numeric data
#		Then the user should see an error message for entering invalid data
#
#	@re5
#		Scenario: Verify error message for mismatched Password and Password Confirmation fields
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering different passwords in Password and Password Confirmation fields
#		Then the user should see a password warning message "password_mismatch: The two password fields didn’t match."
#
#	@re6
#		Scenario: Verify error message for user ID exceeding 150 characters
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering more than 150 characters in the user ID field
#		Then the user should be redirected to the Home Page of DS Algo with a message "Maximum length of the user id should not be more than 150 characters."
#	@re7
#		Scenario: Verify error message for entering a common password
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering a commonly used password
#		Then the user should be redirected to the Home Page of DS Algo with a message "Please enter a valid password."
#	
#	@re8
#		Scenario: Verify error message for entering a password less than 8 characters
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering a password with fewer than 8 characters
#		Then the user should be redirected to the Home Page of DS Algo with a message "Please enter a password with a minimum of 8 characters."
#	
#	@re9
#		Scenario: Verify error message for entering only numeric passwords
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering only numeric values as the password
#		Then the user should be redirected to the Home Page of DS Algo with a message "Please enter an alphanumeric password."
#	