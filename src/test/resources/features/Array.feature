@DS
Feature: DS feature
  Background:
   Given The user sign in to dsAlgo Portal
 @tag1
  Scenario: Verify that user is able to navigate to Array page
   Given The user is in the Home page after sign in
   When The user should click the Get Started button of the Array panel
   Then The user should land in Array Page
 @tag2
 Scenario: Navigate to "Arrays in Python" Page
   Given The user is on the Array page after Signin
   When The user clicks Arrays in Python button
   Then The user should be redirected to Arrays in Python page
 @tag3
 Scenario: Navigate to "Arrays using List" Page
   Given The user is on the Array page after Signin
   When The user clicks Arrays using List button
   Then The user should be redirected to Arrays using List page
  
   @tag4
 Scenario: Navigate to "Basic Operations in Lists" Page
   Given The user is on the Array page after Signin
   When The user clicks Basic Operations in Lists button
   Then The user should be redirected to Basic Operations in Lists page
  
    @tag5
    Scenario: Navigate to "Applications of Array" Page
   Given The user is on the Array page after Signin
   When The user clicks Applications of Array button
   Then The user should be redirected to Applications of Array page
 @tag6
 Scenario: Navigate to Try Editor in Arrays in Python
   Given The user is on the Arrays in Python page
   When The user clicks "Try Here" button in Arrays in Python page
   Then The user should be redirected to a page having a Try Editor with a Run button
 @tag7
 Scenario: Error when clicking Run without code in "Arrays in Python"
   Given The user is in the Try Editor page of Arrays in Python
   When The user clicks the Run Button without entering code
   Then The user should see an error message in an alert window of Try editor
 @tag8
 Scenario: Error for invalid Python code in "Arrays in Python"
   Given The user is now in the Try Editor page
   When The user writes invalid code in the Editor and clicks the Run Button
   Then The user should now see an error message in an alert window
  
@tag9
 Scenario: Navigate to "Practice Questions" in "Arrays in Python"
   Given The user is in the Array page after Sign in
   When User clicks "Practice Questions" button
   Then User should be redirected to "Practice" page
 @tag10
 Scenario: Navigate to "Search the Array" question
   Given User is on the "Practice" page
   When The user clicks the "Search the Array" link
   Then The user should be redirected to a question page with a Try Editor
 @tag11
 Scenario: Error for invalid code in Search the Array
   Given The user is on the practice question editor
   When The user writes invalid code in the Editor and clicks the Run Button
   Then User should see an error message in an alert window
 @tag12
 Scenario: Successful execution of valid code in "Search the Array"
   Given The user is on the practice question editor
   When The user writes valid code in the Editor and clicks the Run Button
   Then The user should see the correct output in the console
 @tag13
 Scenario: Error on submitting invalid code in "Search the Array"
   Given The user is on the practice question editor
   When The user writes invalid code in the Editor and clicks the Submit Button
   Then The user should see an error message "Error occurred during submission"
 @tag14
 Scenario: Successful submission of valid code in "Search the Array"
   Given The user is on the practice question editor
   When The user writes valid code in the Editor and clicks the Submit Button
   Then The user should see a success message "Submission successful"

