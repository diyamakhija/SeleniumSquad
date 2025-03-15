#@SF
#Feature: DSAlgo Portal Navigation and Operations
#
#Background:
    #Given The user sign in to dsAlgo Portal
 #
#	@tag1
  #Scenario: Verify navigation to Stack page
    #Given the user is signed in to the DSAlgo Portal for the stack test
    #When the user clicks on the "Get Started" button for "Stack" on the Data Structures page
    #Then the user should be navigated to the "Stack" page
 #
 #	@tag2
  #Scenario: Verify navigation to Operations in Stack page
    #Given The user is in the "Stack" stack page after Sign in  
    #When the user clicks on the "Operations in Stack" button on the "Stack" page
    #Then the user should be redirected to "Operation in Stack" page of Stack
#	
#	@tag3
  #Scenario: Verify that user is able to navigate to Try Here  page for Operations in stack page
    #Given The user is in the Operations in stack page
    #When The user clicks Try Here button in Operations in stack page
    #Then The user should be redirected to stack page having an try Editor with a "Run" button to test
#
  #@tag4
  #Scenario: Verify that user receives error when click on Run button without entering code for Stack page
    #Given The user is in the tryEditor page of Operations in stack
    #When The tack user clicks the Run Button without entering the code in the Editor page
    #Then The stack user should able to see and error message in alert window
#
  #@tag5
  #Scenario: Verify that user receives error for invalid python code(name error) for Operation in Stack page
    #Given The user is in the tryEditor page of Operation in Stack page
    #When The stack user write the invalid name code in Editor and click the Run Button
    #Then The stack user should able to see a name error message in alert window
#
  #@tag6
  #Scenario: Verify that user receives error for invalid python code(syntax error) for Operation in Stack in Python page
    #Given The user is in the tryEditor page of Implementation of Stack in Python
    #When The stack user write the invalid syntax code in Editor and click the Run Button
    #Then The stack user should able to see a syntax error msg in alert window
#
  #@tag7
  #Scenario: Verify that user is able to see output for valid python code for Operations in Stack page
    #Given The user is in the tryEditor page of Implementation of Stack in Python
    #When The stack user write the valid code in Editor and click the "Run" Button
    #Then The stack user should able to "see output" in the console
#	
#	@tag8
#	Scenario: Verify error when running code without input for Operations in Stack
    #Given the user signs in to dsAlgo Portal
    #When the user clicks the Run Button without entering any code in the editor on the "Operation in Stack" page
    #Then the user should see an error message in an alert window
#	
#	@tag9
  #Scenario: Verify error for invalid Python code (name error) for Operations in Stack
    #Given the user signs in to dsAlgo Portal
    #When the user writes invalid code in the editor and clicks the Run Button on the "Operation in Stack" page
    #Then the user should see a name error message in an alert window
    #
#
