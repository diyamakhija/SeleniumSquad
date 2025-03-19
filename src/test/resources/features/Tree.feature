#@TS
#Feature: Tree feature
#
  #Background: 
    #Given The user sign in to dsAlgo Portal
#
  #@tag1
   #Scenario: Verify that user is able to navigate to Tree page
    #Given The user is in the Homepage after sign in
    #When The user clicks the GetStarted button in Tree Panel
    #Then The user is navigate to Tree Page
#
  #@tag2TreeNavigation...no
  #Scenario: Verify that user is able to navigate to Over View of Tree page
    #Given The user is navigate to Tree Page
    #When The user clicks Over View of Trees button
    #Then The user should be redirected to the Over View of Tree page
#
  #@tag3TryEditorNavigation
  #Scenario: Verify that user is able to navigate to "Try Here" page for "Over View of Tree"
    #Given The user is on the Over View of Tree page
    #When The user clicks the "Try Here" button on the Over View of Tree page
    #Then The user should be redirected to a page having a try editor with a Run button to test
#
  #@tag4EmptyCodeExecution
  #Scenario: Verify that user receives an error when clicking Run button without entering code
    #Given The user is in the try editor page of "Over View of Tree"
    #When The user clicks the Run button without entering any code
    #Then The user should see an error message in an alert window
#
  #@tag5InvalidCodeExecution
  #Scenario: Verify that user receives a NameError for invalid Python code
    #Given The user is in the try editor page of "Over View of Tree"
    #When The user enters invalid Python code causing a NameError and clicks the Run button
    #Then The user should see a NameError message in an alert window
#
  #@tag6SyntaxErrorExecution
  #Scenario: Verify that user receives a SyntaxError for invalid Python code
    #Given The user is in the try editor page of "Over View of Tree"
    #When The user enters Python code with syntax errors and clicks the Run button
    #Then The user should see a SyntaxError message in an alert window
#
  #@tag7ValidCodeExecution
  #Scenario: Verify that user is able to see the output for valid Python code
    #Given The user is in the try editor page of "Over View of Tree"
    #When The user enters valid Python code and clicks the Run button
    #Then The user should see the expected output displayed in the console   write a step definition file and page factory
#
  #@tag8TerminologiesPageNavigation 
  #Scenario: Verify that the user can navigate to the "Terminologies" page
    #Given The user is in the Homepage after sign in
    #When The user clicks the "Terminologies" button on the Tree page
    #Then The user should be redirected to the "Terminologies" page
#
  #@tag9TryHereNavigationONTerminologoiesPage
  #Scenario: Verify that the user can navigate to the "Try Here" page from the Terminologies page
    #Given The user is on the Terminologies page
    #When The user clicks the "Try Here" button on the "Terminologies" page
    #Then The user should be redirected to a page with a Try Editor
#
  #@tag10EmptyCodeExecution
  #Scenario: Verify that the user receives an error when clicking the Run button without entering code
    #Given The user is on the "Try Editor" page from the "Terminologies" page
    #When The user clicks the "Run" button without entering any code
    #
  #@tag11InvalidCodeExecution
  #Scenario: Verify that the user receives a Error when executing invalid Python code
    #Given The user is on the "Try Editor" page from the "Terminologies" page
#
    #When The user enters invalid Python code causing a NameError and clicks the Run button
#
    #Then The user should able to see a name error message in alert window
    #
  #@tag12SyntaxErrorExecution
  #Scenario: Verify that the user receives a SyntaxError when executing Python code with syntax errors
    #Given The user is on the Try Editor page from the Terminologies page
    #When The user enters Python code with syntax errors and clicks the "Run" button
    #Then The user should see a SyntaxError message in an alert window 
#
  #@tag13ValidCodeExecution
  #Scenario: Verify that the user sees the output when valid Python code is executed
    #Given The user is on the "Try Editor" page from the "Terminologies" page
    #When The user enters valid Python code and clicks the "Run" button
    #Then The user should see the expected output displayed in the console
#
  #@tag14TreeNavigation..No
  #Scenario: Verify that the user is able to navigate to the "Types of Trees" page
    #Given The user is on the "DS Algo Home" page
    #When The user clicks the Types of Trees button
    #Then The user should be redirected to the Types of Trees page
#
  #@tag15TryHereNavigation
  #Scenario: Verify that the user is able to navigate to the "Try Here" page from the "Types of Trees" page
    #Given The user is on the Types of Trees page
    #When The user clicks the Try Here button on the "Types of Trees" page
    #Then The user should be redirected to a page with a Try Editor 
#
   #@tag16TryHereNavigation
  #Scenario: Verify that the user is able to navigate to the "Try Here" page from the "Tree Traversals" page
    #Given The user is on the Tree Traversals page
    #When The user clicks the Try Here button on the Tree Traversals page
    #Then The user should be redirected to a page with a Try Editor
#
#
