package pagecomponents;

import base.BasePageComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuNavigationBar  extends BasePageComponent {

    @FindBy(xpath = "//a[contains(text(),'Desktops') and not(contains(text(),'All'))]")
    private WebElement itemDesktops;

    public MenuNavigationBar(WebDriver driver) {
        super(driver);
    }

    public void selectDesktopItem(){

        itemDesktops.click();
        int b=0;
    }

    public void clickDesktopsMenu(){
        itemDesktops.click();
    }
}
