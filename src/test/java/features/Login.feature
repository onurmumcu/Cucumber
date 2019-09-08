Feature: Application Login

Scenario: Home page default login
Given User is landing page
When User login into application with "jin" and "1234"
Then Home page is populated
And Cards displayed are "true"


Scenario: Home page default login
Given User is landing page iki
When User login into application with "john" and "4321"
Then Home page is populated
And Cards displayed are "false"


Scenario Outline: Home page default login
Given User is  landing page uc
When User sign up with following details
| jenny | abcd | john@abcd.com | Australia | 3245612 |
Then Home page is populated
And Cards displayed are "false"