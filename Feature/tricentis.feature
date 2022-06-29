@Tricentis
Feature: Tricentis
@Unsuccessful_login
Scenario: Login with blank data
Given user is on login page
When  user do not enter username and password 
And click on login button 
Then  Alert email should not be empty
And close
@Unsuccessful_login
Scenario: Login with blank password
Given user is on login page
When  user entered email 
And click on login button  
Then  Alert password should not be  empty
And close 
@Unsuccessful_login
Scenario: Login with blank email
Given user is on login page
When  user entered password
And click on login button  
Then  Alert username  should not be  empty
And close
@Unsuccessful_login
Scenario: Login with invalid data
Given user is on login page
When  user  entered invalid  email and password
And click on login button  
Then  Alert invalid credentials
And close 
@Successful_login
Scenario: Login with valid  data
Given user is on login page
When  user entered valid email and password  
Then  navigate user to welcome page
And close
Given user is on login page
When user enters valid username and password 
And click on login button
Then user navigate to welcome page
Scenario: Searching for Computer
Given user is on welcome page
When user click on search button and entered Computer in search box
And click on  search button
Then user navigate to result page
Scenario: Log out
Given user is on welcome page
When user click on logout button
Then user will be logged out 

 



