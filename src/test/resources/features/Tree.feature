@TS
Feature: Tree feature

  Background: 
    Given The user sign in to dsAlgo Portal

  @tag1
   Scenario: Verify that user is able to navigate to Tree page
    Given The user is in the Homepage after sign in
    When The user clicks the GetStarted button in Tree Panel
    Then The user is navigate to Tree Page

  @tag2TreeNavigation...no
  Scenario: Verify that user is able to navigate to Over View of Tree page
    Given The user is land  to  Tree Page
    When The user clicks Over View of Trees button
    Then The user should be redirected to the Over View of Tree page

  @tag3TryEditorNavigation
  Scenario: Verify that user is able to navigate to "Try Here" page for "Over View of Tree"
    Given The user is on the Over View of Tree page
    When The user clicks the "Try Here" button on the Over View of Tree page
    Then The user should be redirected to a page having a try editor with a Run button to test

  @tag4EmptyCodeExecution
  Scenario Outline: Verify that user receives an error when clicking Run button without entering code
    Given The user is in the try editor page of "Over View of Tree"
    When The user clicks the Run button without entering any code for over view of tree
    Then The user should able to see  an error message in alert window based on "<SheetName>" at row <RowNumber> for  over view of tree

 Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  3        |

  @tag5InvalidCodeExecution
  Scenario Outline: Verify that user receives a NameError for invalid Python code
    Given The user is landing on  the try editor page of "Over View of Tree"
    When The user writes the invalid name code in the Editor from "<SheetName>" at row <RowNumber> then clicks at Run button  for over view of tree
    Then The user should see a NameError message in the alert window based on "<SheetName>" at row <RowNumber> for over view of tree

 Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  1       |
  
  @tag6SyntaxErrorExecution
  Scenario Outline: Verify that user receives a SyntaxError for invalid Python code
    Given The user is landing on  the try editor page of "Over View of Tree"
    When The user write the invalid syntaxcode in Editor from "<SheetName>" at row <RowNumber> then clicks the Run button  overview of tree
    Then The user should able to see an syntax error message in alert window based on "<SheetName>" at row <RowNumber>  overview of tree
    
     Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  2        |

  @tag7ValidCodeExecution
  Scenario Outline: Verify that user is able to see the output for valid Python code
    Given The user is landing on  the try editor page of "Over View of Tree"
    When The user write the valid code in Editorfrom "<SheetName>" at row <RowNumber> then clicks theRun Button for OverviewofTree 
    Then The user should able to see output in the console based on "<SheetName>" at row <RowNumber> for OverviewofTree
    
     Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |    0      |

  @tag8TerminologiesPageNavigation 
  Scenario: Verify that the user can navigate to the "Terminologies" page
    Given The user is in the Tree page after sign in
    When The user clicks the "Terminologies" button on the Tree page
    Then The user should be redirected to the "Terminologies" page

  @tag9TryHereNavigationONTerminologoiesPage
  Scenario: Verify that the user can navigate to the "Try Here" page from the Terminologies page
    Given The user is on the Terminologies page
    When The user clicks the "Try Here" button on the "Terminologies" page
    Then The user should be redirected to a page with a Try Editor

  @tag10EmptyCodeExecution
  Scenario Outline: Verify that the user receives an error when clicking the Run button without entering code
    Given The user is on the "Try Editor" page from the "Terminologies" page
     When The user clicks the Run button without entering any code for Treminologies page
    Then The user should able to see  an error message in alert window based on "<SheetName>" at row <RowNumber> for  over view of tree

 Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  3        |
      
  @tag11InvalidCodeExecution
  Scenario Outline: Verify that the user receives a Error when executing invalid Python code
    Given the user should on "Try Editor" page from the "Terminologies" page
    When the user writes the invalid namecode in the Editor from "<SheetName>" at row <RowNumber> then clicks at Run button  for over view of tree
    Then The user should see a NameError message in the alert window based on "<SheetName>" at row <RowNumber> for over view of tree

 Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  1       |
   
  @tag12SyntaxErrorExecution
  Scenario Outline: Verify that the user receives a SyntaxError when executing Python code with syntax errors
    Given the user should on "Try Editor" page from the "Terminologies" page
    When The user write the invalid syntaxcode in Editor from "<SheetName>" at row <RowNumber> then clicks the Run button  overview of tree
    Then The user should able to see an syntax error message in alert window based on "<SheetName>" at row <RowNumber>  overview of tree
    
     Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  2        |
 
  @tag13ValidCodeExecution
  Scenario Outline: Verify that user is able to see the output for valid Python code
    Given the user should on "Try Editor" page from the "Terminologies" page
     When The user write the valid code in Editorfrom "<SheetName>" at row <RowNumber> then clicks theRun Button for OverviewofTree 
     Then The user should able to see output in the console based on "<SheetName>" at row <RowNumber> for OverviewofTree
    
     Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |    0      |

  @tag14TreeNavigation..No
  Scenario: Verify that the user is able to navigate to the "Types of Trees" page
    Given The user is in the Tree page after sign in
    When The user clicks the Types of Trees button
    Then The user should be landing on  the Types of Trees page

  @tag15TryHereNavigation
  Scenario: Verify that the user is able to navigate to the "Try Here" page from the "Types of Trees" page
    Given The user is on the Types of Trees page
    When The user clicks the Try Here button on the "Types of Trees" page
    Then The user should be landing on Try Editor Page 


 @tag16EmptyCodeExecution
  Scenario Outline: Verify that the user receives an error when clicking the Run button without entering code
    Given The user should be  redirected on Try Editor Page
     When The user clicks the Run button without entering any code for Types of Tree page
    Then The user should able to see  an error message in alert window based on "<SheetName>" at row <RowNumber> for Types of Tree Page 

 Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  3        |
      
@tag17InvalidCodeExecution
  Scenario Outline: Verify that the user receives a Error when executing invalid Python code
    Given The user should be  redirected on Try Editor Page
    When the user writes the invalid namecode in the Editor from "<SheetName>" at row <RowNumber> then clicks at Run button  for over view of tree
    Then The user should able to see  an error message in alert window based on "<SheetName>" at row <RowNumber> for Types of Tree Page

 Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  1       |
      
      
@tag18SyntaxErrorExecution
  Scenario Outline: Verify that user receives a SyntaxError for invalid Python code
    Given The user should be  redirected on Try Editor Page
    When The user write the invalid syntaxcode in Editor from "<SheetName>" at row <RowNumber> then clicks the Run button  Types of Tree Page
    Then The user should able to see an syntax error message in alert window based on "<SheetName>" at row <RowNumber>  Types of Tree
    
     Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  2        |
          
@tag19ValidCodeExecution
  Scenario Outline: Verify that user is able to see the output for valid Python code
    Given The user should be  redirected on Try Editor Page
    When The user write the valid code in Editorfrom "<SheetName>" at row <RowNumber> then clicks theRun Button for "OverviewofTree" Page
    Then The user should able to see output in the console based on "<SheetName>" at row <RowNumber> for OverviewofTree
    
     Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |    0      |
    
@tag20TryHereNavigation
  Scenario: Verify that the user is able to navigate to the "Try Here" page from the "Tree Traversals" page
    Given The user is on the Tree Traversals page
    When The user clicks the Try Here button on the Tree Traversals page
    Then The user should be redirected to a page with a Try Editor

