Feature: Retailer Link
Scenario: To check reatiler page should be displayed
Given user launch the browser
When user enter the url "http://rmgtestingserver/domain/Supply_Chain_Management/"
And user enter the username as "admin" and passwaord as "admin123" 
And select and click on loginType as "Admin"
And click on login button
Then Admin home page will be displayed
When click on add retailer link
Then add retailer page should be displayed
And click on logout button
Then login page should be displayed
And close the browser


Scenario Outline:
|url1|username1|passwaord1|loginType1|
|http://rmgtestingserver/domain/Supply_Chain_Management/|admin|admin123|Admin|
