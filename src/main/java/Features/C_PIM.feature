Feature: OrangeHRM PIM Module

Scenario Outline: Automate the PIM module

Given User is on the login Page
When User enter the "<username>" and "<password>"
Then User click on the login button
Then User is on the dashbord
Then User click on the PIM menu
Then User Enter the "<EmployeeName>" and "<Id>"
Then User click on the search button
Then User checked on the checkbox
Then User click on the delete button
Then User click on the conform button
Then User logout from the apllication

Examples:
|username|password|EmployeeName|Id  |
|Admin	 |admin123| Admin	   |0272|