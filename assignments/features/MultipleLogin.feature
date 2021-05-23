Feature: Login to the Leaftaps Application

Background: 
Given Launch Chrome browser
When Load URL 'http://leaftaps.com/opentaps'
And Type username as 'DemoSalesManager'
And Type password as 'crmsfa'
And Click Login Button
And Verify Login is successful
And Click Lead


Scenario Outline: Create Multiple Leads
And Create Lead
And Create Companyname <companyName>
And Create Firstname <firstName>
And Create Lastname <lastName>
Then Submit Lead

Examples: (2 test data)
| companyName | firstName | lastName |
| IBM | Roshini | Raj |
| Infy | Kamal | Kumar |

