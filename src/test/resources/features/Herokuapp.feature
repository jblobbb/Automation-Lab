Feature: Herokuapp Tests

  Background: user is on Herokuapp website
    Given user is on Herokuapp website

  Scenario: Tick checkbox
    Given user selects "Checkboxes" exercise
    When user ticks checkbox one and unticks checkbox two
    Then user confirms the correct checkbox is ticked