
Feature: Add location functionality
Background: Steps common for all scenario
 Given the user launches Chrome browser
 When the user opens URL "https://products.pisystindia.com/showroom/admin/login"
 Then the user enters valid credentials from JSON index "0"
 And Click on login



 
 
 Scenario: admin add country with valid data
 Given the user is on dashboard page
 When the user navigates to the "Location" button 
 Then the user clicks on the country option  
 And the user clicks on the "Add Country" button  
 Then the user enters the country details from JSON index "1" 
 And the user clicks on the "Add" button  
 Then the user should see the confirmation message "Are you sure?"  
 Then the user clicks on "Yes, Add it!"  
 
 Scenario: Admin adds a new state with valid details
    Given the Admin is logged in as admin
    And the Admin navigates to the "Location" menu
    And the Admin clicks on the "State" option
    When the Admin clicks on the "Add State" button
    And  the Admin enters State name from JSON index "2"
    And the Admin selects Country as "India"
    And the Admin clicks the "Submit" button
    Then A success message should be displayed "State Added Successfully"
   
 @Sanity
    Scenario: admin add city with valid data  
    Given the admin is log in as admin
    And the admin navigates to the "Location" menu
    And the admin clicks on the "City" option
    When the admin click on the AC "Add City" button
    And the admin enters State name from JSON index "3"
    And the admin selects State as "Maharashtra"
    And the admin clicks on the add "Add" button
    Then the admin Click on yes Add button
    Then the admin verify success message as " City has been added successfully"
    And Close the browser
   
