#@ADS
#Feature: Array Data Structure
#
  #Background:
    #Given The user is signed into dsAlgo Portal
#
  #@tag
  #Scenario: Navigate to "Array" Data Structure Page
    #When The user clicks the "Get Started" button in the Array Panel
    #Then The user should be directed to the "ARRAY" Data Structure Page
#
  #@tag2
  #Scenario: Navigate to "Arrays in Python" Page
    #Given The user is on the Array page after Signin
    #When The user clicks Arrays in Python button
    #Then The user should be redirected to Arrays in Python page
#
  #@tag3
  #Scenario: Navigate to Try Editor in Arrays in Python
    #Given The user is on the Arrays in Python page
    #When The user clicks "Try Here" button in Arrays in Python page
    #Then The user should be redirected to a page having a Try Editor with a Run button
#
  #@tag4
  #Scenario: Error when clicking Run without code in "Arrays in Python"
    #Given The user is in the Try Editor page of Arrays in Python
    #When The user clicks the Run Button without entering code
    #Then The user should see an error message in an alert window of Try editor
#
  #@tag5
  #Scenario: Error for invalid Python code in "Arrays in Python"
    #Given The user is now in the Try Editor page 
    #When The user writes invalid code in the Editor and clicks the Run Button
    #Then The user should now see an error message in an alert window
#
  #@tag6
  #Scenario: Successful execution of valid Python code in "Arrays in Python"
    #Given User is in the Try Editor page 
    #When The user writes valid code in the Editor and clicks the Run Button
    #Then User should see the output in the console
#
  #@tag7
  #Scenario: Navigate to "Practice Questions" in "Arrays in Python"
    #Given The user is in the Array page after Sign in
    #When User clicks "Practice Questions" button
    #Then User should be redirected to "Practice" page
#
  #@tag8
  #Scenario: Navigate to "Search the Array" question
    #Given User is on the "Practice" page
    #When The user clicks the "Search the Array" link
    #Then The user should be redirected to a question page with a Try Editor
#
  #@tag9
  #Scenario: Error for invalid code in Search the Array
    #Given The user is on the practice question editor
    #When The user writes invalid code in the Editor and clicks the Run Button
    #Then User should see an error message in an alert window
#
  #@tag10
  #Scenario: Successful execution of valid code in "Search the Array"
    #Given The user is on the practice question editor
    #When The user writes valid code in the Editor and clicks the Run Button
    #Then The user should see the correct output in the console
#
  #@tag11
  #Scenario: Error on submitting invalid code in "Search the Array"
    #Given The user is on the practice question editor
    #When The user writes invalid code in the Editor and clicks the Submit Button
    #Then The user should see an error message "Error occurred during submission"
#
  #@tag12
  #Scenario: Successful submission of valid code in "Search the Array"
    #Given The user is on the practice question editor
    #When The user writes valid code in the Editor and clicks the Submit Button
    #Then The user should see a success message "Submission successful"
