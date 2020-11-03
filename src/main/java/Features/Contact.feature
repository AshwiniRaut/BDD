Feature: Free CRM Contact Feature

Scenario Outline: Free CRM Login Test Scenario

Given User is on login page
When title of login page is free crm
Then user enters "<username>" and "<password>" 
Then user clicks on login button
Then user is on homepage
Then user moves to create new contact page
Then user is on create new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then user close the browser

Examples: 
| username | password |firstname | lastname | position |
| rautashwini56@gmail.com | Ashwini@123 | Ashwini | Raut |SSE|
| rautashwini56@gmail.com         | Ashwini@123    | John	  | Smith | Director |