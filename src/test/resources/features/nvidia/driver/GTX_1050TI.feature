Feature: Поиск драйвера nvidia

  Scenario: nvidiaDriver 1050Ti

    Then Выбераем тип продукта "GeForce"
    Then Выбераем серию "GeForce 10 Series"
    Then Выбераем семейство "GeForce GTX 1050 Ti"
    Then Выбераем OS "Windows 10 64-bit"
    Then Выбераем тип загрузки GeForce "Драйвер Game Ready (GRD)"
    Then Выбераем язык "Русский"
    Then Кликаем на поиск драйвера
    Then Поиск кнопки загрузка