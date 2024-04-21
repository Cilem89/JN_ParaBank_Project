package StepDefinitions;


import Pages.Parent;
import Pages.US606_Content;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.GWD;

import java.util.List;

public class TransferFundsSteps extends Parent {

    US606_Content us6 = new US606_Content();
    int sayi=5;
    @And("User should see the transfer complete message")
    public void userShouldSeeTheTransferCompleteMessage() {
        verifyContainsText(us6.transferCompleteMessage, "Transfer Complete");
    }
    @And("User should see transfer sent and debit amount")
    public void userShouldSeeTransferSentAndDebitAmount() {
        wait(1);
        List<WebElement> elements = GWD.getDriver().findElements(By.cssSelector("tr[ng-repeat=\"transaction in transactions\"]:nth-child(1) td"));
        verifyContainsText(elements.get(1), "Funds Transfer Sent");
        verifyContainsText(elements.get(2), "$");
    }
    @And("User enters transaction amount")
    public void userEntersTransactionAmount(DataTable dt) {
        List<List<String>> list = dt.asLists(String.class);

        for (int i = 0; i < list.size(); i++) {
            // GET THE NECESSARY WEB ELEMENT
            wait(1);
            WebElement txtBox = us6.getWebElement(list.get(i).get(0));
            // SEND KEYS TO THAT ELEMENT
            mySendKeys(txtBox, list.get(i).get(1));
        }
    }

    @Then("Click on the Element in Dialog")
    public void clickOnTheElementInDialog() {
        myClick(us6.transferFunds);
        myClick(us6.transferBtn);
        myClick(us6.accountsOverview);
        myClick(us6.accountNum);
    }
}
