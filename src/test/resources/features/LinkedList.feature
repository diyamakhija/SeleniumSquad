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
   Scenario: Verify that user clicks run button without entering code for Introduction page
    Given The user is in the tryEditor page for Introduction page
    When  The user clicks the Run button without entering the code in the Editor for list
    Then  The user should able to see an error message in alert window

@tag5
   Scenario: Verify that user receives error for invalid python code(name error) for Introduction page
    Given The user is in the tryEditor page for Introduction page
    When The user write the invalid name code in Editor and click the Run Button 
    Then The user should able to see a nameerror message in alert window

@tag6
  Scenario: Verify that user receives error for invalid python code(syntax error) for Introduction page
    Given The user is in the tryEditor page for Introduction page
    When The user write the invalid syntax_code in Editor and click the Run Button
    Then The user should able to see a syntaxerror msg in alert window
  
  @tag7  
    Scenario: Verify that user is able to see output for valid python code for Creating Linked List page
    Given The user is in the tryEditor page for Introduction page
    When The user write the validcode in Editor and click the Run Button
    Then The user should able to see out_put in the console

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
    Scenario: Verify that user clicks run button without entering code for Creating Linked List page
    Given The user is in the tryEditor page for Creating Linked List page
    When  The user clicks the Run button without entering the code in the Editor for list
    Then  The user should able to see an error message in alert window

@tag11
   Scenario: Verify that user receives error for invalid python code(name error) for Creating Linked List page
    Given The user is in the tryEditor page for Creating Linked List page
    When The user write the invalid name code in Editor and click the Run Button 
    Then The user should able to see a nameerror message in alert window

@tag12
  Scenario: Verify that user receives error for invalid python code(syntax error) for Creating Linked List page
    Given The user is in the tryEditor page for Creating Linked List page
    When The user write the invalid syntax_code in Editor and click the Run Button
    Then The user should able to see a syntaxerror msg in alert window

@tag13
  Scenario: Verify that user is able to see output for valid python code for Creating Linked List page
    Given The user is in the tryEditor page for Creating Linked List page
    When The user write the validcode in Editor and click the Run Button
    Then The user should able to see out_put in the console

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
   Scenario: Verify that user clicks run button without entering code for Types of Linked List page
    Given The user is in the tryEditor page for Types of Linked List page
    When  The user clicks the Run button without entering the code in the Editor for list
    Then  The user should able to see an error message in alert window

@tag17
   Scenario: Verify that user receives error for invalid python code(name error) for Types of Linked List page
    Given The user is in the tryEditor page for Types of Linked List page
    When The user write the invalid name code in Editor and click the Run Button 
    Then The user should able to see a nameerror message in alert window

@tag18
  Scenario: Verify that user receives error for invalid python code(syntax error) for Types of Linked List page
    Given The user is in the tryEditor page for Types of Linked List page
    When The user write the invalid syntax_code in Editor and click the Run Button
    Then The user should able to see a syntaxerror msg in alert window

@tag19
  Scenario: Verify that user is able to see output for valid python code for Creating Linked List page
    Given The user is in the tryEditor page for Creating Linked List page
    When The user write the validcode in Editor and click the Run Button
    Then The user should able to see out_put in the console

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
  Scenario: Verify that user clicks run button without entering code for Implement Linked List in Python page
    Given The user is in the tryEditor page for Implement Linked List in Python page
    When  The user clicks the Run button without entering the code in the Editor for list
    Then  The user should able to see an error message in alert window

@tag23
   Scenario: Verify that user receives error for invalid python code(name error) for Implement Linked List in Python page
    Given The user is in the tryEditor page for Implement Linked List in Python page
    When The user write the invalid name code in Editor and click the Run Button 
    Then The user should able to see a nameerror message in alert window

@tag24
  Scenario: Verify that user receives error for invalid python code(syntax error) for Implement Linked List in Python page
    Given The user is in the tryEditor page for Implement Linked List in Python page
    When The user write the invalid syntax_code in Editor and click the Run Button
    Then The user should able to see a syntaxerror msg in alert window

@tag25
  Scenario: Verify that user is able to see output for valid python code for Implement Linked List in Python page
    Given The user is in the tryEditor page for Implement Linked List in Python page
    When The user write the validcode in Editor and click the Run Button
    Then The user should able to see out_put in the console
     
@tag26asser
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
  Scenario: Verify that user clicks run button without entering code for Traversal page
    Given The user is in the tryEditor page for Traversal page
    When  The user clicks the Run button without entering the code in the Editor for list
    Then  The user should able to see an error message in alert window

@tag29
   Scenario: Verify that user receives error for invalid python code(name error) for Traversal page
    Given The user is in the tryEditor page for Traversal page
    When The user write the invalid name code in Editor and click the Run Button 
    Then The user should able to see a nameerror message in alert window

@tag30
  Scenario: Verify that user receives error for invalid python code(syntax error) for Traversal page
    Given The user is in the tryEditor page for Traversal page
    When The user write the invalid syntax_code in Editor and click the Run Button
    Then The user should able to see a syntaxerror msg in alert window

@tag31
  Scenario: Verify that user is able to see output for valid python code for Traversal page
    Given The user is in the tryEditor page for Traversal page
    When The user write the validcode in Editor and click the Run Button
    Then The user should able to see out_put in the console

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
 Scenario: Verify that user clicks run button without entering code for Insertion page
    Given The user is in the tryEditor page for Insertion page
    When  The user clicks the Run button without entering the code in the Editor for list
    Then  The user should able to see an error message in alert window

@tag35
   Scenario: Verify that user receives error for invalid python code(name error) for Insertion page
    Given The user is in the tryEditor page for Insertion page
    When The user write the invalid name code in Editor and click the Run Button 
    Then The user should able to see a nameerror message in alert window

@tag36
  Scenario: Verify that user receives error for invalid python code(syntax error) for Insertion page
    Given The user is in the tryEditor page for Insertion page
    When The user write the invalid syntax_code in Editor and click the Run Button
    Then The user should able to see a syntaxerror msg in alert window

@tag37
  Scenario: Verify that user is able to see output for valid python code for Insertion page
    Given The user is in the tryEditor page for Insertion page
    When The user write the validcode in Editor and click the Run Button
    Then The user should able to see out_put in the console

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
 Scenario: Verify that user clicks run button without entering code for Deletion page
    Given The user is in the tryEditor page for Deletion page
    When  The user clicks the Run button without entering the code in the Editor for list
    Then  The user should able to see an error message in alert window

@tag41
   Scenario: Verify that user receives error for invalid python code(name error) for Deletion page
    Given The user is in the tryEditor page for Deletion page
    When The user write the invalid name code in Editor and click the Run Button 
    Then The user should able to see a nameerror message in alert window

@tag42
  Scenario: Verify that user receives error for invalid python code(syntax error) for Deletion page
    Given The user is in the tryEditor page for Deletion page
    When The user write the invalid syntax_code in Editor and click the Run Button
    Then The user should able to see a syntaxerror msg in alert window

@tag43
  Scenario: Verify that user is able to see output for valid python code for Insertion page
    Given The user is in the tryEditor page for Deletion page
    When The user write the validcode in Editor and click the Run Button
    Then The user should able to see out_put in the console

@tag44
      Scenario: Verify that user is able to navigate to Practice Questions page
    Given The user is on the Introduction page
    When The user clicks Practice Questions for Linked List 
    Then The user should be redirected to practice Questions Page
      