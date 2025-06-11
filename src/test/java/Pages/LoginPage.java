package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
    WebDriver driver;
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    By emailField = By.id("admin_email");
    By passwordField = By.xpath("//input[@onkeyup='Password()']");
    By loginButton = By.xpath("//button[@onclick='login()']");
   
    By emailErrMssg =By.xpath("//*[contains(text(),'Member Not Registered')]");



    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
 
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
       
    }

    public String invalidUsername() {
    	String err= driver.findElement(emailErrMssg).getText();
    	return err;
    	}
    
    
    
    /* @FindBy(xpath="//input[@id='admin_email']")
     WebElement email;
     
     
     @FindBy(xpath="//input[@id='admin_password']")
     WebElement password;
     
     @FindBy(xpath="//button[normalize-space()='Sign In']")
    WebElement login;
    	     
    	     

     public void enterEmail(String emai) {
    	 
    	 email.sendKeys(emai);
  
     }

     public void enterPassword(String pass) {
    	 password.sendKeys(pass);
     }

     public void clickLogin() {
        login.click();
     }
     */
   
}



