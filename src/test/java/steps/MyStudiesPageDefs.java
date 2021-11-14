package steps;

import base.BaseTest;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.CategoriesPage;
import pages.MyStudiesPage;
import pages.Page;

import java.net.MalformedURLException;

public class MyStudiesPageDefs extends BaseTest {
    MyStudiesPage myStudiesPage;
    CategoriesPage categoriesPage;
    Page page;
    private By navBarMyStudies = By.id("com.teknasyon.coloringbook:id/myWork");
    private By startPaintingButton = By.id("com.teknasyon.coloringbook:id/startPainting");

    @Given("Go To My Studies Page")
    public void goToMyStudiesPage() throws MalformedURLException {
        setUp();

        myStudiesPage = new MyStudiesPage(driver);
        page = new Page(driver);
        page.implicitlyWait(3);
        myStudiesPage.closeAdvertising1();
        // homePage.closeAdvertising2();

        myStudiesPage.clickElement(navBarMyStudies);

    }

    @Given("My Studies Page Get Title")
    public void myStudiesPageGetTitle() {
        myStudiesPage.myStudiesPageTitle();
    }

    @Given("Click Start Painting Button")
    public void clickStartPaintingButton() {
        myStudiesPage.clickElement(startPaintingButton);
    }

    @Then("Go To Categories Page")
    public void goToCategoriesPage() throws InterruptedException {
        Thread.sleep(3000);
        categoriesPage = new CategoriesPage(driver);
        categoriesPage.categoriesPageTitle();
    }
}
