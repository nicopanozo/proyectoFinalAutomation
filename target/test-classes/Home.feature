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
#
  @DeleteRecord
  Scenario:Delete record from Home Page
    Given I set the username with "Admin"
    And I set the password with "admin123"
    And I click the log in button
    And I click the delete record button
#    Then The id isnt there anymore


  @VerifyByIds @logoutdone
  Scenario Outline:Verify names by Id
    Given I set the username with "Admin"
    And I set the password with "admin123"
    When I click the log in button
    Then The id "<id>" is displayed
  Examples:
    |id|
    |TechOps|
    |Finance|
    |Sales|

