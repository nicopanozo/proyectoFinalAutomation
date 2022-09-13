Feature: Home feature Orange Page
  Background: User actions on home page Orange
    Given Im in orange web page

  @CreateSkillRecord @NeedLogout
  Scenario:Create or Add Skill Record
    Given I set the username with "Admin"
    And I set the password with "admin123"
    And I click the log in button
    And I click the admin option in the menu
    And I click the qualification button on the topbar
    And I click the skills button
    And I click the add skill button
    And I fill the skill information fields with
      |NodeJS|Experiencia con NodeJS|
    When I click in save button
    Then A succesfully saved message is showed

