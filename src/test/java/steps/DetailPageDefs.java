package steps;

import base.BaseTest;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import pages.DetailPage;


import java.net.MalformedURLException;

public class DetailPageDefs extends BaseTest {

    DetailPage detailPage;
    private By firstPicture= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView");
    private By firstColor=By.id("com.teknasyon.coloringbook:id/back1");
    private By doneButton=By.id("com.teknasyon.coloringbook:id/doneIcon");
    private By saveButton=By.id("com.teknasyon.coloringbook:id/save");

    @Given("Go To Home")
    public void goToHome() throws MalformedURLException {
        setUp();
        detailPage = new DetailPage(driver);
        detailPage.implicitlyWait(3);

        detailPage.closeAdvertising1();
        detailPage.closeAdvertising2();
    }

    @And("Click Home Page First Picture")
    public void clickHomePageFirstPicture() {
        detailPage.clickElement(firstPicture);

    }

    @And("Click First Color In Detail Picture Page")
    public void clickFirstColorInDetailPicturePage() {
        detailPage.clickElement(firstColor);
    }

    @And("Click Done Button")
    public void clickDoneButton() {
        detailPage.clickElement(doneButton);

    }

    @And("Save Button")
    public void saveButton() {
        detailPage.clickElement(saveButton);
    }


}
