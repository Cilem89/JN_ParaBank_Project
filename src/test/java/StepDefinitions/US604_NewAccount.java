package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Locator_US604;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Arrays;

public class US604_NewAccount {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    Locator_US604 lo=new Locator_US604();

    @And("Click on the Element in Open new Account LeftNav")
    public void clickOnTheElementInOpenNewAccountLeftNav() {
        ln.openNewAccount.click();
    }

    @And("Create a new checking account")
    public void createANewCheckingAccount() {
        Select selectAccountType=new Select(dc.accountType);
        selectAccountType.selectByIndex(0);

        lo.verifyContainsText(lo.minBalance,"A minimum of");

        Select accountOption=new Select(dc.accountOption);
        accountOption.selectByIndex(0);

        dc.myClick(dc.openNewAccountButton);
       dc.verifyContainsText(dc.accountOpenMsg,"Congratulations, your account is now open.");

      dc.myClick(dc.newAccountID);
      Assert.assertTrue(dc.accountIdKontrol.isDisplayed(),"Account ID is not displayed");
    }

    @And("Create a new savings account")
    public void createANewSavingsAccount() {
        Select selectAccountType=new Select(dc.accountType);
        selectAccountType.selectByIndex(1);

        lo.verifyContainsText(lo.minBalance,"A minimum of");

        Select accountOption=new Select(dc.accountOption);
        accountOption.selectByIndex(1);

        dc.myClick(dc.openNewAccountButton);
        dc.verifyContainsText(dc.accountOpenMsg,"Congratulations, your account is now open.");

        dc.myClick(dc.newAccountID);
        Assert.assertTrue(dc.accountIdKontrol.isDisplayed(),"Account ID is not displayed");



    }
}
