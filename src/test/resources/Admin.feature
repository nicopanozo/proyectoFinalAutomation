Feature: Admin feature Orange Page
  Background: User actions on admin page Orange
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
      |Angular|Experiencia con NodeJS|
    When I click in save button
    Then A succesfully saved message is showed

  @DeleteSkillRecord @NeedLogout
  Scenario:Delete Skill Record
    Given I set the username with "Admin"
    And I set the password with "admin123"
    And I click the log in button
    And I click the admin option in the menu
    And I click the qualification button on the topbar
    And I click the skills button
    And I click the remove skill button
    And I click on yes delete
    Then The element was removed

  @CreateJobTitle @NeedLogout
  Scenario:Create or Add Job Title
    Given I set the username with "Admin"
    And I set the password with "admin123"
    And I click the log in button
    And I click the admin option in the menu
    And I click the job button on the topbar
    And I click the job titles option
    And I click the add job title button
    And I fill the job information fields with
      |A Frontend Developer|Persona encargada de desarrollar frontend para una plataforma|Este oficio es importante|
    When I click in save job button
    Then A succesfully saved job message is showed

  @DeleteJobTitle @NeedLogout
  Scenario:Delete Job Title
    Given I set the username with "Admin"
    And I set the password with "admin123"
    And I click the log in button
    And I click the admin option in the menu
    And I click the job button on the topbar
    And I click the job titles option
    And I click the remove job button
    And I click on yes delete
    Then The element was removed