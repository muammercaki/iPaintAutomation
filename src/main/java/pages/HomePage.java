package pages;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


public class HomePage extends Page {

    private By navBarHomePage = By.id("com.teknasyon.coloringbook:id/home");

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void homePage() {
        assert driver.findElement(navBarHomePage).isDisplayed() : "Home Page Loaded Success";
    }




}
