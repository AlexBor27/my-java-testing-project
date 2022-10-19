package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagecomponents.MenuNavigationBar;
import pagecomponents.TopNavigationBar;
import pages.DesktopsPage;
import pages.ShoppingCartPage;

public abstract class BasePage {

    protected WebDriver driver;
    TopNavigationBar topNavigationBar;
    MenuNavigationBar menuNavigationBar;

    @FindBy(xpath = "//*[@id=\"logo\"]/a/img")
    protected WebElement homeLogo;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.topNavigationBar = PageFactory.initElements(driver, TopNavigationBar.class);
        this.menuNavigationBar = PageFactory.initElements(driver, MenuNavigationBar.class);
    }

/*     return Page
    public changePage(){
    }*/

    public ShoppingCartPage clickItemShoppingCart(){
        topNavigationBar.goToShoppingCart();
        return new ShoppingCartPage(driver);
    }

    public DesktopsPage clickAllDesctopsPage(){
        menuNavigationBar.selectDesktopItem();
        return new DesktopsPage(driver);
    }

}
