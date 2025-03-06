#
#@tag
#Feature: Registration
  #I want to use this template for my feature file
#
  #@tag1
#
#		Scenario: Verify error message for empty Password field during registration
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering a Username but leaving other fields empty
#		Then an error message "Please fill out this field." should appear below the Password textbox
#
#
  #@tag2
  #	Scenario: Verify error message for empty Password Confirmation field during registration
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering Password and Password Confirmation fields empty
#		Then an error message "Please fill out this field." should appear below the Password Confirmation textbox
#
#	@tag3
#		Scenario: Verify error message for invalid username field during registration
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering a username with spacebar characters or other than digits and @/./+/-/_
#		Then the user should see an error message for invalid data
#
#	@tag4
#		Scenario: Verify error message for invalid password field during registration
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering a password with numeric data
#		Then the user should see an error message for entering invalid data
#
#	@tag5
#		Scenario: Verify error message for mismatched Password and Password Confirmation fields
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering different passwords in Password and Password Confirmation fields
#		Then the user should see a password warning message "password_mismatch: The two password fields didn’t match."
#
#	@tag6
#		Scenario: Verify error message for user ID exceeding 150 characters
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering more than 150 characters in the user ID field
#		Then the user should be redirected to the Home Page of DS Algo with a message "Maximum length of the user id should not be more than 150 characters."
#	@tag7
#		Scenario: Verify error message for entering a common password
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering a commonly used password
#		Then the user should be redirected to the Home Page of DS Algo with a message "Please enter a valid password."
#	@tag8
#		Scenario: Verify error message for entering a password less than 8 characters
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering a password with fewer than 8 characters
#		Then the user should be redirected to the Home Page of DS Algo with a message "Please enter a password with a minimum of 8 characters."
#	@tag9
#		Scenario: Verify error message for entering only numeric passwords
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering only numeric values as the password
#		Then the user should be redirected to the Home Page of DS Algo with a message "Please enter an alphanumeric password."
#	@tag10
#		Scenario: Verify successful registration and landing on the homepage
#		Given the user is on the user registration page
#		When the user clicks the Register button after entering a valid username, password, and password confirmation
#		Then the user should be redirected to the Home Page of DS Algo with a message "New Account Created. You are logged in as <ID>"
#
#
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
