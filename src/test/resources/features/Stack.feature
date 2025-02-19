
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Verify that user is able to navigate to "Stack" page
Given The user is on the Home page after logging in
When The user clicks the "Get Started" button of the "Stack" in the Data Structure page
Then The user should be navigated to the "Stack" page
    

  @tag2
  Scenario: Verify that user is able to navigate to "Operation in Stack" page
Given The user is in the "Stack" page
When The user clicks the "Operations in Stack" button
Then The user should be navigated to the "Operation in Stack" page
   
    
    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
