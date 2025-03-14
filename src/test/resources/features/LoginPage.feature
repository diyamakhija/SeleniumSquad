@LP
Feature:

  @tag1
  Scenario: Verify that user is able to land on Login Page
    Given The user is on the DS Algo Home Page
    When The user should click the Sign in link
    Then The user should be redirected to Sign in page
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
