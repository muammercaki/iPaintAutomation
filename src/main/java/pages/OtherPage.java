package pages;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OtherPage extends Page {

    private By otherPageTitle = By.id("com.teknasyon.coloringbook:id/toolbarTitle");

    public OtherPage(AndroidDriver driver) {
        super(driver);
    }

    public void otherPageTitle() {

        String actualTitle = driver.findElement(otherPageTitle).getText();
        Assert.assertTrue(actualTitle.contains("Diğerleri"));

    }
}
