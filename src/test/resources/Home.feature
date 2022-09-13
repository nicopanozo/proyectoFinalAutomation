Feature: Home feature Orange Page
  Background: User actions on home page Orange
    Given Im in orange web page

  @LogoutSuccess
  Scenario:Logout from Orange Page
    Given I set the username with "Admin"
    And I set the password with "admin123"
    And I click the log in button
    And I click the profile button
    And I click the logout button
    Then The login Img is displayed

  #@DeleteRecord
  #Scenario:Delete record from Home Page
   # Given I set the username with "Admin"
    #And I set the password with "admin123"
    #And I click the log in button
    #And I click the delete record button
    #Then The id "<id>" isn't displayed


  @VerifyByIds @NeedLogout
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


  @VerifyTerminationReasonsDisplayed @NeedLogout
  Scenario Outline: Verify termination reasons
    Given I set the username with "Admin"
    And I set the password with "admin123"
    When I click the log in button
    And I click the configuration topbar
    And I click the termination reasons button
    Then Termination reasons names "<termName>" will be displayed
  Examples:
    |termName|
    |Deceased|
    |Dismissed|
    |Laid-off|