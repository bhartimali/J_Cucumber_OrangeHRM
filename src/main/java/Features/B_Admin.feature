Feature: OrangeHRM Admin Module

Scenario: Admin module application

Given User on the login page
When User Enter username and password
|username|password|
|Admin	 |admin123|

Then User click on the login button
Then User is on the home page

#Search User
Then User click on the admin menu
Then User fill up the search from
|SearchUsername|userRole|
|Jenny		   |ESS		|

Then click on the search button
Then click on the admin name in the table

#Edit User
Then user click on the edit button
Then user edit the emloyeeName
|emloyeeName|
|Admin A	|

Then user click on the save button

#Add User
Then user click on the add button
Then User fill up the form
|User Role|Employee Name|Username|Status |Password|Confirm Password|
|ESS	  |Admin A		|Testing2 |Enabled|Admin!23|Admin!23        | 

Then user Click on the Editsave button

#Delete User
Then Select the checkbox from the table
Then user clcik on the delete button
Then user click on the conform button

Then User click on the Logout from the application
