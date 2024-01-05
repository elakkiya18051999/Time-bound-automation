@ScheduledHistory
Feature: Schedule History module API Positive and Negative TestCases

  Scenario: User verify the admin schedule history response
    Given User has used logToken as a  header
    When User add request body to get Admin Schedule history
    And User Send "POST" for Admin Schedule Endpoint
    Then User Verify the status code is 200
    
