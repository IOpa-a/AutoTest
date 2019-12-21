package step.nvidia;


import io.cucumber.java.en.Then;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Если;
import io.cucumber.java.ru.Затем;
import io.cucumber.java.ru.То;
import org.junit.BeforeClass;
import pages.nvidia.NvidiaDriverSearch;

import static com.codeborne.selenide.Selenide.open;

public class NvidiaDriverDef {

    NvidiaDriverSearch nvidia = new NvidiaDriverSearch();

    @Дано("страница поиска драйвера")
    public void страницаПоискаДрайвера() {
        open("https://www.nvidia.ru/Download/index.aspx?lang=ru");
    }

    @Если("Выберем тип продукта {string}")
    public void выберемТипПродукта(String arg0) {
        nvidia.clickSelectTypeProduct(arg0);
    }

    @Если("Выберем серию {string}")
    public void выберемСерию(String arg0) {
        nvidia.clickSelectSeriesProduct(arg0);
    }

    @Если("Выберем семейство {string}")
    public void выберемСемейство(String arg0) {
        nvidia.clickSelectProductFamily(arg0);
    }

    @Если("Выберем OS {string}")
    public void выберемOS(String arg0) {
        nvidia.clickSelectOS(arg0);
    }


    @Если("Выберем тип загрузки GeForce {string}")
    public void выберемТипЗагрузкиGeForce(String arg0) {
        nvidia.clickSelectTypeGeForceDriver(arg0);
    }

    @Если("Выберем тип загрузки Quadro {string}")
    public void выберемТипЗагрузкиQuadro(String arg0) {
        nvidia.clickSelectQuadroDriver(arg0);
    }

    @Если("Выберем тип драйвера {string}")
    public void выберемТипДрайвера(String arg0) {
        nvidia.typeDriverOS(arg0);
    }

    @Если("Выберем язык {string}")
    public void выберемЯзык(String arg0) {
        nvidia.clickSelectLanguage(arg0);
    }

    @Затем("Кликнем на кнопку поиск драйвера")
    public void кликнемНаКнопкуПоискДрайвера() {
        nvidia.clickButtonSearch();
    }

    @То("появиться кнопки загрузка драйвера")
    public void появитьсяКнопкиЗагрузкаДрайвера() {
        nvidia.buttonIsVisible();
    }

}
