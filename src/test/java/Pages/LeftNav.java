package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage {

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    public WebElement registerBtnLeft;

    @FindBy(css = "input[name='username']")
    public WebElement username;
    @FindBy(css = "input[name='password']")
    public WebElement password;

    @FindBy(css = "input[value='Log In']")
    public WebElement login;

    @FindBy(xpath = "//div[@id='leftPanel']/p")
    public WebElement welcomeMsg;

    @FindBy(xpath = "//a[text()='Bill Pay']")
    public WebElement billPay;

    @FindBy(xpath = "//a[text()='Accounts Overview']")
    public WebElement accountOverview;

    @FindBy(xpath = "//a[text()='Open New Account']")
    public WebElement openNewAccount;



}
