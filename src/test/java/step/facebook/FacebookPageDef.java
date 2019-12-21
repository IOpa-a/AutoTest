package step.facebook;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.facebook.LoginFacebook;

public class FacebookPageDef {
    LoginFacebook facebook = new LoginFacebook();

    @Then("openUrl")
    public void openurl() {
        facebook.openUrl();
    }

    @Then("Facebook Input name")
    public void facebookInputName() {
        facebook.setName(UserConfig.USER_NAME);
    }

    @Then("Facebook Input lastName")
    public void facebookInputLastName() {
        facebook.setLastName(UserConfig.LAST_NAME);
    }

    @Then("Facebook Input email")
    public void facebookInputEmail() {
        facebook.setEmail(UserConfig.USER_EMAIL);
    }

    @Then("Facebook Input emailRetry")
    public void facebookInputEmail2() {
        facebook.setEmail2(UserConfig.USER_EMAIL);
    }
    @Then("Facebook Input password")
    public void facebookInputPassword() {
        facebook.setPassword(UserConfig.USER_PASSWORD);
    }

    @Then("Facebook SelectDay {int}")
    public void facebookSelectDay(int arg0) {
        facebook.SelectDay(arg0);
    }

    @Then("Facebook SelectMonth {string}")
    public void facebookSelectMonth(String arg0) {
        facebook.SelectMonth(arg0);
    }

    @Then("Facebook SelectYear {string}")
    public void facebookSelectYear(String arg0) {
        facebook.SelectYear(arg0);
    }

    @Then("Facebook checkBox {string}")
    public void facebookCheckBox(String arg0) {
        facebook.clickCheckBox(arg0);
    }

    @Then("Facebook click btn")
    public void facebookClickBtn() throws InterruptedException {
        facebook.clickButton();
        Thread.sleep(4000);
    }

    @Then("Content {string} is visible")
    public void contentIsVisible(String arg0) {
        facebook.content(arg0);
    }
}
