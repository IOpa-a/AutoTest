package step.google.calc;

import io.cucumber.java.en.Then;
import pages.google.GoogleCalculator;

public class GoogleCalcDef {
    GoogleCalculator googleBase = new GoogleCalculator();

    @Then("Open urlGoogle")
    public void openUrl() {
        googleBase.openUrl();
    }

    @Then("test_1 {string}")
    public void test1(String arg0) {
        googleBase.setSearchInput(arg0);
        googleBase.answerIsCorrect(6 - 3 * 2);
    }

    @Then("test_2 {string}")
    public void test2(String arg0) {
        googleBase.setSearchInput(arg0);
        googleBase.answerIsCorrect(2 + 2 * 2);
    }

    @Then("test_3 {string}")
    public void test3(String arg0) {
        googleBase.setSearchInput(arg0);
        googleBase.answerIsCorrect(2 * 22);
    }
    @Then("test_4 {string}")
    public void test4(String arg0) {
        googleBase.setSearchInput(arg0);
        googleBase.answerIsCorrect(6 * 12 / 4);
    }

    @Then("test_5 {string}")
    public void test5(String arg0) {
        googleBase.setSearchInput(arg0);
        googleBase.answerIsCorrect(122 % 2 );
    }


}
