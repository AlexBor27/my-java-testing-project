package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "//*[contains(text(), 'Continue')]")
    private WebElement continueButton;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickButtonContinue(){
        continueButton.click();
        return new HomePage(driver);
    }
}
