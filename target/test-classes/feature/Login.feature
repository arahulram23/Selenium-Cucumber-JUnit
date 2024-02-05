Feature: Login to Swag Labs Page
   Users wish to log in to the Swag Labs page

@tag1
  Scenario Outline: Verify the login functionality with accepted usernames and passwords
    Given the User navigates to the Swag Labs login page
    When the User enters the <Username> and <Password>
    And the User clicks the login button
    Then the User should be redirected to the Swag Labs home page
   
   Examples: 
   |Username              |Password      |
   |"standard_user"       |"secret_sauce"|
   |"locked_out_user"     |"secret_sauce"|
   |"problem_user"        |"secret_sauce"|
   |"performance_glitch_user"|"secret_sauce"|
   
@tag2
  Scenario Outline: Verify the login functionality with valid usernames and invalid passwords
    Given the User navigates to the Swag Labs login page
    When the User enters the <Username> and <Password>
    And the User clicks the login button
    Then the User should not be redirected to the Swag Labs home page
   
   Examples: 
   |Username              |Password      |
   |"standard_user"       |"secrets_sauce"|
   |"standard_user"       |" "            |
   |"standard_user"       |""             |
   |"locked_out_user"     |"secret_sauce"|
   |"locked_out_user"     |" "            |
   |"locked_out_user"     |""             |
   |"problem_user"        |"wsecret_sauce"|
   |"problem_user"        |" "            |
   |"problem_user"        |""             |
   |"performance_glitch_user"|"secret_sauced"|
   |"performance_glitch_user"|" "           |
   |"performance_glitch_user"|""            |
   
@tag3
  Scenario Outline: Verify the login functionality with an invalid username and a valid password
    Given the User navigates to the Swag Labs login page
    When the User enters the <Username> and <Password>
    And the User clicks the login button
    Then the User should not be redirected to the Swag Labs home page
   
   Examples: 
   |Username              |Password      |
   |"wrong_user"          |"secret_sauce"|
   
@tag4
  Scenario Outline: Verify the login functionality with invalid usernames and passwords
    Given the User navigates to the Swag Labs login page
    When the User enters the <Username> and <Password>
    And the User clicks the login button
    Then the User should not be redirected to the Swag Labs home page
   
   Examples: 
   |Username              |Password       |
   |"wrong_user"          |"wrog_password"|
   |""                    |"secret_sauce" |
   |" "                   |""             |
   |" "                   |"secret_sauce" |
   |""                    |""             |
