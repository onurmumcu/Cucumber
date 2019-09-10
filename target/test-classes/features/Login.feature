Feature: Application Login

Background:
Given validate teh browser
When Browser is triggered
Then check if browser is started

@RegTest
Scenario: Home page default login
Given User is landing page
When User login into application with "jin" and "1234"
Then Home page is populated
And Cards displayed are "true"

@SmokeTest
Scenario: Home page default login
Given User is landing page
When User login into application with "john" and "4321"
Then Home page is populated
And Cards displayed are "false"

@RegTest
Scenario: Home page default login
Given User is  landing page
When User sign up with following details
| jenny | abcd | john@abcd.com | Australia | 3245612 |
Then Home page is populated
And Cards displayed are "false"

@RegTest
Scenario Outline: Home page default login
Given User is landing page
When User login in to application with <Username> and <Password>
Then Home page is populated
And Cards displayed are "false"

Examples:
|Username | Password |
|user1        | Pass1       |
|user2        | Pass2       |
|user3        | Pass3       |
