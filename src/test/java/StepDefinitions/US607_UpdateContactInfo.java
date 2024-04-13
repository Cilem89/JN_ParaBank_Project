package StepDefinitions;

import Pages.DialogContent;
import Pages.ForLogOut;
import Pages.LeftNav;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.testng.Assert;

import java.time.Duration;

public class US607_UpdateContactInfo {

    DialogContent dc=new DialogContent();

    LeftNav ln=new LeftNav();

    ForLogOut fl=new ForLogOut();


    @When("Enter username and password and click on the login button for update test")
    public void enterUsernameAndPasswordAndClickOnTheLoginButtonForUpdateTest() {
        ln.username.sendKeys("AbrahamLinkoln");
        ln.password.sendKeys("Abraham123");
        ln.myClick(ln.login);
    }


    @Given("Navigate to Update Contact Info section")
    public void navigateToUpdateContactInfoSection() {
        dc.updateContactBtn.click();


    }


    @When("Customer change any information")
    public void customerChangeAnyInformation() {
        try {
            Thread.sleep(3000); // 3000 milisaniye = 3 saniye
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dc.updateFirstName.clear();
        dc.updateFirstName.sendKeys("Abraham");
        dc.updateProfileBtn.click();


    }

    @Then("Information will change successfully")
    public void informationWillChangeSuccessfully() {
      //  Assert.assertTrue(dc.profileUpdated.getText().toLowerCase().contains("Profile updated"),"update yapilmadi");
     fl.verifyContainsText(fl.updateProfileVerify, "Profile Updated");

    }

    @And("Customer log out")
    public void customerLogOut() {
    fl.myClick(fl.logOut);

    }

    @And("Information changed'll be verified")
    public void informationChangedLlBeVerified() {

    dc.verifyContainsText(dc.updateFirstName,"Abraham");

    }


}
