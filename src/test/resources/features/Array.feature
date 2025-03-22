@ar
Feature: Array feature

  Background:
   Given The user sign in to dsAlgo Portal
   
 @ar1
  Scenario: Verify that user is able to navigate to "Array page"
   Given The user is in the Home page after signin
   When The user should click the "Get Started" button of the Array panel
   Then The user should land in Array Page
   
 @ar2
 Scenario: Navigate to "Arrays in Python" Page
   Given The user is on the Array page after Signin
   When The user clicks Arrays in Python button
   Then The user should be redirected to Arrays in Python page

 @ar3
  Scenario: Navigate to "Try Editor" in Arrays in Python
   Given The user is on the Arrays in Python page
   When The user clicks "Try Here" button in Arrays in Python page
   Then The user should be redirected to a page having a Try Editor with a Run button
   
 @ar4
 Scenario Outline: Error when clicking Run without code in "Arrays in Python"
   Given The user is in the Try Editor page of Arrays in Python
   When The user clicks the "Run" Button without entering code 
   Then The user should see an error message in an alert window of Try editor based on "<SheetName>" at row <RowNumber>
    
     Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  3        |
      
 @ar5
 Scenario Outline: Error for invalid Python code in "Arrays in Python"
   Given The user is in the Try Editor page of Arrays in Python
   When The user writes invalid "name" code in the Editor and clicks the Run Button
   Then The user should see an name error message in an alert window of Try editor based on "<SheetName>" at row <RowNumber>
   
   Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  1        |
  
   @ar6
 Scenario Outline: Error for invalid Python code in "Arrays in Python"
   Given The user is in the Try Editor page of Arrays in Python
   When The user writes invalid "Syntax" code in the Editor and clicks the Run Button
   Then User should see a Syntax Error message in an alert window "<SheetName>" at row <RowNumber> 
   
   Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  2        |
      
  @ar7
 Scenario Outline: Verify for valid Python code in "Arrays in Python"
   Given The user is in the Try Editor page of Arrays in Python
    When The user write the "valid" code in Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button
    Then The user write the valid code in Editorform "<SheetName>" at row <RowNumber>   
   
   Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |    0      |
      
   @ar8
 Scenario: Navigate to "Arrays using List" Page
   Given The user is on the Array page after Signin
   When The user clicks Arrays using List button
   Then The user should be redirected to Arrays using List page
  
   
  @ar9
 Scenario: Navigate to "Basic Operations in Lists" Page
   Given The user is on the Array page after Signin
   When The user clicks Basic Operations in Lists button
   Then The user should be redirected to Basic Operations in Lists page
  
  @ar10
    Scenario: Navigate to "Applications of Array" Page
   Given The user is on the Array page after Signin
   When The user clicks Applications of Array button
   Then The user should be redirected to Applications of Array page
       
 @ar11
  Scenario: Navigate to "Practice Questions" in "Arrays in Python"
   Given The user is on the "Arrays in Python" page
   When User clicks "Practice Questions" button
   Then User should be redirected to "Practice" page
    
 @ar12
  Scenario: Navigate to "Search the Array" question
   Given The user is on the "practice" question editor
   When The user clicks the "Search the Array" link
   Then The user should be redirected to a question page with a Try Editor
    
  @ar13
  Scenario Outline: : Error for invalid code in "Search the Array"
   Given The user is on the "practice" question editor
   When The user write the Syntax Error code in Editor and Click the Run Button "<SheetName>" at row <RowNumber> 
   Then User should see a "Syntax Error" message in an alert window "<SheetName>" at row <RowNumber> 
    Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  2        |
      
   @ar14
  Scenario Outline: : Error for invalid name code in "Search the Array"
   Given The user is on the "practice" question editor
   When The user write the name Error code in Editor and Click the Run Button "<SheetName>" at row <RowNumber> 
   Then User should see a "Name Error" message in an alert window "<SheetName>" at row <RowNumber> 
    Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  1        |
      
   @ar15
  Scenario Outline: : Error for invalid code in "Search the Array"
   Given The user is on the "practice" question editor
   When The user write the invalid code in Editor and Click the Submit Button "<SheetName>" at row <RowNumber> 
   Then On Submit User should see a "Error" message in an alert window "<SheetName>" at row <RowNumber> 
    Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  4        |
   
  @ar16
  Scenario Outline: Successful execution of valid code in "Search the Array"
   Given The user is on the practice question editor
   When The user writes valid code in the Editor and clicks the Run Button "<SheetName>" at row <RowNumber> 
   Then The user should see the correct output in the console based on "<SheetName>" at row <RowNumber>
   Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  6        |
   
   
   
   
   @ar17
  Scenario: Navigate to "Try Editor" in  "Arrays using List"
   Given The user is on the  "Arrays using List" page
   When The user clicks "Try Here" button in  "Arrays using List" page
   Then The user should be redirected to a page having a Try Editor with a Run button
   
   
 @ar18
 Scenario Outline: Error when running without code in Try editor Arrays using List
   Given The user is in the Try Editor page of  Arrays using List
   When The user clicks the "Run" button without entering code "<SheetName>" at row <RowNumber>
   Then The user should see an error message in an alert window of Try editor for Arrays using List based on "<SheetName>" at row <RowNumber>
    
     Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  3        |
      
 @ar19
 Scenario Outline: Error for invalid Python code in Arrays using List
   Given The user is in the Try Editor page of  Arrays using List
   When The user enters invalid name code in the Editor under Arrays using List and clicks the Run button
   Then The user should see an name error message in an alert window under Arrays using List of Try editor based on "<SheetName>" at row <RowNumber>
   
   Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  1        |
  
   @ar20
 Scenario Outline: Error for invalid Python code in Arrays using List
   Given The user is in the Try Editor page of  Arrays using List
   When The user writes invalid Syntax code in the Editor under Arrays using List and clicks the Run Button
   Then User should see a Syntax Error message in an alert window under Arrays using List based on  "<SheetName>" at row <RowNumber> 
   
   Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  2        |
      
  @ar21
 Scenario Outline: Verify for valid Python code in Arrays using List
   Given The user is in the Try Editor page of  Arrays using List
    When The user write the "valid" code in Editor under Arrays using List, then clicks the Run Button
    Then The user write the valid code in Editor form in Arrays using List based on"<SheetName>" at row <RowNumber>   
   
   Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |    0      |
      
   
  
