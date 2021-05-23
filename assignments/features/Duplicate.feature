Feature: EditLead in the Leaftaps application

Background:

Given Launch Chrome Browser
When Load URL 'http://leaftaps.com/opentaps/'
And Type the username as 'DemoSalesManager'
And Type the password as 'crmsfa'
And Click login button
And Click CRMSFA link
Then Click on Lead 

Scenario Outline: Duplicate lead with Multiple data

When click on Find Leads link
And click on email and enter email as <email>
And click on find Leads button
And click on first resulting value 
And click DuplicateLead button
And click on Create Lead

Examples:
|email|
|gopal@gmail.com|
|raj@gmail.com|