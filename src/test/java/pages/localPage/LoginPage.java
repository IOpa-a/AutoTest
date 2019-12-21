package pages.localPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import config.UserConfig;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement nameInput = $(By.xpath("//input[@id='name']"));
    private SelenideElement emailInput = $(By.xpath("//input[@id='email']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@id='password']"));
    private SelenideElement passwordTwoInput = $(By.xpath("//input[@id='password-retry']"));
    private SelenideElement radioMale = $(By.xpath("//input[@id='male']"));
    private SelenideElement radioFemale = $(By.xpath("//input[@id='female']"));
    private SelenideElement select = $(By.xpath("//select[@id='select']"));
    private SelenideElement checkBox = $(By.xpath("//input[@id='remember']"));
    private SelenideElement loginBtn = $(By.xpath("//button[@id='loginBtn']"));

    public void openUrl(){
        String url = "http://localhost:63342/selenideAutoTest/src/main/resources/index.html";
        Selenide.open(url);
    }

    public void setNameInput(String text) {
        this.nameInput.val(text);
    }

    public void setEmailInput(String text) {
        this.emailInput.val(text);
    }

    public void setPasswordInput(String text) {
        this.passwordInput.val(text);
    }

    public void setPasswordTwoInput(String text) {
        this.passwordTwoInput.val(text);
    }

    public void radioClick(String s) {
        if (s.equals("male"))
            this.radioMale.click();
        else
            this.radioFemale.click();
    }

    public void select(int i) {
        this.select.click();
        this.select.selectOption(i);
    }

    public void checkBoxChecked() {
        this.checkBox.click();
    }

    public void clickBtnLogin() {
        this.loginBtn.click();
    }

    public void content(String text) {
        $(By.xpath("//*[text()='" + text + " " + UserConfig.USER_NAME + "']")).shouldBe(Condition.visible);
    }


}
