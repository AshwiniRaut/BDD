Feature: Free CRM Login Feature

Scenario Outline: Free CRM Login Test Scenario

Given User is on login page
When title of login page is free crm
Then user enters "<username>" and "<password>" 
Then user clicks on login button
Then user is on homepage
Then user close the browser

Examples: 
| username | password |
| rautashwini56@gmail.com | Ashwini@123 |
| test@gmail.com          | test123     |