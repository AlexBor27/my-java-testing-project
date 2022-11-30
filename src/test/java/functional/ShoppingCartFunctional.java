package functional;

import base.BaseTest;
import constants.Constants;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;

public class ShoppingCartFunctional extends BaseTest implements Constants {

    private HomePage page;

    @Override
    @Before
    public void setUp() {
        super.setUp();
        driver.get(SITE_URL);
        page = new HomePage(driver);
    }

    @Test
    public void goToShoppingCartPageScenario(){
        page.clickItemShoppingCart()
            .verifyCartEmptyTextExist();
        // test to revert
    }
}
