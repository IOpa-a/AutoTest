package pages.facebook;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginFacebook {

    private SelenideElement name = $(By.xpath("//input[@id='u_0_m']"));
    private SelenideElement lastName = $(By.xpath("//input[@id='u_0_o']"));
    private SelenideElement email = $(By.xpath("//input[@id='u_0_r']"));
    private SelenideElement emailRetry = $(By.xpath("//input[@id='u_0_u']"));
    private SelenideElement password = $(By.xpath("//input[@id='u_0_w']"));
    private SelenideElement selectDay = $(By.xpath("//select[@id='day']"));
    private SelenideElement selectMonth = $(By.xpath(" //select[@id='month']"));
    private SelenideElement selectYear = $(By.xpath("//select[@id='year']"));
    private SelenideElement checkWoman = $(By.xpath("//*[text()='Женщина']/.."));
    private SelenideElement checkMan = $(By.xpath("//*[text()='Мужчина']/.."));
    private SelenideElement checkOther = $(By.xpath("//*[text()='Другое']/.."));
    private SelenideElement button = $(By.xpath("//button[text()='Регистрация']"));


    public void openUrl() {
        Selenide.open("https://www.facebook.com/");
    }

    public void setName(String name) {
        this.name.val(name);
    }

    public void setLastName(String company) {
        this.lastName.val(company);
    }

    public void setEmail(String email) {
        this.email.val(email);
    }
    public void setEmail2(String email) {
        this.emailRetry.val(email);
    }

    public void setPassword(String password) {
        this.password.val(password);
    }

    public void SelectDay(int select) {
        this.selectDay.click();
        this.selectDay.selectOption(select);
    }

    public void SelectMonth(String select) {
        this.selectMonth.click();
        this.selectMonth.selectOption(select);
    }

    public void SelectYear(String select) {
        this.selectYear.click();
        this.selectYear.selectOption(select);
    }

    public void clickCheckBox(String sex) {
        if (sex.equals("Женщина"))
            checkWoman.click();
        else if (sex.equals("Мужчина"))
            checkMan.click();
        else
            checkOther.click();

    }

    public void clickButton() {
        this.button.click();
    }

    public void content(String text) {
        $(By.xpath("//*[text()='" + text + "']")).shouldBe(Condition.visible);
    }
    //*[text()='Вы не прошли каптчу']
}



