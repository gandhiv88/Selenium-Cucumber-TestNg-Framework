Feature: Write a BDD test


    Scenario: First test to search a value
      Given Launch amazon website in "Chrome"
      Then Amazon launch page is displayed
      When "Bag" is searched in amazon
      Then Amazon search results are displayed