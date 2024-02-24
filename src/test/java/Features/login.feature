
Feature: facebook login feature


 @smoke
  Scenario Outline: login verify
    Given open url
    When enter "<username>" and password
    Then verify page title
    
    Examples:
    |username|
    |ravindramugali@gmail.com|
    
 