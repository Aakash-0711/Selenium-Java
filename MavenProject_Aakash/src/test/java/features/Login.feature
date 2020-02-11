Feature: Leaftaps login

#Background:
#Given open the chrome browser
#And maximise the browser
#And set implicit timeouts
#And load the leaftaps url
#And enter username as Demosalesmanager
#And enter password as crmsfa
#When click on login button
#And click on crmsfa link

Scenario Outline: TC-001 Create lead
And click on create lead
And enter company name as <cname>
And enter firstname as <fname>
And enter lastname as <lname> 
When click on create lead button
Examples:
|cname|fname|lname|
|Testleaf|Aakash|Aagu|
|HCL|Alan|Walker|

Scenario Outline: TC-002 Edit lead
When click on leads
Then click on find leads
And enter first name as <firstname>
And click on find leads button
Then click on first resulting lead
And verify the title of the page
Then click edit button
And enter new company name as <companyname>
Then click on update
And confirm the changed name as <companyname>
Examples:
|firstname|companyname|
|Aakash|HCL|
|A|Wipro|

Scenario Outline: TC-003 Delete lead
When click on leads
Then click on find leads
And click on phone
And enter phonenumber as <phonenum>
Then click find leads button
Then capture lead id
And click on resulting lead
And click delete
Then click find leads
Then enter captured lead id
And click find leads
When verify no records
Examples:
|phonenum|
|5|
|9|

Scenario Outline: TC-004 Dupicate lead
When click on leads
Then click on find leads
And click on email
And enter email as <email>
Then click find leads button
Then capture name of the firstlead
And click on first resulting lead
And click duplicate lead
Then verify the title as duplicate lead
Then click create lead
Examples:
|email|
|a@gmail.com|
|data@gmail.com|


Scenario Outline: TC-005 Merge lead
When click on leads
Then click on Merge leads
And Click on Icon near From Lead
And Move to new window
Then Enter From Lead ID as <From>
And Click Find Leads button
And Click First Resulting lead
Then Switch back to primary window
And Click on Icon near To Lead
Then Move to new window
Then Enter To Lead ID as <To>
And Click Find Leads button
And Click First Resulting lead
Then Switch back to primary window
And Click Merge
And Accept Alert
Then Click Find Leads
And Enter From Lead ID as <From>
And Click Find Leads button
Then Verify the first lead does not exist anymore (No records found)
Examples:
|From|To|
|1|2|
|3|4|


