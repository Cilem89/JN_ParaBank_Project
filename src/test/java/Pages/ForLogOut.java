package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForLogOut extends ParentPage{

    public ForLogOut() {
        PageFactory.initElements(GWD.getDriver(), this);
}
    @FindBy(xpath = "//*[@id='leftPanel']/ul/li[8]/a")
    public WebElement logOut;


    @FindBy(xpath = "//h1[text()='Profile Updated']")
    public WebElement updateProfileVerify;
}
