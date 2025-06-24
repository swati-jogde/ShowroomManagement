Feature: Add showroom functionality
Background: Steps common for all scenario
 Given the user launches Chrome browser
 When the user opens URL "https://products.pisystindia.com/showroom/admin/login"
 Then the user enters valid credentials from JSON index "0"
 And Click on login



 Scenario: Admin adds a new showroom with valid details
    Given sub-admin is on the dashboard page
    When sub-admin navigates to the "Branch" module
    And sub-admin clicks on the "Add Showroom" button
    Then sub-admin fills showroom details from JSON index "1"
    Then sub-admin select "Country", "State" and "City" options
    And sub-admin enter "address"
    And sub-admin clicks the "Submit" button
    Then success message for showroom "Branch has been added successfully" should be displayed