@tag
Feature: Data Discovery module api

  Scenario: Get loads the domains in dropdown
    Given User has added Token header and send "GET" request for domain dropdown response

  Scenario: Post  entering domain and clicking search
    Given User has added Token header and send "POST" request for domain clicking search response

  Scenario: Get Dislpay the records
    Given User has added Token header and send "GET" request for Display records response

  Scenario: Get Dislpay the Calls
    Given User has added Token header and send "GET" request for Display the calls

  Scenario: Get Run Widget(old)
    Given User has added Token header and send "GET" request for Run widget old timebound response

  Scenario: Get Run Widget(New)
    Given User has added Token header and send "GET" request for Run widget New timebound response

  Scenario: Get Widget details(old)
    Given User has added Token header and send "GET" request for old widget details response

  Scenario: Get Widget details(New)
    Given User has added Token header and send "GET" request for New widget details response

  Scenario: Post Widget Controls(Old)
    Given User has added Token header and send "POST" request for old widget Controls response

  Scenario: Post Widget Controls(New)
    Given User has added Token header and send "POST" request for New widget Controls response
