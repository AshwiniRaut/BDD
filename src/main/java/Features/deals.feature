Feature: Free CRM Deals Feature

Scenario: Free CRM Deals Test Scenario

Given User is on login page
When title of login page is free crm
Then user enters username and password
| rautashwini56@gmail.com | Ashwini@123 |
Then user clicks on login button
Then user is on homepage
Then user moves to deals page
Then user create new deal
| Geeta | company | 500 | 10 |
Then user close the browser