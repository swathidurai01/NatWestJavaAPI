Feature: Sample API Tests scenarios

  Scenario: Verify Response Code and Format
    Given the API endpoint is accessible
    When a GET request is made to the API endpoint
    Then the response code should be 200
    And the response should be in JSON format

  Scenario: Verify Response Data
    Given the API endpoint is accessible
    When a GET request is made to the API endpoint
    Then the response should contain 13 objects
    And each object should have id, name, and data
    And each object's name should not be empty
    And each object's data should not be null

  Scenario: Validate Object Attributes
    Given the API endpoint is accessible
    When a GET request is made to the API endpoint
    Then each object's id should not be empty
    And each object's name should not be empty
    And each object's data should not be null
