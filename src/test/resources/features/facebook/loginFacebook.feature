Feature: Facebook Login

  Scenario: Facebook
    Не получилось зарегестрироваться, капчи и тд мешают
    Then openUrl
    Then Facebook Input name
    Then Facebook Input lastName
    Then Facebook Input email
    Then Facebook Input emailRetry
    Then Facebook Input password
    Then Facebook SelectDay 3
    Then Facebook SelectMonth "янв"
    Then Facebook SelectYear "1999"
    Then Facebook checkBox "Мужчина"
    Then Facebook click btn
    Then Content "Введите код из эл. письма" is visible
