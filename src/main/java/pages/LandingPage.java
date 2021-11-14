package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LandingPage extends Page {


    public LandingPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private By pageTitle = By.id("com.teknasyon.coloringbook:id/headerText");
    private By pageDetailText = By.id("com.teknasyon.coloringbook:id/detailText");


    public void getFirstPageTitle() {
        String actualTitle = driver.findElement(pageTitle).getText();
        Assert.assertTrue(actualTitle.contains("Rahatlayın"));

    }

    public void getFirstPageDescription() {
        String actualDesc = driver.findElement(pageDetailText).getText();
        Assert.assertTrue(actualDesc.contains("Birbirinden harika resim koleksiyonumuzdan dilediğinizi seçin ve boyayarak rahatlayın."));

    }

    public void getSecondPageTitle() throws InterruptedException {
        Thread.sleep(1000);
        String actualTitle = driver.findElement(pageTitle).getText();
        Assert.assertTrue(actualTitle.contains("Yaratıcı Olun"));

    }

    public void getSecondPageDescription() {
        String actualDesc = driver.findElement(pageDetailText).getText();
        Assert.assertTrue(actualDesc.contains("Yaratıcılığınızı konuşturun! Tasarlayacağınız resimleri arkadaşlarınızla paylaşın ve beğeni toplayın."));

    }

    public void getThirdPageTitle() {
        String actualTitle = driver.findElement(pageTitle).getText();
        Assert.assertTrue(actualTitle.contains("Muhteşem Paletler"));

    }

    public void getThirdPageDescription() {
        String actualDesc = driver.findElement(pageDetailText).getText();
        Assert.assertTrue(actualDesc.contains("Birbirinden harika renk paletlerini keşfedin. Artık hazırsınız."));

    }

}
