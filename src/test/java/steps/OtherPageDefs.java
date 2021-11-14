package steps;

import base.BaseTest;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.OtherPage;

import java.net.MalformedURLException;

public class OtherPageDefs extends BaseTest {
    OtherPage otherPage;
    private By navBarOtherPage = By.id("com.teknasyon.coloringbook:id/others");
    private By concactUsButton = By.id("com.teknasyon.coloringbook:id/contactUsTextView");
    private By addMessageButton = By.id("com.teknasyon.coloringbook:id/action_add_new_ticket");
    private By writeToUsButton = By.id("com.teknasyon.coloringbook:id/pre_screen_button");
    private By topicField = By.id("com.teknasyon.coloringbook:id/dropdown");
    private By messageField = By.id("com.teknasyon.coloringbook:id/textarea_edit_text");
    private By submitButton = By.id("com.teknasyon.coloringbook:id/create_ticket_button");
    private By selectTopic = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");

    private By nameField = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
    private By emailField = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
    private By successMessage = By.id("com.teknasyon.coloringbook:id/success_screen_subtitle");

    private By appLanguageButton=By.id("com.teknasyon.coloringbook:id/languageText");
    private By englishLanguage=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[7]/android.widget.TextView");
    private By turkishLanguage=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[12]/android.widget.TextView");


    @Given("Go To Other Page")
    public void goToOtherPage() throws MalformedURLException {
        setUp();
        otherPage = new OtherPage(driver);
        otherPage.implicitlyWait(2);

        otherPage.closeAdvertising1();
        // otherPage.closeAdvertising2();
        otherPage.implicitlyWait(3);
        otherPage.clickElement(navBarOtherPage);

    }

    @Given("Other Page Get Title")
    public void categoriesPage() {
        otherPage.otherPageTitle();
    }

    @And("Click Contact Us Button")
    public void clickContactUsButton() {
        otherPage.clickElement(concactUsButton);
    }

    @Then("Open Contact Us Page")
    public void addContactUsPage() {
        otherPage.clickElement(addMessageButton);
    }

    @And("Click Write To Us Button")
    public void clickWriteToUsButton() {
        otherPage.implicitlyWait(2);
        otherPage.clickElement(writeToUsButton);
    }

    @And("Name Field is Filled")
    public void nameFieldIsFilled() {
        otherPage.implicitlyWait(2);
        otherPage.sendText(nameField,"test user");
    }

    @And("Email Field is Filled")
    public void emailFieldIsFilled() {
        otherPage.sendText(emailField, "testuser@test.com");
    }

    @And("Topic is Selected")
    public void topicIsSelected() throws InterruptedException {
        otherPage.clickElement(topicField);
        Thread.sleep(3000);
        otherPage.clickElement(selectTopic);
    }

    @And("Write To Message")
    public void writeToMessage() {
        otherPage.sendText(messageField,"send message text");
    }


    @And("Screen Down Swipe")
    public void screenDownSwipe() throws InterruptedException {
        otherPage.verticalSwipeByPercentages(0.5, 0.3, 0.5);
    }

    @And("Click Submit Button")
    public void clickSubmitButton() {
        otherPage.clickElement(submitButton);
    }

    @Then("Send Message Successfully")
    public void sendMessageSuccessfully() {
        String actualText = driver.findElement(successMessage).getText();
        Assert.assertTrue(actualText.contains("Teşekkürler"));

    }

    @And("Click App Language Button")
    public void clickAppLanguageButton() {
        otherPage.implicitlyWait(2);
        otherPage.clickElement(appLanguageButton);
    }

    @And("Select English")
    public void selectEnglish() {
        otherPage.clickElement(englishLanguage);
    }

    @Then("Change App Language English")
    public void changeAppLanguageEnglish() {
        otherPage.implicitlyWait(2);
        String actualtext=driver.findElement(appLanguageButton).getText();
        Assert.assertTrue(actualtext.contains("English"));
    }

    @And("Second Click App Language Button")
    public void secondClickAppLanguageButton() {
        otherPage.clickElement(appLanguageButton);
    }

    @And("List Vertical Swipe")
    public void listVerticalSwipe() throws InterruptedException {
        Thread.sleep(3000);
        otherPage.verticalSwipeByPercentages(0.9, 0.1, 0.5);

    }

    @And("Select Turkish")
    public void selectTurkish() throws InterruptedException {
        Thread.sleep(3000);
        otherPage.clickElement(turkishLanguage);

    }

    @Then("Change App Language Turkish")
    public void changeAppLanguageTurkish() {
        otherPage.implicitlyWait(2);
        String actualtext=driver.findElement(appLanguageButton).getText();
        Assert.assertTrue(actualtext.contains("Türkçe"));
    }



}
