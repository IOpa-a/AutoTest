Feature: Поиск драйвера nvidia

  Scenario: Quadro P400

    Then Выбераем тип продукта "Quadro"
    Then Выбераем серию "Quadro Series"
    Then Выбераем семейство "Quadro P400"
    Then Выбераем OS "Windows 10 64-bit"
    Then Выбераем тип драйвера "DCH"
    Then Выбераем тип загрузки Quadro "Quadro New Feature Driver (QNF)"
    Then Выбераем язык "Русский"
    Then Кликаем на поиск драйвера
    Then Поиск кнопки загрузка