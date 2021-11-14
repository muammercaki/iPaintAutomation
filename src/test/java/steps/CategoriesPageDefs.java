package steps;

import base.BaseTest;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.CategoriesPage;

import java.net.MalformedURLException;


public class CategoriesPageDefs extends BaseTest {
    CategoriesPage categoriesPage;

    private By navBarCategories = By.id("com.teknasyon.coloringbook:id/categories");
    private By backCategories = By.id("com.teknasyon.coloringbook:id/back");

    private By firstAnimalPicture = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView");


    @Given("Click Navigation Bar To Categories")
    public void clickNavigationBarToCategories() throws MalformedURLException {
        setUp();
        categoriesPage = new CategoriesPage(driver);
        categoriesPage.implicitlyWait(2);

        categoriesPage.closeAdvertising1();
        categoriesPage.implicitlyWait(3);
        categoriesPage.clickElement(navBarCategories);
    }

    @Then("Categories Page Get Title")
    public void categoriesPageGetTitle() {
        categoriesPage.implicitlyWait(3);
        categoriesPage.categoriesPageTitle();
    }

    @Given("Go To Categories Page With Navigation Bar")
    public void goToCategoriesPageWithNavigationBar() throws MalformedURLException {
        clickNavigationBarToCategories();
        categoriesPage.clickElement(navBarCategories);
    }

    @And("Child Categories Right Swipe")
    public void childCategoriesRightSwipe() {
        categoriesPage.horizontalSwipeByPercentage(0.3,0.1,0.2);
    }

    @And("Child Categories Left Swipe")
    public void childCategoriesLeftSwipe() {
        categoriesPage.horizontalSwipeByPercentage(0.1,0.3,0.2);

    }

    @And("Categories Page Vertical Swipe")
    public void categoriesPageVerticalSwipe() throws InterruptedException {
        categoriesPage.verticalSwipeByPercentages(0.7,0.2,0.5);
    }

    @And("Click Animal Categories First Picture")
    public void clickAnimalCategoriesFirstPicture() throws InterruptedException {
    categoriesPage.clickElement(firstAnimalPicture);
    Thread.sleep(3000);
    }

    @And("Back To Categories")
    public void backToCategories() {
        categoriesPage.clickElement(backCategories);

    }

    @And("Categories Page Swipe Top")
    public void categoriesPageSwipeTop() throws InterruptedException {
        categoriesPage.verticalSwipeByPercentages(0.3,0.9,0.5);
    }
}
