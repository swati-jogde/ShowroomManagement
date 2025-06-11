package Pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    @FindBy(xpath = "//div[contains(text(),'You are about to add state. Are you sure you want to proceed?')]")
    WebElement successMessage;

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
    

    public void verifySuccessMessage(String expectedText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(@class,'alert') and contains(text(),'" + expectedText + "')]")
        ));
        
        String actualText = successMsg.getText().trim();
        Assert.assertTrue(actualText.contains(expectedText));
    }

    public void clickOnYesAdd() {
    	yesadd.click();    }
  

    public void clickOnOk() {
    	ok.click();
    }

   /* public void verifyStateInList(String stateName) {
        WebElement stateInTable = driver.findElement(By.xpath("//td[text()='" + stateName + "']"));
        Assert.assertTrue(stateInTable.isDisplayed());
    }*/
}

    
    
    
    

