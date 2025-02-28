Feature: Linked List Data Structure

  Scenario: User navigates to the Linked List page
    Given the user is on the Home page after signing in
    When the user clicks the "Get Started" button in the Linked List panel
    Then the user should be directed to the "Linked List" Data Structure page

  Scenario: User navigates to the Introduction page
    Given the user is on the "Linked List" page after signing in
    When the user clicks the "Introduction" button
    Then the user should be redirected to the "Introduction" page

  Scenario: User accesses the Try Editor on the Introduction page
    Given the user is on the "Introduction" page
    When the user clicks the "Try Here" button in the Introduction page
    Then the user should be redirected to a page containing a "Try Editor" with a "Run" button to test

  Scenario: User receives an error when clicking Run without entering code
    Given the user is in the Try Editor page
    When the user clicks the "Run" button without entering any code in the editor
    Then the user should see an error message in an alert window

  Scenario: User receives an error for invalid Python code
    Given the user is in the Try Editor page
    When the user writes invalid code in the editor and clicks the "Run" button
    Then the user should see an error message in an alert window

  Scenario: User executes valid Python code successfully
    Given the user is in the Try Editor page
    When the user writes valid Python code in the editor and clicks the "Run" button
    Then the user should see the output in the console
