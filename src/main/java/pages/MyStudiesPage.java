package pages;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.testng.Assert;

public class MyStudiesPage extends Page {

    private By myStudiesTitle = By.id("com.teknasyon.coloringbook:id/toolbarTitle");

    public MyStudiesPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void myStudiesPageTitle() {
        String actualTitle = driver.findElement(myStudiesTitle).getText();
        Assert.assertTrue(actualTitle.contains("Çalışmalarım"));
        System.out.println("My Strudies Title: "+ driver.findElement(myStudiesTitle).getText());
    }
}
