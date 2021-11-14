package steps;

import base.BaseTest;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.HomePage;



import java.net.MalformedURLException;


public class HomePageDefs extends BaseTest {

    HomePage homePage;

    By sliderImage = By.id("com.teknasyon.coloringbook:id/sliderImage");
    By pictureDetailBackButton = By.id("com.teknasyon.coloringbook:id/back");
    By pictureDetail = By.id("com.teknasyon.coloringbook:id/colorImageView");
    By backToHomePage = By.id("com.teknasyon.coloringbook:id/backButton");
    By catPicure = By.id("com.teknasyon.coloringbook:id/colorImageView");
    By flowerDetailELement = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[5]/android.view.ViewGroup/android.widget.ImageView");
    By skipButton = By.id("com.teknasyon.coloringbook:id/skipButton");

    @Given("Home Page Start")
    public void homePageStart() throws MalformedURLException {
        setUp();

        homePage = new HomePage(driver);
        homePage.implicitlyWait(3);
        homePage.closeAdvertising1();
        homePage.closeAdvertising2();
        homePage.homePage();

    }

    @And("Slider Image Click")
    public void sliderImageClick() {
        homePage.clickElement(sliderImage);
    }

    @Then("Slider Detail Page")
    public void sliderDetailPage() throws InterruptedException {
        homePage.implicitlyWait(0);
        homePage.verticalSwipeByPercentages(0.6, 0.3, 0.5);
    }

    @And("Click Picture")
    public void clickPicture() {
        homePage.implicitlyWait(3);
        homePage.clickElement(flowerDetailELement);
    }

    @And("Color Picture Detail")
    public void colorPictureDetail() throws InterruptedException {
        Thread.sleep(3000);
        assert driver.findElement(pictureDetail).isDisplayed() : "Picture Detail Success";
    }

    @And("Back To Categories Page")
    public void backToCategoriesPage() {
        homePage.implicitlyWait(2);
        homePage.clickElement(pictureDetailBackButton);
        //homePage.categoriesPage();
    }

    @Then("Back To Home Page")
    public void backToHomePage() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickElement(backToHomePage);
    }

    @And("Home Page Vertical Swipe")
    public void homePageVerticalSwipe() throws InterruptedException {
        homePage.implicitlyWait(3);
        homePage.verticalSwipeByPercentages(0.9, 0.3, 0.5);
    }

    @And("Tap On Coordinates")
    public void tapOnCoordinates() {
        homePage.tapElementCordinates(800,450);
    }

    @Then("Open Picture Detail")
    public void openPictureDetail() throws InterruptedException {
        Thread.sleep(3000);
        assert driver.findElement(catPicure).isDisplayed():"Picture Detail Success";

    }
}
