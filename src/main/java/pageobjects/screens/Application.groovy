package pageobjects.screens

import io.appium.java_client.android.AndroidDriver


/**
 * Created by pramod.nikule on 17-04-2018.
 *
 */
class Application {
    HomePage homePage

    Application(AndroidDriver driver) {
        homePage = new HomePage(driver)
    }
}