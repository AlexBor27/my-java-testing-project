package functional;

import base.BaseTest;
import constants.Constants;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;

public class ShoppingCartFunctional extends BaseTest implements Constants {

    // to Base UI Test ??? TODO
    private HomePage page;

    @Override
    @Before
    public void setUp() {
        super.setUp();
        driver.get(SITE_URL);   // move TODO
        page = new HomePage(driver);
    }

    @Test
    public void goToShoppingCartPageScenario(){
//        page.clickItemShoppingCart()
//            .clickButtonContinue();
        page.clickAllDesctopsPage();
    }

}
