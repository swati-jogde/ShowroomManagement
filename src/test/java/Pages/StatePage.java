package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StatePage {

	  
    WebDriver driver;
    public StatePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Add this line
    }

    @FindBy(xpath = "(//i[@class='bx bxs-chevron-down arrow'])[2]")
    WebElement Location;

    @FindBy(xpath = "//a[contains(text(),'\u25BA State')]")
    WebElement state;

    @FindBy(xpath = "//a[normalize-space()='Add State']")
    WebElement addState;

    @FindBy(xpath="//input[@onkeyup='checkname()']")
    WebElement stateName;

    @FindBy(id = "country")
    WebElement selectCountry;

    @FindBy(xpath = "//button[normalize-space()='ADD']")
    WebElement addButton;

    @FindBy(xpath="//button[normalize-space()='Yes, Add !']")
    WebElement yesadd;
    
    @FindBy(xpath="//button[normalize-space()='OK']")
    WebElement ok;
    
    public void ClickOnLocation() {
       Location.click();
    }

    public void ClickOnState() {
        state.click();
    }

    public void ClickOnAddState() {
       addState.click();
    }

    public void enterStateName(String stName) {
       stateName.clear();
        stateName.sendKeys(stName);
   }

    public void selectCountryByName(String counName) {
        Select sc = new Select(selectCountry);
        sc.selectByVisibleText(counName);
   }

    public void ClickOnAddButton() {
       addButton.click();
    }
    

    public void clickOnYesAdd() {
    	yesadd.click();   
    } 

   public void clickOnOk() {
   	ok.click();
   }
   /* public void verifyStateInList(String stateName) {
       WebElement stateInTable = driver.findElement(By.xpath("//td[text()='" + stateName + "']"));
        Assert.assertTrue(stateInTable.isDisplayed());
   }*/
    
    
 
}

    
    
    
    

