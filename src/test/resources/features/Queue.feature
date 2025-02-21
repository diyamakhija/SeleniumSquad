@QS
Feature: DS Algo Portal

  
  Background: Verify the user is able to navigate to the DsAlgo Home Page
    Given The user enters the "correct URL"
    And The user clicks the button "Get Started button "
    And The user should be navigated to the Data-Structure Home  page which displays the Register and Sign in links

  @tag1
   Scenario: Verify that user is able to navigate to Queue data structure page
    Given The user is in the "Home page" after sign in
    When The user clicks the "Get Started" button in Queue panel 
    Then The user be directed to "Queue" Data Structure Home Page 

  #@tag2
  #Scenario: Verify that user is able to navigate to Implementation of Queue in Python page
    #Given The user is in the "Queue" page after Sign in with "username","password"
    #When The user clicks "Implementation of Queue in Python" button
    #Then The user should be redirected to "Implementation of Queue in Python" page
#
  #@tag3
  #Scenario: Verify that user is able to navigate to Try Here  page for Implementation of Queue in Python page
    #Given The user is in the Implementation of Queue in Python page
    #When The user clicks Try Here button in Implementation of Queue in Python page
    #Then The user should be redirected to a page having an try Editor with a "Run" button to test
#
  #@tag5
  #Scenario: Verify that user receives error when click on Run button without entering code for Implementation of Queue in Python page
    #Given The user is in the tryEditor page of Implementation of Queue in Python
    #When The user clicks the Run Button without entering the code in the Editor page
    #Then The user should able to see and error message in alert window
#
  #@tag6
  #Scenario: Verify that user receives error for invalid python code(name error) for Implementation of Queue in Python page
    #Given The user is in the tryEditor page of Implementation of Queue in Python
    #When The user write the invalid code in Editor and click the "Run" Button
    #Then The user should able to see an "name error message" in alert window
#
  #@tag7
  #Scenario: Verify that user receives error for invalid python code(syntax error) for Implementation of Queue in Python page
    #Given The user is in the tryEditor page of Implementation of Queue in Python
    #When The user write the invalid code in Editor and click the "Run" Button
    #Then The user should able to see an "syntax error message" in alert window
#
  #@tag8
  #Scenario: Verify that user is able to see output for valid python code for Implementation of Queue in Python page
    #Given The user is in the tryEditor page of Implementation of Queue in Python
    #When The user write the valid code in Editor and click the "Run" Button
    #Then The user should able to "see output" in the console
#
  #@tag9
  #Scenario: Verify that user is able to navigate to Implementation using collections.deque page
    #Given The user is in the Queue page after Sign in
    #When The user clicks Implementation using collections.deque button
    #Then The user should be redirected to Implementation using collections.deque page
#
  #@tag10
  #Scenario: Verify that user is able to navigate to try Here page for Implementation using collections.deque page
    #Given The user is on the Implementation using collections.deque page
    #When The user clicks Try Here buttton on the Implementation using collections.deque page
    #Then The user should be redirected to a page having an try Editor with a "Run" button to test
#
  #@tag11
  #Scenario: Verify that user receives error when click on Run button without entering code for Implementation using collections.deque page
    #Given The user is in the tryEditor page of Implementation using collections.deque
    #When The user clicks the "Run" Button without entering the code in the Editor
    #Then The user should able to see an "error message" in alert window
#
  #@tag12
  #Scenario: Verify that user receives error for invalid python code(name error) for Implementation using collections.deque page
    #Given The user is in the tryEditor page of Implementation using collections.deque
    #When The user write the invalid code in Editor and click the "Run" Button
    #Then The user should able to see an "name error message" in alert window
#
  #@tag13
  #Scenario: Verify that user receives error for invalid python code(syntax error) for Implementation using collections.deque page
    #Given The user is in the tryEditor page of Implementation using collections.deque
    #When The user write the invalid code in Editor and click the "Run" Button
    #Then The user should able to see an "syntax error message" in alert window
#
  #@tag14
  #Scenario: Verify that user is able to see output for valid python code for Implementation using collections.deque page
    #Given The user is in the tryEditor page of Implementation using collections.deque
    #When The user write the valid code in Editor and click the "Run" Button
    #Then The user should able to "see output" in the console
#
  #@tag15
  #Scenario: Verify that user is able to navigate to Implementation using Array page
    #Given The user is in the Queue page after Sign in
    #When The user clicks Implementation using Array button
    #Then The user should be redirected to Implementation using Array page
#
  #@tag16
  #Scenario: Verify that user is able to navigate to try Here page for Implementation using Array page
    #Given The user is on the Implementation using Array page
    #When The user clicks "Try Here" button in Implementation using Array page
    #Then The user should be redirected to a page having an try Editor with a "Run" button to test
#
  #@tag17
  #Scenario: Verify that user receives error when click on Run button without entering code for Implementation using Array page
    #Given The user is in the "tryEditor" page of Implementation of Queue in Python
    #When The user clicks the "Run" Button without entering the code in the Editor page
    #Then The user should able to see an "error message" in alert window
#
  #@tag18
  #Scenario: Verify that user receives error for invalid python code(name error) for Implementation using Array page
    #Given The user is in the tryEditor page of Implementation using Array
    #When The user write the invalid code in Editor and click the "Run" Button
    #Then The user should able to see an "name error message" in alert window
#
  #@tag19
  #Scenario: Verify that user receives error for invalid python code(syntax error) for Implementation using Array page
    #Given The user is in the tryEditor page of Implementation using Array
    #When The user write the invalid code in Editor and click the "Run" Button
    #Then The user should able to see an "Syntax error message" in alert window
#
  #@tag20
  #Scenario: Verify that user is able to see output for valid python code for Implementation using Array page
    #Given The user is in the tryEditor page of Implementation using Array
    #When The user write the valid code in Editor and click the "Run" Button
    #Then The user should able to "see output" in the console
#
  #@tag21
  #Scenario: Verify that user is able to navigate to Queue Operations page
    #Given The user is in the Queue page after Sign in
    #When The user clicks  Queue Operations button
    #Then The user should be redirected to  Queue Operations  page
#
  #@tag22
  #Scenario: Verify that user is able to navigate to Try Here page for Queue Operations page
    #Given The user is on the  Queue Operations page
    #When The user clicks "Try Here" button in  Queue Operations page
    #Then The user should be redirected to a page having an "try Editor" with a "Run" button to test
#
  #@tag23
  #Scenario: Verify that user receives error when click on "Run" button without entering code for Queue Operations page
    #Given The user is in the tryEditor page of Implementation of Queue in Python
    #When The user clicks the Run Button without entering the code in the Editor page
    #Then The user should able to see an "error message" in alert window
#
  #@tag24
  #Scenario: Verify that user receives error for invalid python code(name error) for Queue Operations page
    #Given The user is in the tryEditor page of  Queue Operations
    #When The user write the invalid code in Editor and click the "Run" Button
    #Then The user should able to see an "name error message" in alert window
#
  #@tag25
  #Scenario: Verify that user receives error for invalid python code(syntax error) for Queue Operations page
    #Given The user is in the tryEditor page of  Queue Operations
    #When The user write the invalid code in Editor and click the "Run" Button
    #Then The user should able to see an "syntax error message" in alert window
#
  #@tag26
  #Scenario: Verify that user is able to see output for valid python code for Queue Operations page
    #Given The user is in the tryEditor page of  Queue Operations
    #When The user write the valid code in Editor and click the "Run" Button
    #Then The user should able to "see output" in the console
#
  #@tag27
  #Scenario: Verify that user is able to navigate to Practice Questions Page for Implementation of Queue in Python page
    #Given The user is in the Queue page after Sign in
    #When The user clicks Practice Questions button
    #Then The user should be redirected to Practice Questions page
#
  #@tag28
  #Scenario: Verify the user is able to navigate to the previous page  by clicking the Back Button
    #Given The user is in the  Queue Operations page on one of the data structures
    #When The user clicks the "Back button"
    #Then The user should be redirected to the "Previous Page"
#
  #@tag29
  #Scenario: Verify the user is able to go to the Portal beginning page which has Get Started Button"
    #Given The user is in the Queue page after Sign in
    #When The user clicks the "Numpy Ninja" on the top left corner of the page
    #Then The user should land in the portal beginning page which has Get Started Button
#
  #@tag30
  #Scenario: Verify that user is able  to navigate to the selected data structures from dropdown options
    #Given The user is in the "dropdown" section
    #When The user selects the "option" from dropdown section
    #Then The user should land in the page selected in the dropdown list.
