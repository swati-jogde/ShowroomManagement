
Feature: Add country functionality
Background: Steps common for all scenario
 Given admin launches Chrome browser
 When admin opens URL "https://products.pisystindia.com/showroom/admin/login"
 Then  admin enters valid credentials from JSON index "0"
 And Click on login

#Scenario: admin login
# Given admin launches Chrome browser
# When admin opens URL "https://products.pisystindia.com/showroom/admin/login"
# Then  admin enters valid credentials from JSON index "0"
# And Click on login
# Then admin can view Dashboard

 
 
 Scenario: admin add country with valid data
 Given admin is on dashboard page
 When the admin navigates to the "Location" button 
 Then the admin clicks on the country option  
 And the admin clicks on the "Add Country" button  
 Then the admin enters the country details from JSON index "1" 
 And the admin clicks on the "Add" button  
 Then the admin should see the confirmation message "Are you sure?"  
 Then the admin clicks on "Yes, Add it!"  
 
 
 Scenario: Admin adds a new state with valid details
    Given Admin is logged in as admin
    And Admin navigates to the "Location" menu
    And Admin clicks on the "State" option
    When Admin clicks on the "Add State" button
    And Admin enters State name from JSON index "2"
    And Admin selects Country as "India"
    And Admin clicks the "Submit" button
    Then A success message should be displayed "State Added Successfully"
   
