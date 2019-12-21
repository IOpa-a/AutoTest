package pages.google;


import com.codeborne.selenide.SelenideElement;
import config.UserConfig;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class FormGoogle {

    public void openUrl() {
        open("https://docs.google.com/forms/d/e/1FAIpQLSco0nEWZMFCeBL4aeYwa3uezusYZpdLViWr0EKZFbiNPxC1VA/viewform");
    }

    public void idInput() {
        $x("//input[@name='entry.398939861']")
                .setValue(UserConfig.USER_ID);
    }

    public void searchElementSpanAndClick(String text) {
        $x("//span[text()='" + text + "']").click();
    }

    public void clickOnDropdownList(String text) {
        $x("//span[@class='quantumWizMenuPaperselectContent exportContent']").click();
        $x("//*[contains(text(), '" + text + "')]/..").click();
    }

    public void complexRadioButton(String number) {
        $x("//label[" + number + "]/div[2]").click();
    }

    public void ticTacToe(int x, int a, int b, int c) throws InterruptedException {
        int pos = 0;

        if (a > 0) {
            pos = 2;
            ticTacToeClick(x, pos);
        }
        if (b > 0) {
            pos = 3;
            ticTacToeClick(x, pos);
        }
        if (c > 0) {
            pos = 4;
            ticTacToeClick(x, pos);
        }
    }

    public void ticTacToeClick(int x, int pos) {
        x++;
        $x("//div[@class='freebirdFormviewerViewItemsGridScrollingData']/div[" + x + "]/span[1]/div[" + pos + "]/div[1]/div[3]/div[1]/..").click();
    }

    public void fillFormForActive(String data) {
        SelenideElement element = $x("//form[@id='mG61Hd']/div/div/div/div/div/div/div/div/div/div/div/input[1]");
        element.setValue(data);
    }

    public void formManyCheckbox(int x, int a, int b, int c, int d, int e) {
        int pos = 0;
        x++;
        if (a > 0) {
            pos = 1;
            formManyCheckboxClick(x, pos);
        }
        if (b > 0) {
            pos = 2;
            formManyCheckboxClick(x, pos);
        }
        if (c > 0) {
            pos = 3;
            formManyCheckboxClick(x, pos);
        }
        if (d > 0) {
            pos = 4;
            formManyCheckboxClick(x, pos);
        }
        if (e > 0) {
            pos = 5;
            formManyCheckboxClick(x, pos);
        }

    }

    public void formManyCheckboxClick(int x, int pos) {
        $x("//div[@class='freebirdFormviewerViewItemsGridScrollingData']//div[" + x + "]/label[" + pos + "]/div[1]/div[1]/div[2]").click();
    }

    public void textArea() {
        String text = RandomStringUtils.randomAlphabetic(12);
        System.out.println(text);
        $x("//textarea[@name='entry.1226441779']").setValue(text);

    }

    public void submitButton() {
        $x("//span[@class='quantumWizButtonPaperbuttonLabel exportLabel']").click();

    }

    public void textVisible() {
        $x("//*[contains(text(), 'Ответ записан.')]");
    }
}
