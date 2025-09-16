
Feature: login feature


 @smoke @function
  Scenario Outline: login verify
    Given open url
    When enter "<username>" and password
    Then verify page title
    
    Examples:
    |username|
    |ravindramugali@gmail.com|

  @smoke @function
  Scenario Outline: login verify again
    Given open url
    When enter "<username>" and password
    Then verify page title

    Examples:
      |username|
      |ravindramugali@gmail.com|