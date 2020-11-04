$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Ashwini Raut/eclipse-workspace/FreecCrmBDDFramework/src/main/java/Features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Deals Feature",
  "description": "",
  "id": "free-crm-deals-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Deals Test Scenario",
  "description": "",
  "id": "free-crm-deals-feature;free-crm-deals-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is free crm",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "rautashwini56@gmail.com",
        "Ashwini@123"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user moves to deals page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user create new deal",
  "rows": [
    {
      "cells": [
        "Geeta",
        "company",
        "500",
        "10"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "dealsStepDefinition1.user_is_on_login_page()"
});
formatter.result({
  "duration": 7486445000,
  "status": "passed"
});
formatter.match({
  "location": "dealsStepDefinition1.title_login_page_is_free_crm()"
});
formatter.result({
  "duration": 6403500,
  "status": "passed"
});
formatter.match({
  "location": "dealsStepDefinition1.user_enters_username_and_user_enters_password(DataTable)"
});
formatter.result({
  "duration": 230601100,
  "status": "passed"
});
formatter.match({
  "location": "dealsStepDefinition1.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 74975500,
  "status": "passed"
});
formatter.match({
  "location": "dealsStepDefinition1.user_is_on_homepage()"
});
formatter.result({
  "duration": 11864400,
  "status": "passed"
});
formatter.match({
  "location": "dealsStepDefinition1.user_moves_to_deals_page()"
});
formatter.result({
  "duration": 3157974500,
  "status": "passed"
});
formatter.match({
  "location": "dealsStepDefinition1.user_create_new_deal(DataTable)"
});
formatter.result({
  "duration": 3745663300,
  "status": "passed"
});
formatter.match({
  "location": "dealsStepDefinition1.user_close_the_browser()"
});
formatter.result({
  "duration": 821511900,
  "status": "passed"
});
});