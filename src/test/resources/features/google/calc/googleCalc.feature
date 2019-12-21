Feature: Сalculator check

  Scenario: Calculator
    Then Open urlGoogle
    Then test_1 "6 - 3 * 2"
    Then test_2 "2 + 2 * 2"
    Then test_3 "2 * 22"
    Then test_4 "6 * 12 / 4"
    Then test_5 "122 % 2"
