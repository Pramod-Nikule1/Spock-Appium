package tests

import testUtils.BaseSpecification


/**
 * Created by pramod.nikule on 20-04-2018.
 */
class Test2 extends BaseSpecification {
    def test2 () {
        given: "Given 2"
        println("In test2 ()")
        mApp.homePage.selectState("Chhattisgarh")
        mApp.homePage.selectCity("Raipur")
        mApp.homePage.clickShowPrices()
    }
}