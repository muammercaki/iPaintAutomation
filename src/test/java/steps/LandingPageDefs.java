package steps;

import base.BaseTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LandingPage;

import java.net.MalformedURLException;

public class LandingPageDefs extends BaseTest {

    LandingPage landingPage;
    HomePage homePage;

    @Given("Landing Page Start")
    public void landingPageStart() throws MalformedURLException {
        setUp();

    }

    @And("First Page Get Title")
    public void firstPageGetTitle() throws InterruptedException {
        Thread.sleep(3000);
        landingPage = new LandingPage(driver);
        landingPage.getFirstPageTitle();
    }

    @And("First Page Get Description")
    public void firstPageGetDescription() {
        landingPage.getFirstPageDescription();
    }

    @When("First Page Skip Button")
    public void firstPageSkipButton() {
        landingPage.clickSkipButton();
    }

    @Then("Go To Second Page Get Title")
    public void goToSecondPageGetTitle() throws InterruptedException {
        landingPage.getSecondPageTitle();
    }

    @And("Second Page Get Description")
    public void secondPageGetDescription() {
        landingPage.getSecondPageDescription();
    }

    @When("Second Page Skip Button")
    public void secondPageSkipButton() {
        landingPage.clickSkipButton();
    }

    @Then("Go To Third Page Get Title")
    public void goToThirdPageGetTitle() {
        landingPage.getThirdPageTitle();
    }

    @And("Third Page Get Description")
    public void thirdPageGetDescription() {
        landingPage.getThirdPageDescription();
    }

    @When("Third Page Skip Button")
    public void thirdPageSkipButton() {
        landingPage.clickSkipButton();
    }

    @And("Close Advertising")
    public void closeAdvertising() throws InterruptedException {
        Thread.sleep(3000);
        landingPage.closeAdvertising1();
        landingPage.closeAdvertising2();
    }

    @Then("Go To Home Page")
    public void goToHomePage() {
        landingPage.implicitlyWait(2);
        homePage = new HomePage(driver);
        homePage.homePage();

    }


}
