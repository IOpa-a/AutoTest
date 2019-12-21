package step.google.form;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Затем;
import io.cucumber.java.ru.Также;
import pages.google.FormGoogle;

public class GoogleFormDef {
    FormGoogle form = new FormGoogle();

    @Дано("Страница формы")
    public void страницаФормы() throws InterruptedException {
        form.openUrl();
    }

    @Затем("ввод пользователя")
    public void вводIDПользователя() {
        form.idInput();
    }

    @Затем("выберите один из вариантов {string}")
    public void выберитеОдинИзВариантов(String arg0) {
        form.searchElementSpanAndClick(arg0);
    }

    @Затем("Выберите несколько вариантов {string} и {string}")
    public void выберитеНесколькоВариантов(String arg0, String arg1) {
        form.searchElementSpanAndClick(arg0);
        form.searchElementSpanAndClick(arg1);
    }

    @Затем("выпадающий список {string}")
    public void выпадающийСписок(String arg0) throws InterruptedException {
        form.clickOnDropdownList(arg0);
    }
    @Затем("сложные радио-кнопки {string}")
    public void сложныеРадиоКнопки(String arg0) {
        form.complexRadioButton(arg0);
    }

    @Затем("ставим крестик в {int} строке   {int}  {int}  {int}")
    public void крестикиНолики(int x, int a, int b, int c) throws InterruptedException {
        form.ticTacToe(x, a, b, c);
    }

    @Затем("выберите дату {string}")
    public void выберитеДату(String data) {
        form.fillFormForActive(data);
    }

    @Затем("ставим чекбокс в {int} строке   {int}  {int}  {int}  {int}  {int}")
    public void многоЧекбоксов(int x, int a, int b, int c, int d, int e) {
        form.formManyCheckbox(x, a, b, c, d, e);
    }

    @Затем("рандомная генерация символов")
    public void рандомнаяГенерацияСимволов() throws InterruptedException {
        form.textArea();
    }
    @Затем("отправляем форму")
    public void отправляемФорму() throws InterruptedException {
        form.submitButton();
    }

    @Также("проверяем успешную отправку")
    public void проверяемУспешнуюОтправку() {
        form.textVisible();
    }
}
