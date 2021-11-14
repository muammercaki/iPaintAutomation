package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CategoriesPage extends Page {
    private By categoriesTitle = By.id("com.teknasyon.coloringbook:id/toolbarTitle");

    public CategoriesPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void categoriesPageTitle() {
        String actualTitle = driver.findElement(categoriesTitle).getText();
        Assert.assertTrue(actualTitle.equals("Kategoriler"));

    }

}
