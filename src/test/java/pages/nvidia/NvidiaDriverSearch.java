package pages.nvidia;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class NvidiaDriverSearch{


    public void clickHeaderMenu() {
        $x("//header[@id='main-header']//div//a[text()='ДРАЙВЕРЫ']").click();
    }

    public void clickSelectTypeProduct(String text) {
        SelenideElement element = $x("//select[@id='selProductSeriesType']");
        element.click();
        element.selectOption(text);
    }

    public void clickSelectSeriesProduct(String text) {
        SelenideElement element = $x("//select[@id='selProductSeries']");
        element.click();
        element.selectOption(text);
    }

    public void clickSelectProductFamily(String text) {
        SelenideElement element = $x("//select[@id='selProductFamily']");
        element.click();
        element.selectOption(text);
    }

    public void clickSelectOS(String text) {
        SelenideElement element = $x("//select[@id='selOperatingSystem']");
        element.click();
        element.selectOption(text);
    }

    public void clickSelectTypeGeForceDriver(String text) {
        SelenideElement element = $x("//select[@id='ddlDownloadTypeCrdGrd']");
        element.click();
        element.selectOption(text);
    }
    public void clickSelectQuadroDriver(String text) {
        SelenideElement element = $x("//select[@id='ddlDownloadTypeQnfOde']");
        element.click();
        element.selectOption(text);
    }

    public void clickSelectLanguage(String text) {
        SelenideElement element = $x("//select[@id='ddlLanguage']");
        element.click();
        element.selectOption(text);
    }

    public void clickButtonSearch() {
        $x("//img[@id='imgSearch']").click();
    }

    public void typeDriverOS(String text) {
        SelenideElement element = $x("//select[@id='ddlDownloadTypeDch']");
        element.click();
        element.selectOption(text);
    }
    public void buttonIsVisible(){
        $x("//img[@id='imgDwnldBtn']").shouldBe(Condition.visible);
    }
}
