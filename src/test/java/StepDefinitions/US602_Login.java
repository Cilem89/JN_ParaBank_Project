package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US602_Login {

    LeftNav ln=new LeftNav();

    DialogContent dc=new DialogContent();

    @When("Enter username and password and click on the login button")
    public void enterUsernameAndPasswordAndClickOnTheLoginButton() {
        ln.mySendKeys(ln.username,"Javanator");
        ln.mySendKeys(ln.password,"javanator123");
        ln.myClick(ln.login);
    }

    @Then("User should be successfully logged in")
    public void userShouldBeSuccessfullyLoggedIn() {
        ln.verifyContainsText(ln.welcomeMsg, "Techno Study");
    }

    @When("Enter invalid username and password and click on the login button")
    public void enterInvalidUsernameAndPasswordAndClickOnTheLoginButton() {
        ln.mySendKeys(ln.username,"Java");
        //ln.mySendKeys(ln.password,"123");
        ln.myClick(ln.login);
    }

    @Then("User should receive an error message")
    public void userShouldReceiveAnErrorMessage() {
        dc.verifyContainsText(dc.msgText,"Please enter a username and password.");
    }
}
