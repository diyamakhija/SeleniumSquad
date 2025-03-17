 #@LP
#Feature: Login Feature
#
  #@tag1
  #Scenario: Verify that user is able to land on Login Page
    #Given The user is on the DS Algo Home Page
    #When The user should click the Sign in link
    #Then The user should be redirected to Sign in page
 #
  #@tag2
 #Scenario Outline: Login with different credentials
    #Given I am on the Loginpage 
    #When I login with "<userName>"  and "<password>"
    #Then I should see the message "<message>"
    #Examples:
      #| userName                   | password      | message               |
      #|                            |               | Invalid Username and Password|
      #|SeleniumSquad               |               | Invalid Username and Password| 
      #|                            |Squad2025      | Invalid Username and Password |
      #|SeleniumSquad               |12345          | Invalid Username and Password|
     #
 #
  #@tag3    
    #Scenario: Verify that user able to land on Home page after entering valid Username and Password fields
      #Given  The user is on the DSAlgo Signin Page
      #When  The user clicks login button afterentering valid username and valid password
      #Then  The user should land in DataStructure Home Page with message "You are logged in"
      #
  #@tag4
  #
  #Scenario: Verify that user able to sign out successfully
  #Given  The user is in the Homepage after Signin
  #When The user clicks Signout 
  #Then The user should be redirected to homepage with message "Logged out successfully"
  #
      #
#
#
