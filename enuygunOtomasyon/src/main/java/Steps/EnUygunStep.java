package Steps;

import Drivers.Driver;
import PageObjectModel.EnUygunPage;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class EnUygunStep {


    private WebDriver driver;
    EnUygunPage enUygunPage = new EnUygunPage();

    @Given("^go to enuygun$")
    public void amazon_sitesine_git() throws Throwable {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://www.enuygun.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Website opened.");
    }



    @And ("^from city or airport enter \"([^\"]*)\"$") public void From (String From) throws Throwable { enUygunPage.FromCity(From);System.out.println("from city or airport entered"); }
    @And ("^from city or airport select$") public void Choose1 () throws Throwable { enUygunPage.ChooseCity1();System.out.println("from city or airport is selected");
    }
    @And ("^to city or airport enter \"([^\"]*)\"$") public void To (String To) throws Throwable { enUygunPage.ToCity(To);System.out.println("to city or airport entered");
    }
    @And ("^to city or airport select$") public void Choose2 () throws Throwable { enUygunPage.ChooseCity2();System.out.println("to city or airport is selected"); }
    @And ("^One Way checkbox select$") public void OneWay () throws Throwable { enUygunPage.OneWay();System.out.println("One Way checkbox is selected"); }
    @And ("^Calender select$") public void Calender () throws Throwable { enUygunPage.DateButton();System.out.println("Date Button is clicked"); }
    @And ("^Date Select$") public void DateSelect () throws Throwable { enUygunPage.DateChoose();System.out.println("Date is selected"); }
    @And ("^Find Best Deals Button Select$") public void FindBestDeals () throws Throwable { enUygunPage.FindBestDeals();System.out.println("Find Best Deals Button Selected"); }
    @And ("^Select Flight$") public void ChooseFlight () throws Throwable { enUygunPage.ChooseFlight();System.out.println("Flight Selected"); }
    @And ("^Input Email \"([^\"]*)\"$") public void Email (String Email) throws Throwable { enUygunPage.EMail(Email);System.out.println("e mail has been entered"); }
    @And ("^Input Phone Number \"([^\"]*)\"$") public void PhoneNumber (String PhoneN) throws Throwable { enUygunPage.MobileP(PhoneN);System.out.println("Phone Number has been entered"); }
    @And ("^Input First Name \"([^\"]*)\"$") public void FirstName (String FirstN) throws Throwable { enUygunPage.FirstName(FirstN);System.out.println("First Name has been entered"); }
    @And ("^Input Last Name \"([^\"]*)\"$") public void LastName (String LastN) throws Throwable { enUygunPage.LastName(LastN);System.out.println("Last Name has been entered"); }


    @And ("^Input Birthday Day \"([^\"]*)\"$") public void BirthdayDay(String BirthdayD) throws Throwable { enUygunPage.BirthdayDay(BirthdayD);System.out.println("Birthday day has been entered"); }
    @And ("^Input Birthday Month \"([^\"]*)\"$") public void BirthdayMonth(String BirthdayM) throws Throwable { enUygunPage.BirthdayMonth(BirthdayM);System.out.println("Birthday month has been entered"); }
    @And ("^Input Birthday Year \"([^\"]*)\"$") public void BirthdayYear(String BirthdayY) throws Throwable { enUygunPage.BirthdayYear(BirthdayY);System.out.println("Birthday year has been entered"); }
    @And ("^Input Public Id \"([^\"]*)\"$") public void idNumber (String IdN) throws Throwable { enUygunPage.IdNumber(IdN);System.out.println("Public Id Number has been entered"); }
    @And ("^Input Gender$") public void Gender() throws Throwable { enUygunPage.Gender();System.out.println("Gender has been entered"); }
    @And ("^Input Health Code \"([^\"]*)\"$") public void HealthCode (String HealthC) throws Throwable { enUygunPage.HealthCode(HealthC);System.out.println("Health Code has been entered"); }
    @And ("^Click Proceed To Checkout Button$") public void ProceedToCheckOut() throws Throwable { enUygunPage.ProceedToCheckout();System.out.println("Proceed to checkout button has been clicked"); }
    @And ("^Input Credit Card Number \"([^\"]*)\"$") public void CardNumber (String CardN) throws Throwable { enUygunPage.CardNumber(CardN);System.out.println("Card Number has been entered"); }
    @And ("^Input Credit Card Month \"([^\"]*)\"$") public void CreditCardMonth(String CreditCardM) throws Throwable { enUygunPage.CreditCardMonth(CreditCardM);System.out.println("Credit Card Month has been entered"); }
    @And ("^Input Credit Card Year \"([^\"]*)\"$") public void CreditCardYear(String CreditCardY) throws Throwable { enUygunPage.CreditCardYear(CreditCardY);System.out.println("Credit Card Year has been entered"); }
    @And ("^Input Cvc Number \"([^\"]*)\"$") public void CvcNumber (String CvcN) throws Throwable { enUygunPage.CvcNumber(CvcN);System.out.println("Cvc Number has been entered"); }
    @And ("^Input Card Holder \"([^\"]*)\"$") public void CardHolder (String CardH) throws Throwable { enUygunPage.CardHolder(CardH);System.out.println("Card Holder has been entered"); }
    @And ("^Click I have read and accept the terms of use,rules of flight and privacy policy$") public void AgreementClick() throws Throwable { enUygunPage.AgreementClick();System.out.println("'I have read and accept the terms of use,rules of flight and privacy policy has been clicked"); }
    @When ("^Click Book Button$") public void BookButton() throws Throwable { enUygunPage.SuccessButton();System.out.println("Book button has been clicked"); }
    @Then ("^Please enter a valid credit card number warning is check$")  public void PlsEnterCardNumber() throws Throwable { enUygunPage.PlsEnterCardNumber();System.out.println("Please enter a valid credit card number warning is checked"); }


@After
    public void quitDriver() throws Throwable{

        Thread.sleep(2000);
        driver.close();

}

}
