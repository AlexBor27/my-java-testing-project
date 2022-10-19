package pagecomponents;

import base.BasePageComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationBar extends BasePageComponent{

    @FindBy(xpath = "//a[@title = 'Shopping Cart']")
    private WebElement shoppingCart;

    public TopNavigationBar(WebDriver driver) {
        super(driver);
    }

    public void goToShoppingCart(){
        shoppingCart.click();
    }
}
