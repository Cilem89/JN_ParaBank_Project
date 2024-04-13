package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locator_US604 extends ParentPage{
    public Locator_US604 (){
        PageFactory.initElements(GWD.getDriver(),this);
    }


    @FindBy (xpath = "//b[contains(text(),'A minimum of $')]")
    public WebElement minBalance;

}
