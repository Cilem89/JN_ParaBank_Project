package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class US601_Register {

    DialogContent dc=new DialogContent();

    LeftNav ln=new LeftNav();

    @Given("Navigate to the Website Parabank")
    public void navigateToTheWebsiteParabank() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
    }

    @When("Enter customer Data and click on the Register button")
    public void enterCustomerDataAndClickOnTheRegisterButton() {
        ln.myClick(ln.registerBtnLeft);
        dc.mySendKeys(dc.firstName,"Techno");
        dc.mySendKeys(dc.lastName,"Study");
        dc.mySendKeys(dc.address,"xystreet");
        dc.mySendKeys(dc.city,"NewYork");
        dc.mySendKeys(dc.state,"USA");
        dc.mySendKeys(dc.zipCode,"1234");
        dc.mySendKeys(dc.ssn,"1905");
        dc.mySendKeys(dc.username,"Javanator");
        dc.mySendKeys(dc.password,"javanator123");
        dc.mySendKeys(dc.confirmPassword,"javanator123");
        dc.myClick(dc.registerBtn);

    }

    @Then("User should be successfully registered")
    public void userShouldBeSuccessfullyRegistered() {
        dc.verifyContainsText(dc.msgText,"successfully");
    }
}
