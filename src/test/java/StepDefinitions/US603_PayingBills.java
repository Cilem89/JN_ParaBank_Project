package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class US603_PayingBills {

    LeftNav ln=new LeftNav();

    DialogContent dc=new DialogContent();

@When("Click on the BillPay button")
    public void clickonTheBillPaybutton(){
    ln.myClick(ln.billPay);
}
@Then("Fill the payee Electric information")
    public void fillThePayeeElectricinformation(){
    dc.mySendKeys(dc.payeeName,"Enerya Elektirik");
    dc.mySendKeys(dc.payeeStreet,"Cumhuriyet sk.no 1");
    dc.mySendKeys(dc.payeeCity,"Aydin");
    dc.mySendKeys(dc.payeeState,"İzmir");
    dc.mySendKeys(dc.payeeZipCode,"09400");
    dc.mySendKeys(dc.payeePhone,"05550863256");
    dc.mySendKeys(dc.accountNumber,"2707");
    dc.mySendKeys(dc.verifyAccount,"2707");
    dc.mySendKeys(dc.amount,"700");


    }


    @And("Click on The sendPayment button")
    public void clickOnTheSendPaymentButton() {
        dc.myClick(dc.sendPayment);
    }

    @When("Fill the payee Water information")
    public void fillThePayeeWaterInformation() {
        dc.mySendKeys(dc.payeeName,"Aydem Su");
        dc.mySendKeys(dc.payeeStreet,"Cumhuriyet sk.no 1");
        dc.mySendKeys(dc.payeeCity,"Aydin");
        dc.mySendKeys(dc.payeeState,"İzmir");
        dc.mySendKeys(dc.payeeZipCode,"09400");
        dc.mySendKeys(dc.payeePhone,"05550863256");
        dc.mySendKeys(dc.accountNumber,"2707");
        dc.mySendKeys(dc.verifyAccount,"2707");
        dc.mySendKeys(dc.amount,"400");
    }

    @When("Fill the payee Gas Invoice information")
    public void fillThePayeeGasInvoiceInformation() {
        dc.mySendKeys(dc.payeeName,"Gas Aydın");
        dc.mySendKeys(dc.payeeStreet,"Cumhuriyet sk.no 1");
        dc.mySendKeys(dc.payeeCity,"Aydin");
        dc.mySendKeys(dc.payeeState,"İzmir");
        dc.mySendKeys(dc.payeeZipCode,"09400");
        dc.mySendKeys(dc.payeePhone,"05550863256");
        dc.mySendKeys(dc.accountNumber,"2707");
        dc.mySendKeys(dc.verifyAccount,"2707");
        dc.mySendKeys(dc.amount,"300");
    }
}

