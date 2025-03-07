

@DS
Feature: DS feature
  
  Background:
    Given The user sign in to dsAlgo Portal
 
    @tag1
  Scenario: Verify that user is able to navigate to Data Structures - Introduction page
    Given The user is in the Home page after sign in
    When The user should click the Get Started button of the Data Structures - Introduction panel
    Then The user should land in Data Structures- Introduction Page 

    @tag2
  Scenario: Verify that user is able to navigate to Time Complexity page
    Given The user is in the Data Structures-Introduction page
    When The user clicks Time Complexity button
    Then The user should be redirected to Time Complexity of Data structures-Introduction
    
    @tag3
  Scenario: Verify that user is able to navigate to try Here page for Time Complexity page
    Given The user is on the Time Complexity page
    When The user clicks Try Here buttton on theTime Complexity page
    Then The user should be redirected to a page having an try Editor with a Run button to test
    
    @tag4
  Scenario: Verify that user receives error when click on Run button without entering code for Time Complexity page
    Given The user is in the tryEditor page of Time Complexity
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see  an error message in alert window
    
    @tag5
  Scenario: Verify that user receives error for invalid python code(name error) for Time Complexity page
    Given The user is in the tryEditor page of Time Complexity
    When The user write the name invalid code in Editor and click the Run Button
    Then The user should able to see an name error message in alert window
    
    @tag6
  Scenario: Verify that user receives error for invalid python code(syntax error) for Time Complexity page
    Given The user is in the tryEditor page of Time Complexity
    When The user write the syntax invalid code in Editor and click the Run Button
    Then The user should able to see an syntax error message in alert window
    
    @tag7
  Scenario: Verify that user is able to see output for valid python code for Time Complexity page
    Given The user is in the tryEditor page of Time Complexity
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console
    
    @tag8
  Scenario: Verify that user is able to navigate to Practice Questions page
    Given The user is in the Time Complexity page
    When The user clicks the Practice Questions button
    Then The user should be redirected to Practice Questions of Data structures-Introduction
    
      @tag9
  Scenario: Verify that user is able  to navigate to the selected data structures page from dropdown
    Given The user is in the dropdown section
    When The user selects the option from dropdown section
    Then The user should land in the page selected in the dropdown list
    
    @tag10
  Scenario: Verify that user is able  to navigate to the beginning of the portal page
    Given The user is in the Data Structures - Introduction page
    When The user clicks the Numpy Ninja on the top left corner of the page
    Then The user should land in the portal beginning page with Get Started Button
    


  