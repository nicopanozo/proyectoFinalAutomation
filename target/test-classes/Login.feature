Feature: Login Sauce Demo
  Background: User login into Sauce Demo page
    Given Im in orange web page

  @LoginSuccess
  Scenario:Login into Orange Page
    Given I set the username with "Admin"
    And I set the password with "admin123"
    When I click the log in button
    Then The pim page is displayed

