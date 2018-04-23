package pageobjects.screens

import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebElement


/**
 * Created by pramod.nikule on 17-04-2018.
 *
 */
class HomePage extends BasePage {

    private By mState = byId("spState")
    private By mCity = byId("spCity")
    private By mShowPrices = byId("btSearch")
    private By mRememberCity = byId("btSave")

    HomePage(AndroidDriver driver) {
        super(driver)
    }

    private WebElement getState() {
        return driver.findElement(mState)
    }

    public void selectState(String mState) {
        getState().click()
        scrollTo(mState).click()
    }

    private WebElement getCity() {
        return driver.findElement(mCity)
    }

    public void selectCity(String city) {
        getCity().click()
        scrollTo(city).click()
    }

    public void clickShowPrices() {
        driver.findElement(mShowPrices).click()
    }

    public void clickRememberCity() {
        driver.findElement(mRememberCity).click()
    }
}