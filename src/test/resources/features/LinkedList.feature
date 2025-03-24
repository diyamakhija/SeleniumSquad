@LLS
Feature: Linked List feature

  Background: 
       Given The user sign in to dsAlgo Portal

@tag1
  Scenario: Verify that user is able to navigate to Linked List structure page
    Given The user is in the Homepage after Sign in
    When The user clicks the Get Started button in Linked List panel
    Then The user should land in Linked List Page 
      
@tag2
  Scenario: Verify that user is able to navigate to Introduction page
    Given The user is in the  Linked list page after sign in
    When The user clicks Introduction button
    Then The user should be redirected to Introduction page
    
@tag3
  Scenario: Verify that user is able to navigate to try Editor page for Introduction page
    Given The user is on the Introduction page
    When The user clicks Try Here button in Introduction page
    Then The user should be redirected to a page having an try Editor with a Run button to test for list

@tag4
   Scenario Outline: Verify that user clicks run button without entering code for Introduction page
    Given The user is in the tryEditor page for Introduction page
    When  The user clicks the Run button without entering the code in the Editor for list
    Then The user should able to see  an error message in alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
     Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  3        |

@tag5
   Scenario Outline: Verify that user receives error for invalid python code(name error) for Introduction page
    Given The user is in the tryEditor page for Introduction page
     When The user writes the invalid name code in the Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Linked List
    Then The user should see a NameError message in the alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  1        |
      
@tag6
  Scenario Outline: Verify that user receives error for invalid python code(syntax error) for Introduction page
    Given The user is in the tryEditor page for Introduction page
    When The user write the invalid syntaxcode in Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Linked List
    Then The user should able to see an syntax error message in alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
      Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  2        |
  
  @tag7  
    Scenario Outline: Verify that user is able to see output for valid python code for Creating Linked List page
    Given The user is in the tryEditor page for Introduction page
   When The user write the valid code in Editorfrom "<SheetName>" at row <RowNumber> , then clicks the Run Button for Linked List
    Then The user write the valid code in Editorform "<SheetName>" at row <RowNumber> , then clicks the Run Button  for Linked List
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |    0      |

@tag8
  Scenario: Verify that user is able to navigate to Creating Linked List page
    Given The user is in the  Linked list page after sign in
    When The user clicks Creating Linked List button
    Then The user should be redirected to Creating Linked List page

@tag9
  Scenario: Verify that user is able to navigate to try Editor page for Creating Linked List page
    Given The user is on the Creating Linked List page
    When The user clicks Try Here button in Creating Linked List page
    Then The user should be redirected to a page having an try Editor with a Run button to test for list

@tag10
    Scenario Outline: Verify that user clicks run button without entering code for Creating Linked List page
    Given The user is in the tryEditor page for Creating Linked List page
    When  The user clicks the Run button without entering the code in the Editor for list
    Then The user should able to see  an error message in alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
     Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  3        |

@tag11
   Scenario Outline: Verify that user receives error for invalid python code(name error) for Creating Linked List page
    Given The user is in the tryEditor page for Creating Linked List page
    When The user writes the invalid name code in the Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Linked List
    Then The user should see a NameError message in the alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  1        |

@tag12
  Scenario Outline: Verify that user receives error for invalid python code(syntax error) for Creating Linked List page
    Given The user is in the tryEditor page for Creating Linked List page
    When The user write the invalid syntaxcode in Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user should able to see an syntax error message in alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
      Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  2        |

@tag13
 Scenario Outline: Verify that user is able to see output for valid python code for Creating Linked List page
    Given The user is in the tryEditor page for Creating Linked List page
    When The user write the valid code in Editorfrom "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user write the valid code in Editorform "<SheetName>" at row <RowNumber> , then clicks the Run Button  for Linked List
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |    0      |

@tag14
  Scenario: Verify that user is able to navigate to Types of Linked List page
    Given The user is in the  Linked list page after sign in
    When The user clicks Types of Linked List button
    Then The user should be redirected to Types of Linked List page

@tag15
  Scenario: Verify that user is able to navigate to try Editor page for Types of Linked List page
    Given The user is on the Types of Linked List page
    When The user clicks Try Here button in Types of Linked List page
    Then The user should be redirected to a page having an try Editor with a Run button to test for list

@tag16
  Scenario Outline: Verify that user clicks run button without entering code for Types of Linked List page
    Given The user is in the tryEditor page for Types of Linked List page
    When  The user clicks the Run button without entering the code in the Editor for list
    Then The user should able to see  an error message in alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
     Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  3        |

@tag17
   Scenario Outline: Verify that user receives error for invalid python code(name error) for Types of Linked List page
    Given The user is in the tryEditor page for Types of Linked List page
     When The user writes the invalid name code in the Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Linked List
    Then The user should see a NameError message in the alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  1        |

@tag18
  Scenario Outline: Verify that user receives error for invalid python code(syntax error) for Types of Linked List page
    Given The user is in the tryEditor page for Types of Linked List page
    When The user write the invalid syntaxcode in Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user should able to see an syntax error message in alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
      Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  2        |

@tag19
  Scenario Outline: Verify that user is able to see output for valid python code for Creating Linked List page
    Given The user is in the tryEditor page for Creating Linked List page
   When The user write the valid code in Editorfrom "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user write the valid code in Editorform "<SheetName>" at row <RowNumber> , then clicks the Run Button  for Linked List
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |    0      |


@tag20 
  Scenario: Verify that user is able to navigate to Implement Linked List in Python page
    Given The user is in the  Linked list page after sign in
    When The user clicks Implement Linked list in Python button
    Then The user should be redirected to Implement Linked list in Python page

@tag21
  Scenario: Verify that user is able to navigate to try Editor page for Implement Linked List in Python page
    Given The user is on the Implement Linked list in Python page
    When The user clicks Try Here button in Implement Linked list in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test for list

@tag22
  Scenario Outline: Verify that user clicks run button without entering code for Implement Linked List in Python page
    Given The user is in the tryEditor page for Implement Linked List in Python page
    When  The user clicks the Run button without entering the code in the Editor for list
    Then The user should able to see  an error message in alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
     Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  3        |


@tag23
   Scenario Outline: Verify that user receives error for invalid python code(name error) for Implement Linked List in Python page
    Given The user is in the tryEditor page for Implement Linked List in Python page
    When The user writes the invalid name code in the Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Linked List
    Then The user should see a NameError message in the alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  1        |

@tag24
  Scenario Outline: Verify that user receives error for invalid python code(syntax error) for Implement Linked List in Python page
    Given The user is in the tryEditor page for Implement Linked List in Python page
     When The user write the invalid syntaxcode in Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user should able to see an syntax error message in alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
      Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  2        |

@tag25
  Scenario Outline: Verify that user is able to see output for valid python code for Implement Linked List in Python page
    Given The user is in the tryEditor page for Implement Linked List in Python page
    When The user write the valid code in Editorfrom "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user write the valid code in Editorform "<SheetName>" at row <RowNumber> , then clicks the Run Button  for Linked List
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |    0      |
     
@tag26
  Scenario: Verify that user is able to navigate to Traversal page
    Given The user is in the  Linked list page after sign in
    When The user clicks Traversal button
    Then The user should be redirected to Traversal page

@tag27
  Scenario: Verify that user is able to navigate to try Editor page for Traversal page
    Given The user is on the Traversal page
    When The user clicks Try Here button in Traversal page
    Then The user should be redirected to a page having an try Editor with a Run button to test for list

@tag28
  Scenario Outline: Verify that user clicks run button without entering code for Traversal page
    Given The user is in the tryEditor page for Traversal page
    When  The user clicks the Run button without entering the code in the Editor for list
   Then The user should able to see  an error message in alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
     Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  3        |
@tag29
  Scenario Outline: Verify that user receives error for invalid python code(name error) for Traversal page
    Given The user is in the tryEditor page for Traversal page
   When The user writes the invalid name code in the Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Linked List
    Then The user should see a NameError message in the alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  1        |

@tag30
  Scenario Outline: Verify that user receives error for invalid python code(syntax error) for Traversal page
    Given The user is in the tryEditor page for Traversal page
   When The user write the invalid syntaxcode in Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user should able to see an syntax error message in alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
      Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  2        |

@tag31
  Scenario Outline: Verify that user is able to see output for valid python code for Traversal page
    Given The user is in the tryEditor page for Traversal page
     When The user write the valid code in Editorfrom "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user write the valid code in Editorform "<SheetName>" at row <RowNumber> , then clicks the Run Button  for Linked List
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |    0      |

@tag32
  Scenario: Verify that user is able to navigate to Insertion page
    Given The user is in the  Linked list page after sign in
    When The user clicks Insertion button
    Then The user should be redirected to Insertion page

@tag33
  Scenario: Verify that user is able to navigate to try Editor page for Insertion page
    Given The user is on the Insertion page
    When The user clicks Try Here button in Insertion page
    Then The user should be redirected to a page having an try Editor with a Run button to test for list

@tag34
 Scenario Outline: Verify that user clicks run button without entering code for Insertion page
    Given The user is in the tryEditor page for Insertion page
    When  The user clicks the Run button without entering the code in the Editor for list
   Then The user should able to see  an error message in alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
     Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  3        |
      
@tag35
   Scenario Outline: Verify that user receives error for invalid python code(name error) for Insertion page
    Given The user is in the tryEditor page for Insertion page
    When The user writes the invalid name code in the Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Linked List
    Then The user should see a NameError message in the alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  1        |

@tag36
  Scenario Outline: Verify that user receives error for invalid python code(syntax error) for Insertion page
    Given The user is in the tryEditor page for Insertion page
    When The user write the invalid syntaxcode in Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user should able to see an syntax error message in alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
      Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  2        |


@tag37
  Scenario Outline: Verify that user is able to see output for valid python code for Insertion page
    Given The user is in the tryEditor page for Insertion page
     When The user write the valid code in Editorfrom "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user write the valid code in Editorform "<SheetName>" at row <RowNumber> , then clicks the Run Button  for Linked List
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |    0      |

@tag38
  Scenario: Verify that user is able to navigate to Deletion page
    Given The user is in the  Linked list page after sign in
    When The user clicks Deletion button
    Then The user should be redirected to Deletion page

@tag39
  Scenario: Verify that user is able to navigate to try Editor page for Deletion page
    Given The user is on the Deletion page
    When The user clicks Try Here button in Deletion page
    Then The user should be redirected to a page having an try Editor with a Run button to test for list

@tag40
 Scenario Outline: Verify that user clicks run button without entering code for Deletion page
    Given The user is in the tryEditor page for Deletion page
    When  The user clicks the Run button without entering the code in the Editor for list
    Then The user should able to see  an error message in alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
     Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  3        |

@tag41
   Scenario Outline: Verify that user receives error for invalid python code(name error) for Deletion page
    Given The user is in the tryEditor page for Deletion page
    When The user writes the invalid name code in the Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Linked List
    Then The user should see a NameError message in the alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |  1        |

@tag42
  Scenario Outline: Verify that user receives error for invalid python code(syntax error) for Deletion page
    Given The user is in the tryEditor page for Deletion page
    When The user write the invalid syntaxcode in Editor from "<SheetName>" at row <RowNumber> , then clicks the Run Button for Linked List
    Then The user should able to see an syntax error message in alert window based on "<SheetName>" at row <RowNumber> for Linked List
    
      Examples: 
      | SheetName  | RowNumber |
      |pythonCode  |  2        |

@tag43
  Scenario Outline: Verify that user is able to see output for valid python code for Insertion page
    Given The user is in the tryEditor page for Deletion page
    When The user write the valid code in Editorfrom "<SheetName>" at row <RowNumber> , then clicks the Run Button for Queue
    Then The user write the valid code in Editorform "<SheetName>" at row <RowNumber> , then clicks the Run Button  for Linked List
    
    Examples: 
      | SheetName  | RowNumber | 
      |pythonCode  |    0      |

@tag44
      Scenario: Verify that user is able to navigate to Practice Questions page
    Given The user is on the Introduction page
    When The user clicks Practice Questions for Linked List 
    Then The user should be redirected to practice Questions Page
      