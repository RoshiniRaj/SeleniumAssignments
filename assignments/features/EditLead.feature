Feature: Login to Leaftaps Application and edit Lead

Background:

Given Launch Chrome Browser
When Load Url 'http://leaftaps.com/opentaps'
And Type username as 'DemoSalesManager'
And Type password as 'crmsfa'
And click Login
And verify successful login
And Click CrmSfa link
And Click Leads Main
And Click Find Lead
And select Phone Number tab
And Enter Search Key
And Click Find
And Open First value

Scenario Outline: Edit


And Click Edit
And Edit Firstname <FirstName>
And Edit Company <Company>
And Click Update
Then Verify to get title


Examples:
|FirstName|Company|
|Test1|CA|
|Test2|CA|
