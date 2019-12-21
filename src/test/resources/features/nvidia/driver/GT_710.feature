Feature: Поиск драйвера nvidia

  Scenario: nvidiaDriver 710

    Then Выбераем тип продукта "GeForce"
    Then Выбераем серию "GeForce 700 Series"
    Then Выбераем семейство "GeForce GT 710"
    Then Выбераем OS "Windows 8 64-bit"
    Then Выбераем тип загрузки GeForce "Драйвер Game Ready (GRD)"
    Then Выбераем язык "Русский"
    Then Кликаем на поиск драйвера
    Then Поиск кнопки загрузка