Feature: test the links

Scenario: Check correct page is opened

Given homepage is open
When user taps on a link
Then correct page is opened 

Scenario: Check live chat opens

Given homepage is open
When user taps on live chat button
Then live chat window is opened 

