Feature: Login Sauce Demo
  Background: User login into Sauce Demo page
    Given Im in orange web page

  @LogoutSuccess
  Scenario:Logout from Orange Page
    Given I set the username with "Admin"
    And I set the password with "admin123"
    And I click the log in button
    And I click the profile button
    And I click the logout button
    Then The login Img is displayed