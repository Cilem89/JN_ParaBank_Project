package Pages;

import Utilities.GWD;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends ParentPage{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[id='customer.firstName']")
    public WebElement firstName;

    @FindBy(css = "input[id='customer.lastName']")
    public WebElement lastName;

    @FindBy(css = "input[id='customer.address.street']")
    public WebElement address;

    @FindBy(css = "input[id='customer.address.city']")
    public WebElement city;

    @FindBy(css = "input[id='customer.address.state']")
    public WebElement state;

    @FindBy(css = "input[id='customer.address.zipCode']")
    public WebElement zipCode;

    @FindBy(css = "input[id='customer.ssn']")
    public WebElement ssn;

    @FindBy(css = "input[id='customer.username']")
    public WebElement username;

    @FindBy(css = "input[id='customer.password']")
    public WebElement password;

    @FindBy(css = "input[id='repeatedPassword']")
    public WebElement confirmPassword;

    @FindBy(css = "input[value='Register']")
    public WebElement registerBtn;

    @FindBy(xpath = "//div[@id='rightPanel']/p")
    public WebElement msgText;

    @FindBy(xpath = "//input[@name='payee.name']")
    public WebElement payeeName;

    @FindBy(xpath = "//input[@name='payee.address.street']")
    public WebElement payeeStreet;

    @FindBy(xpath = "//input[@name='payee.address.city']")
    public WebElement payeeCity;

    @FindBy(xpath = "//input[@name='payee.address.state']")
    public WebElement payeeState;

    @FindBy(xpath = "//input[@name='payee.address.zipCode']")
    public WebElement payeeZipCode;

    @FindBy(xpath = "//input[@name='payee.phoneNumber']")
    public WebElement payeePhone;

    @FindBy(xpath = "//input[@name='payee.accountNumber']")
    public WebElement accountNumber;

    @FindBy(xpath = "//input[@name='verifyAccount']")
    public WebElement verifyAccount;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement amount;

    @FindBy(xpath = "//select[@name='fromAccountId']")
    public WebElement accountID;

    @FindBy(xpath ="//input[@value='Send Payment']" )
    public WebElement sendPayment;

    @FindBy(xpath = "//div[@ng-show='showResult']/p[1]")
    public WebElement showResult;

    @FindBy(xpath = "//select[@ng-model='types.selectedOption']")
    public WebElement accountType;

    @FindBy(xpath = "//b[contains(text(),'A minimum of $100,00 must be deposited')]")
    public WebElement minBalanceMsgKontrol;

    @FindBy(xpath = "//select[@id='fromAccountId'] ")
    public WebElement accountOption;

    @FindBy (css = "[value='Open New Account']")
    public WebElement openNewAccountButton;

    @FindBy(xpath = "//p[text()='Congratulations, your account is now open.']")
    public WebElement accountOpenMsg;

    @FindBy(xpath = "//a[@id='newAccountId']")
    public WebElement newAccountID;

    @FindBy(xpath = "//td[@id='accountId']")
    public WebElement accountIdKontrol;

    @FindBy(linkText = "Update Contact Info")
    public WebElement updateContactBtn;
    @FindBy(xpath = "//input[@id='customer.firstName']")
    public WebElement updateFirstName;
    @FindBy(linkText = "First name is required.")
    public WebElement firstNamenotrequired;
    @FindBy(xpath = "//input[@value='Update Profile']")
    public WebElement updateProfileBtn;
    @FindBy(linkText = "Profile Updated")
    public WebElement profileUpdated;
    @FindBy(linkText = "Log Out")
    public WebElement logOut;

    @FindBy(linkText = "Request Loan")
    public WebElement requestLoanBtn;

    @FindBy(xpath = "//input[@ng-model='loanRequest.amount']")
    public WebElement loanAmount;

    @FindBy(xpath = "//input[@ng-model='loanRequest.downPayment']")
    public WebElement downPayment;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement fromAccount;

    @FindBy(xpath = "//input[@value='Apply Now]")
    public WebElement applyNowBtn;

    @FindBy(linkText = "Denied")
    public WebElement denied;
    @FindBy(linkText = "We cannot grant a loan in that amount with the given down payment.")
    public WebElement cannotGrant;




}
