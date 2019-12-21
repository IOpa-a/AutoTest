Feature: Поиск драйвера nvidia

  Scenario: nvidiaDriver 650 Ti

    Then Выбераем тип продукта "GeForce"
    Then Выбераем серию "GeForce 600 Series"
    Then Выбераем семейство "GeForce GTX 650 Ti"
    Then Выбераем OS "Windows 7 64-bit"
    Then Выбераем тип загрузки GeForce "Драйвер Game Ready (GRD)"
    Then Выбераем язык "Русский"
    Then Кликаем на поиск драйвера
    Then Поиск кнопки загрузка