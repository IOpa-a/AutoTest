package pages.google;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GoogleCalculator {

    private SelenideElement searchInput = $(By.xpath("//input[@name='q']"));

    public void openUrl() {
        Selenide.open("https:/Google.com");
    }

    public void setSearchInput(String s) {
        this.searchInput.val(s).pressEnter();
    }

    public void answerIsCorrect(long i) {
        $(By.xpath("//div/div/span[text()='" + i + "']")).shouldBe(Condition.visible);
    }


}
