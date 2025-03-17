@home
Feature: Home page

  Background: 
    Given The user is on the Home page

  Scenario: Check home list with signin -array
    When The user clicks the list of "array" after signin
    Then the user goes to "Array" homepage

  Scenario: Check home list with signin -list
    When The user clicks the list of "list" after signin
    Then the user goes to "linked list" homepage

  Scenario: Check home list with  signin -stack
    When The user clicks the list of "stack" after signin
    Then the user goes to "Stack" homepage

  Scenario: Check home list with  signin -queue
    When The user clicks the list of "Queue" after signin
    Then the user goes to "Queue" homepage

  Scenario: Check home  list with  signin -tree
    When The user clicks the list of "Tree" after signin
    Then the user goes to "Tree" homepage

  Scenario: Check home  list  with signin -graph
    When The user clicks the list of "graph" after signin
    Then the user goes to "Graph" homepage

  Scenario: Check home Getstarted with signin -DS
    When The user clicks the getStarted of "DS" in homepage
    Then the user goes to "DS" homepage

  Scenario: Check home Getstarted with signin -array
    When The user clicks the getStarted of "array" in homepage
    Then the user goes to "Array" homepage

  Scenario: Check home Getstarted with signin -list
    When The user clicks the getStarted of "list"
    Then the user goes to "linked list" homepage

  Scenario: Check home Getstarted with signin -stack
    When The user clicks the getStarted of "stack"
    Then the user goes to "Stack" homepage

  Scenario: Check home Getstarted with signin -queue
    When The user clicks the getStarted of "queue"
    Then the user goes to "Queue" homepage

  Scenario: Check home Getstarted with signin -tree
    When The user clicks the getStarted of "tree"
    Then the user goes to "Tree" homepage

  Scenario: Check home Getstarted with signin -graph
    When The user clicks the getStarted of "graph"
    Then the user goes to "Graph" homepage