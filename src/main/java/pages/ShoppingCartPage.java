package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ActionsHelper;

import static org.junit.Assert.assertEquals;

public class ShoppingCartPage extends BasePage{

    @FindBy(xpath = "//*[contains(text(), 'Continue')]")
    private WebElement continueButton;
    @FindBy(xpath = "//main//p[text() = 'Your shopping cart is empty!']")
    private WebElement shoppingCartEmptyText;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickButtonContinue(){
        ActionsHelper.click(continueButton, driver);
        return new HomePage(driver);
    }

    public ShoppingCartPage verifyCartEmptyTextExist(){
        String text = "Your shopping cart is empty!";
        String actualText = shoppingCartEmptyText.getText();
        assertEquals(text, actualText);
        return this;
    }

}
