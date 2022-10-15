package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.ShoppingCartPage;

public abstract class BasePage {

    protected WebDriver driver;
    @FindBy(xpath = "//*[@id=\"logo\"]/a/img")
    protected WebElement homeLogo;
    @FindBy(xpath = "//a[@title = 'Shopping Cart']")
    private WebElement shoppingCart;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

/*     return Page
    public changePage(){
    }*/

    public ShoppingCartPage clickItemShoppingCart(){
        shoppingCart.click();
        return new ShoppingCartPage(driver);
    }

}
