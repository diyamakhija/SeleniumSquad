Feature: Graph Feature

  Background:
    Given The user is signed in to DSAlgo Portal

  Scenario: Verify that user is able to navigate to "Graph" data structure page
    Given The user is on the "Home" page after Sign in
    When The user clicks the "Get Started" button in Graph Panel
    Then The user should be directed to "Graph" Data Structure Page

  Scenario: Verify that user is able to navigate to "Graph" page
    Given The user is on the "Graph" page after Sign in
    When The user clicks "Graph" button
    Then The user should be redirected to "Graph" page

  Scenario: Verify that user is able to navigate to "Try Editor" page for "Graph" page
    Given The user is on the "Graph" page
    When The user clicks "Try Here" button in "Graph" page
    Then The user should be redirected to a page having a try Editor with a Run button to test

  Scenario: Verify that user receives an error when clicking the Run button without entering code in "Graph" page
    Given The user is in the Try Editor page
    When The user clicks the Run Button without entering any code in the Editor
    Then The user should see an error message in an alert window

  Scenario: Verify that user receives an error for invalid Python code in "Graph" page
    Given The user is in the Try Editor page
    When The user writes invalid Python code in the Editor and clicks the Run Button
    Then The user should see an error message in an alert window

  Scenario: Verify that user is able to see output for valid Python code in "Graph" page
    Given The user is in the Try Editor page
    When The user writes valid Python code in the Editor and clicks the Run Button
    Then The user should see the output in the console
    
    

  Scenario: Verify that user is able to navigate to "Graph Representations" page
    Given The user is on the "Graph" page after Sign in
    When The user clicks "Graph Representations" button
    Then The user should be redirected to "Graph Representations" page

  Scenario: Verify that user is able to navigate to "Try Editor" page for "Graph Representations" page
    Given The user is on the "Graph Representations" page
    When The user clicks "Try Here" button in Graph Representations page
    Then The user should be redirected to a page having a Try Editor with a Run button to test

  Scenario: Verify that user receives an error when clicking the Run button without entering code in "Graph Representations" page
    Given The user is in the Try Editor page
    When The user clicks the Run Button without entering any code in the Editor
    Then The user should see an error message in an alert window

  Scenario: Verify that user receives an error for invalid Python code in "Graph Representations" page
    Given The user is in the Try Editor page
    When The user writes invalid Python code in the Editor and clicks the Run Button
    Then The user should see an error message in an alert window

  Scenario: Verify that user is able to see output for valid Python code in "Graph Representations" page
    Given The user is in the Try Editor page
    When The user writes valid Python code in the Editor and clicks the Run Button
    Then The user should see the output in the console

    
