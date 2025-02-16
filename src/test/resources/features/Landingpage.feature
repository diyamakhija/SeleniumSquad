@tag
Feature: DS Algo Portal

  @tag1
  Scenario: Verify that user is able to navigate to "Tree" data structure page
    Given The user is in the "Home" page after Sign in
    When the user clicks the "Get Started" button in the Tree Panel
    Then The user is directed to "Tree" Data Structure Page

    @tag2
    
    Scenario:Verify that user receives error message for all empty fields during Login
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after leaving the "Username" textbox and "Password" textbox empty
    Then The error message "Please fill out this field." appears below Username textbox
    
    @tag3
    Scenario: Verify that user receives error message for empty Password field during Login
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering the "Username" and leaves "Password" textbox empty
    Then The error message "Please fill out this field." appears below Password textbox
    
     @tag4
    Scenario:Verify that user receives error message for empty Username field during Login
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering the Password only
    Then The error message "Please fill out this field." appears below Username textbox
    
    @tag5
    Scenario:Verify that user receives error message for invalid Username field during Login
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering invalid username and valid password
    Then The user should able to see an error message "Invalid username and password".
    
     @tag6
    Scenario:Verify that user able to land on Home page after entering valid Username and Password fields
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering valid username and valid password
    Then The user should land in Data Structure Home Page with message "You are logged in"
    
     @tag7
    Scenario:Remember Me Functionality
    Given the user is on the login page 
    When the user enters valid credentials and checks the "Remember Me" option
    Then the user should remain logged in
    

    
     @tag8
    Scenario:Verify that user able to sign out successfully
    Given The user is in the Home page after Sign in
    When The user clicks "Sign out" 
    Then The user should be redirected to home page with message "Logged out successfully"