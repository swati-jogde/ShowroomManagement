package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CityPage {
	
	   
 WebDriver driver;
 public CityPage(WebDriver driver) {
     this.driver = driver;
     PageFactory.initElements(driver, this); // Add this line
 }

 @FindBy(xpath="//a[contains(text(),'► City')]")
 WebElement city;
 
 @FindBy(xpath="//a[normalize-space()='Add City']")
 WebElement addCity;
 
 @FindBy(xpath="//input[@id='name']")
 WebElement cityName;
 
 @FindBy(xpath="//select[@id='state']")
 WebElement selectState;
 
 @FindBy(xpath="//button[normalize-space()='ADD']")
 WebElement addbutton;
 
 @FindBy(xpath="//button[normalize-space()='Yes, Add !']")
 WebElement yesAdd;

 @FindBy(xpath="//button[normalize-space()='OK']")
 WebElement ok;
 
 public void clickOnCity() {
 	city.click();
 }
 public void clickOnAddCity() {
 	addCity.click();
 }
 public void enterCityName(String cname) {
 	cityName.clear();
 	cityName.sendKeys(cname);
 }
 public void selectStateName(String stname) {
 	Select sc = new Select(selectState);
     sc.selectByVisibleText(stname);
 }
 public void clickOnAdd() {
 	addbutton.click();
 }
 public void clickOnYesAdd() {
 	yesAdd.click();
 }
 public void verifymessageAndClickOnOkButton(String expectedMessage) {
 	
 	WebElement webelement=driver.findElement(By.xpath("//div[contains(text(),'City has been added successfully')]"));
 	
 	String actualmsg = webelement.getText().trim();
 	
	       System.out.println("Expected: " + expectedMessage.trim());
	       

 	System.out.println("Actual:" +actualmsg);
	       Assert.assertEquals(expectedMessage.trim(), actualmsg);
	       
	       ok.click();

 	
 }

}





