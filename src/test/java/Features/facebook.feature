
Feature: facebook feature

@functional
  Scenario: facebook verify
    Given open url
    When enter username and password
    Then verify page title
    
    
@functional
  Scenario: facebook verify with wrong assert
    Given open url
    When enter username and password
    Then verify page title
    And verify title
  