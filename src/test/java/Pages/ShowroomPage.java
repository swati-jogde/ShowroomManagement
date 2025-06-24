package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShowroomPage {
	
	 WebDriver driver;
	 public ShowroomPage(WebDriver driver) {
	     this.driver = driver;
	     PageFactory.initElements(driver, this); // Add this line
	 }

	 @FindBy(xpath="//span[@class='link_name'][normalize-space()='Showrooms']")
	 WebElement showroom;
	 
	 @FindBy(xpath="//a[contains(text(),'Add Showroom')]")
	 WebElement addShowroom;
	 
	 @FindBy(xpath="//input[@id='branch_name']")
	 WebElement showroomName;
	 
	 @FindBy(xpath="//input[@id='email']")
	 WebElement email;
	 
	 @FindBy(xpath="//input[@id='phno']")
	 WebElement phone;
	 
	 @FindBy(xpath="//input[@id='invoice_services']")
	 WebElement invoice_Service;
	 
	 @FindBy(xpath="//input[@id='invoice_spares']")
	 WebElement invoice_Spare;
	 
	 @FindBy(xpath="//input[@id='invoice_sales']")
	 WebElement invoice_sale;
	 
	 @FindBy(xpath="//input[@id='gst']")
	 WebElement gst;
	 
	 @FindBy(xpath="//input[@id='pan']")
	 WebElement pan;
	 
	 @FindBy(xpath="//select[@id='select_country']")
	 WebElement selectCountry;
	 
	 @FindBy(xpath="//select[@id='select_state']")
	 WebElement selectState;
	 
	 @FindBy(xpath="//select[@id='select_city']")
	 WebElement selectCity;
	 
	 @FindBy(xpath="//textarea[@id='address']")
	 WebElement address;
	 
	 @FindBy(xpath="//button[@onclick='return addBranch()']//span[contains(text(),'Submit')]")
	 WebElement submitButton;
	 
	 @FindBy(xpath="//button[normalize-space()='Yes, Add !']")
	 WebElement yesAdd;
	 
	 @FindBy(xpath="//button[normalize-space()='OK']")
	 WebElement ok;
	 
	 public void clickOnShowroom() {
		 showroom.click();	 }
	 
	 public void clickOnAddShowroo() {
		 addShowroom.click();	 
		 }
	 public void enterShowroom(String ShowName) {
		 showroomName.clear();
		 showroomName.sendKeys(ShowName);
		 	 }
	 public void enterEmail(String emaill) {
		 email.clear();
		 email.sendKeys(emaill);
		 	 }
	 public void enterPhone(String mobile) {
		 phone.clear();
		 phone.sendKeys(mobile);
		 	 }
	 public void enterInvoiceServiceNum(String invoiceSer) {
		 invoice_Service.clear();
		 invoice_Service.sendKeys(invoiceSer);
		 	 }
	 
	 public void enterInvoiceSpareNum(String invoiceSpa) {
		 invoice_Spare.clear();
		 invoice_Spare.sendKeys(invoiceSpa);
		 	 }
	 public void enterInvoiceSale(String invoiceSale) {
		 invoice_sale.clear();
		 invoice_sale.sendKeys(invoiceSale);
		 	 }
	 public void enterInvoiceGst(String invoiceGst) {
		 gst.clear();
		gst.sendKeys(invoiceGst);
		 	 }
	 public void enterInvoicePan(String Pan) {
		 pan.clear();
			pan.sendKeys(Pan);
			 	 }
	 public void selectCountry(String country) {
		 Select sc = new Select(selectCountry);
	     sc.selectByVisibleText(country);
			 	 }
	 public void selectState(String state) {
		 Select sc = new Select(selectState);
	     sc.selectByVisibleText(state);
			 	 }
	 public void selectCity(String city) {
		 Select sc = new Select(selectCity);
	     sc.selectByVisibleText(city);
			 	 }
	 public void enterAddress(String Address) {
		 address.clear();
		 address.sendKeys(Address);
	 }
	 public void clickOnSubmitButton() {
		 submitButton.click();
	 }
	 public void clickOnYesAddButton() {
		 yesAdd.click();
	 }
	 public void clickOnOkButton() {
		 ok.click();
	 }
	 
}
