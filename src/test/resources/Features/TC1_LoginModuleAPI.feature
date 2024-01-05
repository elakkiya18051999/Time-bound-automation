@LoginModule
Feature: Login Module API Positive and negative testcases

  Scenario: User Login and Get Logtoken
    Given User adds header and send "POST" request

  Scenario: Get User Config Response
    Given User has obtained the token and send "GET" Config request

  Scenario: Get CurrentUser Response
    Given User has obtained the token and send "GET" CurrentUser request

  Scenario: Get Menulist Response
    Given User has add token as header and send "GET" Menulist request

  Scenario: Get Countlist Response
    Given User has added as xauth and send "GET" Countlist  request

  Scenario: Get Directorylist Response
    Given User has obtained the token and send "GET" Directorylist Response

  Scenario: Get AuthorizationID Response
    Given User has added as header and send "GET" AuthorizationID Response

  Scenario: Post Logsearch Response
    Given User has added header and "POST" logsearch payload
