Feature: Write another BDD test


    Scenario: Second test to search a value
      Given Launch google website in "Safari"
      Then Google launch page is displayed
      When "SeleniumHq" is searched in google
      Then Search results are displayed