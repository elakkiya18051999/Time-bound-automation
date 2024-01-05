@MyDashboardModule
Feature: MyDashBoard Module API'S

  Scenario: Get Widgets Response
    Given User has added Token header and send "GET" Widgets Response

  Scenario: Get Widget Master ID Resposne
    Given User has added Token header and send "GET" Widget Master id Resposne

  Scenario: Post Logs
    Given User has added Token header and send "POST" Logs Response

  Scenario: Post AuthorizationID Logs
    Given User has added Token header and send "POST" AuthorizationID Logs Response

  Scenario: Post load data to the widgets
    Given User has added Token header and send "POST" Load Data widget response

  Scenario: Post Control id
    Given User has added Token header and send "POST" control id response

  Scenario: Post Runs to get data
    Given User has added Token header and send "POST" request and get run data response

  Scenario: Post Logs Response
    Given User has added Token header and send "POST" and get Logs  response

  Scenario: Get After saving dashboard  display datas
    Given User has added Token header and send "GET" dashboard display data

  Scenario: Get Dashboard details of Domain
    Given User has added Token header and sends "GET" Request of dashboard details of domain

  Scenario: Post Drag and dropping the metrics(old)
    Given User has added Token header and sends "POST" Request of drag and drop metrics

  Scenario: Post Drag and dropping the metrics(New)
    Given User has added Token header and sends "POST" Request of drag and drop metrics new

  Scenario: Get available optoins in dropdown(old)
    Given User has added Token header and sends "GET" Request of available options in dropdown

  Scenario: Get available optoins in dropdown(New)
    Given User has added Token header and sends "GET" Request of available options in new dropdown

  Scenario: Get search by metric List
    Given User has added Token header and sends "GET" Request of metric list resposne
