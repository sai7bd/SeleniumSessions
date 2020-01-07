Feature: Free CRM Login Feature


#without Examples Keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "naveenk" and "test@123"
#Then user clicks on login button
#Then user is on home page


#with Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
#When title of login page is Free CRM
Then user enters "<username>"
#Then user clicks on login button
#Then user is on home page
Then Close the browser

Examples:
|username|
|saiful7bd@yahoo.com|
|sai7bd@yahoo.com|
|jhumur7bd@yahoo.com|
|kalam7bd@yahoo.com|