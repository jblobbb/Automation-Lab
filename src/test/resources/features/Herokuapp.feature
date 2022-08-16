Feature: Herokuapp Tests

  Background: user is on Herokuapp website
    Given user is on Herokuapp website


  Scenario: Tick checkbox
    Given user selects "Checkboxes" exercise
    When user ticks checkbox one and unticks checkbox two
    Then user confirms the correct checkbox is ticked


  Scenario: Add or Remove Elements
    Given user selects "Add/Remove Elements" exercise
    When user clicks on Add Element and user confirms the Delete button appears
    Then user clicks on Delete button and user confirms that Delete button is removed


  Scenario: Dropdown functionality
    Given user selects "Dropdown" exercise
    When user selects option 1
    Then user verifies option 1 is selected