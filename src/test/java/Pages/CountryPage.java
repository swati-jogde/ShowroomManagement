package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CountryPage {
	
	    
	    WebDriver driver;
	    public CountryPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this); // Add this line
	    }


	    @FindBy(xpath="(//i[@class='bx bxs-chevron-down arrow'])[2]")
	    WebElement location;
	    
	    @FindBy(xpath="(//a[contains(text(),'► Country')])[1]")
	    WebElement country;
	    
	    @FindBy(xpath="//a[normalize-space()='Add Country']")
	    WebElement addcountry;
	    
	    @FindBy(xpath="//input[@onkeyup='checkname()']")
	    		WebElement countryName;
	    
	    @FindBy(xpath="//input[@onkeydown='checksortname()']")
	    WebElement sortName;
	    
	    @FindBy(xpath="(//input[@id='phonecode'])[1]")
	    WebElement phoneCode;
	    
	    @FindBy(xpath="//button[normalize-space()='ADD']")
	    WebElement add;
	    
	    @FindBy(xpath="//button[normalize-space()='Yes, Add !']")
	    WebElement yes;
	    
	    @FindBy(xpath="//button[normalize-space()='OK']")
	    WebElement ok;
	    
	    public void clickOnLocation() {
	    	location.click();
	    }
	    public void clickOnCountry() {
	    	country.click();
	    }
	    public void clickOnAddCountry() {
	    	addcountry.click();
	    }
	    
	    public void enterCountryName(String cname) {
	     countryName.sendKeys(cname);
	    	
	    }
	    public void enterSortName(String sname) {
	    	sortName.sendKeys(sname);
	    }
	    public void enterPhoneCode(String pcode) {
	    	phoneCode.sendKeys(pcode);
	    }
	    public void ClickOnAddButton() {
	    	add.click();
	    }
	    public void clickYes() {
	    	yes.click();
	    }
	    public void clickOK() {
	    	ok.click();
	    }
}
