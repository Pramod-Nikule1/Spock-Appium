package testUtils

import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.remote.DesiredCapabilities
import pageobjects.screens.Application
import spock.lang.Specification
import java.util.concurrent.TimeUnit

/**
 * Created by pramod.nikule on 17-04-2018.
 *
 */
class BaseSpecification extends Specification {

    Application mApp
    AndroidDriver driver

    def setupSpec() {
        println("In setupSpec()")

    }

    def setup() {
        println("In setup()")
        DesiredCapabilities capabilities = new DesiredCapabilities()
        capabilities.setCapability("deviceName", "Moto E4 Plus")
        capabilities.setCapability("appPackage", "com.fuelprice.fuelprice")
        capabilities.setCapability("appActivity", "com.fuelprice.fuelprice.MainActivity")
        capabilities.setCapability("appWaitActivity", "com.fuelprice.fuelprice.MainActivity")
        capabilities.setCapability("platform", "Android")
        try {
            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities)
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS)
        } catch (MalformedURLException e) {
            e.printStackTrace()
            appiumDriverLocalService.stop()
        }
        mApp = new Application(driver)
    }

    def cleanup() {
        println("In cleanup()")
    }

    def cleanupSpec() {
        println("In cleanupSpec()")
    }
}