Feature: Search and place order for Vegetables

Scenario: Search for items and validate results
Given User is on Greencart Landing page
When User searched for "Cucumber" Vegetable
Then "Cucumber" results are displayed