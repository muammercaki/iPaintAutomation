package steps;

import base.BaseTest;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CategoriesPage;

import java.net.MalformedURLException;


public class CategoriesPageDefs extends BaseTest {
    CategoriesPage categoriesPage;


    @Given("Click Navigation Bar To Categories")
    public void clickNavigationBarToCategories() throws MalformedURLException {
        setUp();
        categoriesPage = new CategoriesPage(driver);
        categoriesPage.implicitlyWait(2);
        categoriesPage.clikCloseAdvertising();
        categoriesPage.implicitlyWait(3);
        categoriesPage.clickElement(categoriesPage.navBarCategories);
    }

    @Then("Categories Page Get Title {string}")
    public void categoriesPageGetTitle(String categoriesTitle) {
        categoriesPage.implicitlyWait(3);
        categoriesPage.getTitlePage(categoriesPage.categoriesTitle,categoriesTitle);

    }

    @Given("Go To Categories Page With Navigation Bar")
    public void goToCategoriesPageWithNavigationBar() throws MalformedURLException {
        clickNavigationBarToCategories();
        categoriesPage.clickElement(categoriesPage.navBarCategories);
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
    categoriesPage.clickElement(categoriesPage.firstAnimalPicture);
    Thread.sleep(3000);
    }

    @And("Back To Categories")
    public void backToCategories() {
        categoriesPage.clickElement(categoriesPage.backCategories);

    }

    @And("Categories Page Swipe Top")
    public void categoriesPageSwipeTop() throws InterruptedException {
        categoriesPage.verticalSwipeByPercentages(0.3,0.9,0.5);
    }
}
