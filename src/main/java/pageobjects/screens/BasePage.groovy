package pageobjects.screens

import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebElement


/**
 * Created by pramod.nikule on 17-04-2018.
 *
 */
class BasePage {
    AndroidDriver driver;

    BasePage(AndroidDriver webDriver){
        driver = webDriver;
    }

    By byId(String id) {
        return By.id("com.fuelprice.fuelprice:id/$id")
    }

    //Replace the scrollable locator with the actual locator
    WebElement scrollTo(String name) {
        return driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                + ".className(\"android.widget.ListView\")).scrollIntoView("
                + "new UiSelector().text(\"$name\"))")
    }
}