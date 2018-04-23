package tests

import testUtils.BaseSpecification

/**
 * Created by pramod.nikule on 17-04-2018.
 *
 */
class Test1 extends BaseSpecification {

    def test1 () {
        given: "Given 1"
        println("In test1 ()")
        mApp.homePage.selectState("Maharashtra")
        mApp.homePage.selectCity("Mumbai")
        mApp.homePage.clickShowPrices()
    }
}