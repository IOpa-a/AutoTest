Feature: Login male

  Scenario: Login
    Then Open url
    Then Input name
    Then Input email
    Then Input password
    Then Input passwordRetry
    Then Click "male" radio
    Then Click 4 select
    Then Click checkBox
    Then Click button
    Then Content "Welcome" name is visible