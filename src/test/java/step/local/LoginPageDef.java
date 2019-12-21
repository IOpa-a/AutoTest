package step.local;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.localPage.LoginPage;

public class LoginPageDef {
    LoginPage loginPage = new LoginPage();

    @Then("Open url")
    public void openUrl() {
        loginPage.openUrl();
    }

    @Then("Input name")
    public void inputName() {
        loginPage.setNameInput(UserConfig.USER_NAME);
    }

    @Then("Input email")
    public void inputEmail() {
        loginPage.setEmailInput(UserConfig.USER_EMAIL);
    }

    @Then("Input password")
    public void inputPassword() {
        loginPage.setPasswordInput(UserConfig.USER_PASSWORD);
    }

    @Then("Input passwordRetry")
    public void inputPasswordRetry() {
        loginPage.setPasswordTwoInput(UserConfig.USER_PASSWORD);
    }


    @Then("Click {string} radio")
    public void clickRadio(String arg0) {
        loginPage.radioClick(arg0);
    }

    @Then("Click {int} select")
    public void clickSelect(int arg0) {
        loginPage.select(arg0);
    }

    @Then("Click checkBox")
    public void clickCheckBox() {
        loginPage.checkBoxChecked();
    }

    @Then("Click button")
    public void clickButton() {
        loginPage.clickBtnLogin();
    }

    @Then("Content {string} name is visible")
    public void contentIsVisible(String arg0) {
        loginPage.content(arg0);
    }


}
