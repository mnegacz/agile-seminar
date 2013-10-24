Feature: Examples of Cucumber

Scenario: Login to sysem
    Given I have a login app with creaditians:
   | name  | password |
      | Michal  | superpass     |
      | Bartek | superpass2     |
      | Adam  | superpass3     |
    When I try to login with name Bartek and password superpass2
    Then System should log me in correctly

Scenario: made laundry
Given today is 20-10-2013
    And I did laundry 2 days ago
    Then my laundry day must have been 18-10-2013