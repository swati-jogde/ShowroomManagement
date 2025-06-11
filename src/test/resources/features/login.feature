Feature: Admin Login functionality using JSON
@Sanity

  Scenario: login with valid data
    Given User launches Chrome browser
    When User opens URL "https://products.pisystindia.com/showroom/admin/login"
    Then  User enters valid credentials from JSON index "0"
    And Clicks on Login
    Then Page title should match expected title from JSON
    And Closes the browser 

  #Scenario: Login with invalid email
  #Given User launches Chrome browser
  #When User opens URL "https://products.pisystindia.com/showroom/admin/login"
  #And User enters valid credentials from JSON index "1"
  #And Clicks on Login
  #Then Error message should match expected error from JSON
  #And Closes the browser
  