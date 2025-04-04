@QS
Feature: Queue feature

  
  Background:
    Given The user sign in to dsAlgo Portal
 
  @tag1
   Scenario: Verify that user is able to navigate to Queue data structure page
    Given The user is in the "Home page" after sign in
    When The user clicks the "Get Started" button in Queue panel 	+
    Then The user be directed to "Queue" Data Structure Home Page 

  @tag2
  Scenario: Verify that user is able to navigate to Implementation of Queue in Python page
    Given The user is in the "Queue" page after Sign in 
    When The user clicks "Implementation of Queue in Python" button
    Then The user should be redirected to "Implementation of Queue in Python" page

  @tag3
  Scenario: Verify that user is able to navigate to Try Here  page for Implementation of Queue in Python page
    Given The user is in the Implementation of Queue in Python page
    When The user clicks Try Here button in Implementation of Queue in Python page
    Then The user should be redirected to a page having an try Editor with a "Run" button to test

  @tag4
  Scenario Outline: Verify that user receives error when click on Run button without entering code for Implementation of Queue in Python page
    Given The user is in the tryEditor page of Implementation of Queue in Python
    When The user clicks the Run Button without entering the code in the Editor page
    Then The user should able to see  an error message in alert window based on "<SheetName>" at row <RowNumber> for Queue
    
     Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  3        |

  @tag5
  Scenario Outline: Verify that user receives error for invalid python code(name error) for Implementation of Queue in Python page
    Given The user is in the tryEditor page of Implementation of Queue in Python
    When The user writes the invalid name code in the Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user should see a NameError message in the alert window based on "<SheetName>" at row <RowNumber> for Queue
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  1        |
     
  @tag6
 Scenario Outline: Verify that user receives error for invalid python code(syntax error) for Implementation of Queue in Python page
    Given The user is in the tryEditor page of Implementation of Queue in Python
    When The user write the invalid syntaxcode in Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user should able to see an syntax error message in alert window based on "<SheetName>" at row <RowNumber> for Queue
    
      Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  2        |
     
  @tag7
  Scenario Outline: Verify that user is able to see output for valid python code for Implementation of Queue in Python page
    Given The user is in the tryEditor page of Implementation of Queue in Python
    When The user write the valid code in Editorfrom "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user write the valid code in Editorform "<SheetName>" at row <RowNumber> , then clicks the Run Button  for Queue 
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |    0      |

  @tag8
  Scenario: Verify that user is able to navigate to Implementation using collections.deque page
    Given The user is in the Queue page after Sign in
    When The user clicks Implementation using collections.deque button
    Then The user should be redirected to Implementation using collections.deque page

  @tag9
  Scenario: Verify that user is able to navigate to try Here page for Implementation using collections.deque page
    Given The user is on the Implementation using collections.deque page
    When The user clicks Try Here buttton on the Implementation using collections.deque page
    Then The user should be redirected to a page having an try Editor with a "Run" button to test

  @tag10
  Scenario Outline: Verify that user receives error when click on Run button without entering code for Implementation using collections.deque page
    Given The user is in the tryEditor page of Implementation using collections.deque
    When The user clicks the Run Button without entering the code in the Editor page
    Then The user should able to see  an error message in alert window based on "<SheetName>" at row <RowNumber> for Queue
    
     Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  3        |

  @tag11
  Scenario Outline: Verify that user receives error for invalid python code(name error) for Implementation using collections.deque page
    Given The user is in the tryEditor page of Implementation using collections.deque
    When The user writes the invalid name code in the Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user should see a NameError message in the alert window based on "<SheetName>" at row <RowNumber> for Queue
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  1        |
      
  @tag12
  Scenario Outline: Verify that user receives error for invalid python code(syntax error) for Implementation using collections.deque page
    Given The user is in the tryEditor page of Implementation using collections.deque
    When The user write the invalid syntaxcode in Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user should able to see an syntax error message in alert window based on "<SheetName>" at row <RowNumber> for Queue
    
      Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  2        |
      

  @tag13
  Scenario Outline: Verify that user is able to see output for valid python code for Implementation using collections.deque page
    Given The user is in the tryEditor page of Implementation using collections.deque
    When The user write the valid code in Editorfrom "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user write the valid code in Editorform "<SheetName>" at row <RowNumber> , then clicks the Run Button  for Queue 
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |    0      |

  @tag14
  Scenario: Verify that user is able to navigate to Implementation using Array page
    Given The user is in the Queue page after Sign in
    When The user clicks Implementation using Array button
    Then The user should be redirected to Implementation using Array page

  @tag15
  Scenario: Verify that user is able to navigate to try Here page for Implementation using Array page
    Given The user is on the Implementation using Array page
    When The user clicks "Try Here" button in Implementation using Array page
    Then The user should be redirected to a page having an try Editor with a "Run" button to test

  @tag16
  Scenario Outline: Verify that user receives error when click on Run button without entering code for Implementation using Array page
    Given The user is in the tryEditor page of Implementation using Array page
    When The user clicks the Run Button without entering the code in the Editor page
    Then The user should able to see  an error message in alert window based on "<SheetName>" at row <RowNumber> for Queue
    
     Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  3        |

  @tag17
 Scenario Outline: Verify that user receives error for invalid python code(name error) for Implementation using Array page
    Given The user is in the tryEditor page of Implementation using Array page
    When The user writes the invalid name code in the Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user should see a NameError message in the alert window based on "<SheetName>" at row <RowNumber> for Queue
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  1        |
      
  @tag18
  Scenario Outline: Verify that user receives error for invalid python code(syntax error) for Implementation using Array page
    Given The user is in the tryEditor page of Implementation using Array page
    When The user write the invalid syntaxcode in Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user should able to see an syntax error message in alert window based on "<SheetName>" at row <RowNumber> for Queue
    
      Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  2        |
      
  @tag19
  Scenario Outline: Verify that user is able to see output for valid python code for Implementation using Array page
    Given The user is in the tryEditor page of Implementation using Array page
    When The user write the valid code in Editorfrom "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user write the valid code in Editorform "<SheetName>" at row <RowNumber> , then clicks the Run Button  for Queue 
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |    0      |
      
  @tag20
  Scenario: Verify that user is able to navigate to Queue Operations page
    Given The user is in the Queue page after Sign in
    When The user clicks  Queue Operations button
    Then The user should be redirected to  Queue Operations  page

  @tag21
  Scenario: Verify that user is able to navigate to Try Here page for Queue Operations page
    Given The user is on the  Queue Operations page
    When The user clicks "Try Here" button in  Queue Operations page
    Then The user should be redirected to a page having an "try Editor" with a "Run" button to test

  @tag22
  Scenario Outline: Verify that user receives error when click on "Run" button without entering code for Queue Operations page
    Given The user is in the tryEditor page of  Queue Operations page
    When The user clicks the Run Button without entering the code in the Editor page
    Then The user should able to see  an error message in alert window based on "<SheetName>" at row <RowNumber> for Queue
    
     Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  3        |
      
  @tag23
 Scenario Outline: Verify that user receives error for invalid python code(name error) for Queue Operations page
    Given The user is in the tryEditor page of  Queue Operations page
    When The user writes the invalid name code in the Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user should see a NameError message in the alert window based on "<SheetName>" at row <RowNumber> for Queue
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  1        |

  @tag24
  Scenario Outline: Verify that user receives error for invalid python code(syntax error) for Queue Operations page
    Given The user is in the tryEditor page of  Queue Operations page
   When The user write the invalid syntaxcode in Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user should able to see an syntax error message in alert window based on "<SheetName>" at row <RowNumber> for Queue
    
      Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  2        |

  @tag25
  Scenario Outline: Verify that user is able to see output for valid python code for Queue Operations page
    Given The user is in the tryEditor page of  Queue Operations page
    When The user write the valid code in Editorfrom "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user write the valid code in Editorform "<SheetName>" at row <RowNumber> , then clicks the Run Button  for Queue 
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |    0      |

  @tag26
  Scenario: Verify that user is able to navigate to Practice Questions Page for Implementation of Queue in Python page
    Given The user is on the  Queue Operations page
    When The user clicks Practice Questions button
    Then The user should be redirected to Practice Questions page

 @tag28
  Scenario: Verify that user is able  to navigate to the selected tree data structures from dropdown options
    Given The user is in the "dropdown" section
    When The user selects the "option" from dropdown section
    Then The user should land in the page selected in the dropdown list.
    
  @tag29
  Scenario: Verify the user is able to go to the Portal beginning page which has Get Started Button"
    Given The user is in the Queue page after Sign in
    When The user clicks the "Numpy Ninja" on the top left corner of the page
    Then The user should land in the portal beginning page which has Get Started Button
