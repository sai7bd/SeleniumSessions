$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#without Examples Keyword"
    },
    {
      "line": 5,
      "value": "#Scenario: Free CRM Login Test Scenario"
    },
    {
      "line": 6,
      "value": "#"
    },
    {
      "line": 7,
      "value": "#Given user is already on Login Page"
    },
    {
      "line": 8,
      "value": "#When title of login page is Free CRM"
    },
    {
      "line": 9,
      "value": "#Then user enters \"naveenk\" and \"test@123\""
    },
    {
      "line": 10,
      "value": "#Then user clicks on login button"
    },
    {
      "line": 11,
      "value": "#Then user is on home page"
    },
    {
      "line": 14,
      "value": "#with Examples Keyword"
    }
  ],
  "line": 15,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "#When title of login page is Free CRM"
    }
  ],
  "line": 19,
  "name": "user enters \"\u003cusername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "#Then user clicks on login button"
    },
    {
      "line": 21,
      "value": "#Then user is on home page"
    }
  ],
  "line": 22,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;",
  "rows": [
    {
      "cells": [
        "username"
      ],
      "line": 25,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;1"
    },
    {
      "cells": [
        "saiful7bd@yahoo.com"
      ],
      "line": 26,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;2"
    },
    {
      "cells": [
        "sai7bd@yahoo.com"
      ],
      "line": 27,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;3"
    },
    {
      "cells": [
        "jhumur7bd@yahoo.com"
      ],
      "line": 28,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;4"
    },
    {
      "cells": [
        "kalam7bd@yahoo.com"
      ],
      "line": 29,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "#When title of login page is Free CRM"
    }
  ],
  "line": 19,
  "name": "user enters \"saiful7bd@yahoo.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "#Then user clicks on login button"
    },
    {
      "line": 21,
      "value": "#Then user is on home page"
    }
  ],
  "line": 22,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 10620724400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "saiful7bd@yahoo.com",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_and(String)"
});
formatter.result({
  "duration": 178125600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.Close_the_browser()"
});
formatter.result({
  "duration": 932947500,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "#When title of login page is Free CRM"
    }
  ],
  "line": 19,
  "name": "user enters \"sai7bd@yahoo.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "#Then user clicks on login button"
    },
    {
      "line": 21,
      "value": "#Then user is on home page"
    }
  ],
  "line": 22,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 7246993500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sai7bd@yahoo.com",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_and(String)"
});
formatter.result({
  "duration": 197938700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.Close_the_browser()"
});
formatter.result({
  "duration": 689228400,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "#When title of login page is Free CRM"
    }
  ],
  "line": 19,
  "name": "user enters \"jhumur7bd@yahoo.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "#Then user clicks on login button"
    },
    {
      "line": 21,
      "value": "#Then user is on home page"
    }
  ],
  "line": 22,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 8805825300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jhumur7bd@yahoo.com",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_and(String)"
});
formatter.result({
  "duration": 175100800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.Close_the_browser()"
});
formatter.result({
  "duration": 757914000,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "#When title of login page is Free CRM"
    }
  ],
  "line": 19,
  "name": "user enters \"kalam7bd@yahoo.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "#Then user clicks on login button"
    },
    {
      "line": 21,
      "value": "#Then user is on home page"
    }
  ],
  "line": 22,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 7911939100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kalam7bd@yahoo.com",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_and(String)"
});
formatter.result({
  "duration": 142794600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.Close_the_browser()"
});
formatter.result({
  "duration": 733912400,
  "status": "passed"
});
});