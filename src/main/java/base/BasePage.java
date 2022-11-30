package base;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagecomponents.TopNavigationBar;
import pages.ShoppingCartPage;

public abstract class BasePage {

    protected WebDriver driver;
    TopNavigationBar topNavigationBar;
    @Getter
    private String pageName;

    @FindBy(xpath = "//*[@id=\"logo\"]/a/img")
    protected WebElement homeLogo;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.topNavigationBar = PageFactory.initElements(driver, TopNavigationBar.class);
        pageName = driver.getTitle();
    }

    public ShoppingCartPage clickItemShoppingCart(){
        topNavigationBar.goToShoppingCart();
        return new ShoppingCartPage(driver);
    }


}
