package PageObjectModel;

import Drivers.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.mustache.Value;

import java.util.Calendar;

import java.util.List;

import java.util.concurrent.TimeUnit;
public class EnUygunPage extends AbstractClass {

    WebDriver driver;

    public EnUygunPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="OriginInput")
    private WebElement FromC;
    @FindBy(id="DestinationInput")
    private WebElement ToC;
    @FindBy(id="react-autowhatever-1-section-0-item-0")
    private WebElement ChooseC1;
    @FindBy(id="DepartureDate")
    private WebElement DateB;
    @FindBy(xpath = "(//div[contains(@class,'content')])[134]")
    private WebElement DateC;
    @FindBy(id="oneWayCheckbox")
    private WebElement oneWayC;
    @FindBy(xpath = "//button[contains(.,'Ucuz bilet bul')]")
    private WebElement FindBestD;
    @FindBy(xpath = "(//span[contains(.,'Seç')])[1]")
    private WebElement ChooseF;
    @FindBy(xpath = "//input[@id='contact_email']")
    private WebElement Email;
    @FindBy(xpath = "//input[@id='contact_cellphone']")
    private WebElement phoneNumber;
    @FindBy(xpath = "//input[@id='firstName_0']")
    private WebElement FirstN;
    @FindBy(xpath = "//input[@id='lastName_0']")
    private WebElement LastN;
    @FindBy(xpath = "//select[@id='birthDateDay_0']")
    private WebElement BirtdayD;
    @FindBy(xpath = "//select[@id='birthDateMonth_0']")
    private WebElement BirtdayM;
    @FindBy(xpath = "//select[@id='birthDateYear_0']")
    private WebElement BirtdayY;
    @FindBy(xpath = "//input[@id='publicId_0']")
    private WebElement IdN;
    @FindBy(xpath = "//label[contains(.,'Erkek')]")
    private WebElement Gender;
    @FindBy(xpath = "//input[@id='healthCode_0']")
    private WebElement HealthC;
    @FindBy(xpath = "//button[contains(.,'Ödemeye ilerle')]")
    private WebElement ProceedToC;
    @FindBy(xpath = "//input[@id='cardnumber']")
    private WebElement CardN;
    @FindBy(xpath = "//select[@id='creditCardMonth']")
    private WebElement CreditCardM;
    @FindBy(xpath = "//select[@id='creditCardYear']")
    private WebElement CreditCardY;
    @FindBy(xpath = "//input[@id='cvc']")
    private WebElement CvcN;
    @FindBy(xpath = "//input[@id='cardholder']")
    private WebElement CardH;
    @FindBy(xpath = "//input[contains(@class,'accept-store-card custom-control-input')]")
    private WebElement AgreementC;
    @FindBy(xpath = "(//button[contains(.,'Satın Al')])[1]")
    private WebElement SuccessB;
    @FindBy(xpath = "//div[contains(@class,'popover-content')]")
    private WebElement PlsEnterCardN;

    public void FromCity(String From) {sendKeysFunction(FromC,From); }
    public void ChooseCity1() { clickFunction(ChooseC1);}
    public void ToCity(String To) { sendKeysFunction(ToC, To); }
    public void ChooseCity2() { clickFunction(ChooseC1);}
    public void OneWay() { click(oneWayC);}
    public void DateButton(){clickFunction(DateB);}
    public void DateChoose(){clickFunction(DateC);}
    public void FindBestDeals(){clickFunction(FindBestD);}
    public void ChooseFlight(){clickFunction(ChooseF);}
    public void EMail(String EMail) { sendKeysFunction(Email, EMail); }
    public void MobileP(String PhoneN) { sendKeysFunction(phoneNumber, PhoneN); }
    public void FirstName(String First) {sendKeysFunction(FirstN,First); }
    public void LastName(String Last) {sendKeysFunction(LastN,Last); }
    public void BirthdayDay(String BirthdayDay) {selectByVisibleText(BirtdayD,BirthdayDay);    }
    public void BirthdayMonth(String BirthdayMonth) {selectByVisibleText(BirtdayM,BirthdayMonth);}
    public void BirthdayYear(String BirthdayYear) {selectByVisibleText(BirtdayY,BirthdayYear);}
    public void IdNumber(String IdNumber) {sendKeysFunction(IdN,IdNumber); }
    public void Gender() { click(Gender);}
    public void HealthCode(String HealthCode) {sendKeysFunction(HealthC,HealthCode); }
    public void ProceedToCheckout() { click(ProceedToC);}
    public void CardNumber(String CardNumber) {sendKeysFunction(CardN,CardNumber); }
    public void CreditCardMonth(String CreditCardMonth) {selectByVisibleText(CreditCardM,CreditCardMonth);    }
    public void CreditCardYear(String CreditCardYear) {selectByVisibleText(CreditCardY,CreditCardYear);    }
    public void CvcNumber(String CvcNumber) {sendKeysFunction(CvcN,CvcNumber); }
    public void CardHolder(String CardHolder) {sendKeysFunction(CardH,CardHolder); }
    public void AgreementClick() { click(AgreementC);}
    public void SuccessButton() { click(SuccessB);}
    public void PlsEnterCardNumber(){ Assertion(PlsEnterCardN,"Lütfen geçerli bir kart numarası girin"); }


}
