@ar
Feature: Array feature

  Background:
   Given The user sign in to dsAlgo Portal
   
 @ar1
  Scenario: Verify that user is able to navigate to Array page
   Given The user is in the Home page after signin
   When The user should click the Get Started button of the Array panel
   Then The user should land in Array Page
   
 @ar2NavigateToArraysInPython
 Scenario: Navigate to Arrays in Python Page
   Given The user is on the Array page after Signin
   When The user clicks Arrays in Python button
   Then The user should be redirected to Arrays in Python page

 @ar3ClicksTryHere
  Scenario: Navigate to Try Editor in Arrays in Python
   Given The user is on the Arrays in Python page
   When The user clicks Try Here button in Arrays in Python page
   Then The user should be redirected to a page having a Try Editor with a Run button
   
 @ar4RunWithoutCode
 Scenario Outline: Verify that user receives an error when clicking Run button without entering code
   Given The user is in the Try Editor page of Arrays in Python
    When The user clicks the Run button without entering any code for Arrays in Python
   Then The user should see an error message in an alert window of Try editor based on "<SheetName>" at row <RowNumber> for Arrays in Python
    
     Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  3        |
      
 @ar5InvalidNameCode
 Scenario Outline: Error for invalid Name code in Arrays in Python
   Given The user is in the Try Editor page of Arrays in Python
   When The user writes the invalid Name code in the Editor from "<SheetName>" at row <RowNumber> then clicks at Run button
   Then The user should see Name Error message in an alert window of Try editor based on "<SheetName>" at row <RowNumber> for Arrays in Python
   
   Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  1        |
  
   @ar6InvalidSyntaxCode
 Scenario Outline: Error for invalid Syntax code in Arrays in Python
   Given The user is in the Try Editor page of Arrays in Python
   When The user writes the invalid Syntax code in the Editor from "<SheetName>" at row <RowNumber> then clicks at Run button
   Then The user should see Syntax Error message in an alert window of Try editor based on "<SheetName>" at row <RowNumber> for Arrays in Python
   
   Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  2        |
      
  @ar7validcode
 Scenario Outline: Verify for valid Python code in Arrays in Python
   Given The user is in the Try Editor page of Arrays in Python
    When The user write the valid code in Editor from "<SheetName>" at row <RowNumber> , then clicks the Run button
    Then The user write the valid code in Editorform "<SheetName>" at row <RowNumber>   
   
   Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |    0      |
      
   @ar8NavigateToArraysUsingList
 Scenario: Navigate to Arrays using List Page
   Given The user is on the Array page after Signin
   When The user clicks Arrays using List button
   Then The user should be redirected to Arrays using List page
  
   
  @ar9NavigateToBasicOperationsInLists
 Scenario: Navigate to Basic Operations in Lists Page
   Given The user is on the Array page after Signin
   When The user clicks Basic Operations in Lists button
   Then The user should be redirected to Basic Operations in Lists page
  
  @ar10NavigateToApplicationsOfArray
    Scenario: Navigate to "Applications of Array" Page
   Given The user is on the Array page after Signin
   When The user clicks Applications of Array button
   Then The user should be redirected to Applications of Array page
       
 @ar11NavigateToPracticeQuestions
  Scenario: Navigate to Practice Questions in "Arrays in Python"
   Given The user is on the Arrays in Python page
   When User clicks Practice Questions button
   Then User should be redirected to Practice page
    
 @ar12NavigateToSearchTheArray
  Scenario: Navigate to Search the Array question
   Given The user is on the practice question editor
   When The user clicks the Search the Array link
   Then The user should be redirected to a question page
    
  @ar13InvalidSyntaxCodeSearchTheArray
  Scenario Outline: : Error for invalid code in "Search the Array"
   Given The user is on the  Search the Array question link
   When The user write the Syntax Error code in Editor "<SheetName>" at row <RowNumber> and then click the run button for Search the Array
   Then User should see a Syntax Error message in an alert window based on "<SheetName>" at row <RowNumber> 
    Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  2        |
      
   @ar14InvalidNameCodeSearchTheArray
  Scenario Outline: : Error for invalid name code in "Search the Array"
   Given The user is on the practice question editor
   When The user write the name Error code in Editor "<SheetName>" at row <RowNumber> and then click the run button for Search the Array
   Then User should see a Name Error message in an alert window based on "<SheetName>" at row <RowNumber> 
    Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  1        |
      
  
   
   @ar17TryHereArraysusingList
  Scenario: Navigate to Try Editor in  Arrays using List
   Given The user is on the  Arrays using List page
   When The user clicks Try Here button in  Arrays using List page
   Then The user should be redirected to a page having a Try Editor with a Run button in  Arrays using List page
   
 @ar18RunWithoutCodeArraysusingList
 Scenario Outline: Error when running without code in Try editor Arrays using List
   Given The user is in the Try Editor page of  Arrays using List
   When The user clicks the Run button without entering code "<SheetName>" at row <RowNumber>
   Then The user should see an error message in an alert window of Try editor for Arrays using List based on "<SheetName>" at row <RowNumber>
    
     Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  3        |
      
 @ar19InvalidNameCodeArraysusingList
 Scenario Outline: Error for invalid Python code in Arrays using List
   Given The user is in the Try Editor page of  Arrays using List
   When The user enters invalid name code in the Editor under Arrays using List and clicks the Run button
   Then The user should see an name error message in an alert window under Arrays using List of Try editor based on "<SheetName>" at row <RowNumber>
   
   Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  1        |
  
   @ar20InvalidSyntaxCodeArraysusingList
 Scenario Outline: Error for invalid Python code in Arrays using List
   Given The user is in the Try Editor page of  Arrays using List
   When The user writes invalid Syntax code in the Editor under Arrays using List and clicks the Run button
   Then User should see a Syntax Error message in an alert window under Arrays using List based on  "<SheetName>" at row <RowNumber> 
   
   Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  2        |
      
  @ar21validCodeArraysusingList
 Scenario Outline: Verify for valid Python code in Arrays using List
   Given The user is in the Try Editor page of  Arrays using List
    When The user write the valid code in Editor under Arrays using List, then clicks the Run button
    Then The user write the valid code in Editor form in Arrays using List based on"<SheetName>" at row <RowNumber>   
   
   Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |    0      |
      
  