package base;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.Page;
import utils.Links;


import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public static AndroidDriver<MobileElement> driver;
    public static DesiredCapabilities caps;
    protected static Page page;

    @BeforeTest
    public static void setUp() throws MalformedURLException {
        caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("udid", "7ec3c361");
        caps.setCapability("platformVersion", "10");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "9T");
        caps.setCapability("noReset", "True");
        caps.setCapability("fullReset", "False");
        caps.setCapability("app", System.getProperty("user.dir") + "/apps/app-release.apk");

        driver = new AndroidDriver(new URL(Links.appiumLocal), caps);


    }

    @AfterTest
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
