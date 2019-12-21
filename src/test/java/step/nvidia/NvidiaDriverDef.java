package step.nvidia;


import io.cucumber.java.en.Then;
import org.junit.BeforeClass;
import pages.nvidia.NvidiaDriverSearch;

import static com.codeborne.selenide.Selenide.open;

public class NvidiaDriverDef {

    NvidiaDriverSearch nvidia = new NvidiaDriverSearch();

    @BeforeClass
    public void openPage() {
        open("https://www.nvidia.ru/Download/index.aspx?lang=ru");
    }


    @Then("Выбераем тип продукта {string}")
    public void selectTypeProduct(String arg0) {
        nvidia.clickSelectTypeProduct(arg0);
    }

    @Then("Выбераем серию {string}")
    public void SelectSeriesProduct(String arg0) {
        nvidia.clickSelectSeriesProduct(arg0);
    }

    @Then("Выбераем семейство {string}")
    public void SelectProductFamily(String arg0) {
        nvidia.clickSelectProductFamily(arg0);
    }

    @Then("Выбераем OS {string}")
    public void SelectOS(String arg0) {
        nvidia.clickSelectOS(arg0);
    }


    @Then("Выбераем тип загрузки GeForce {string}")
    public void SelectTypeGeForce(String arg0) {
        nvidia.clickSelectTypeGeForceDriver(arg0);
    }

    @Then("Выбераем тип загрузки Quadro {string}")
    public void clickSelectQuadro(String arg0) {
        nvidia.clickSelectQuadroDriver(arg0);
    }


    @Then("Выбераем язык {string}")
    public void SelectLanguage(String arg0) {
        nvidia.clickSelectLanguage(arg0);
    }

    @Then("Кликаем на поиск драйвера")
    public void ButtonSearch() {
        nvidia.clickButtonSearch();
    }

    @Then("Поиск кнопки загрузка")
    public void buttonIsVisible() {
        nvidia.buttonIsVisible();
    }

    @Then("Выбераем тип драйвера {string}")
    public void typeDriverOS(String arg0) {
        nvidia.typeDriverOS(arg0);
    }

}
