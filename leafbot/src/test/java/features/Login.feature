Feature: Leaftaps Login Test

@smoke
Scenario Outline: TC001 Positive Login Flow
And Enter the username as <username>
And Enter the Password as <password>
When Click on the Login
Examples:
|username|password|
|Demosalesmanager|crmsfa|
|DemoCSR|crmsfa|


