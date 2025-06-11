package stepDefination;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import Pages.CountryPage;
import Pages.LoginPage;
import Pages.StatePage;
import utils.DriverFactory;

import org.apache.logging.log4j.*;

public class BaseSteps {
	

    public WebDriver driver;
    LoginPage loginPage;
    CountryPage country;
    StatePage state;
    public static Logger Log;
    																				
    Map<String, String> loginData;
    Map<String, String> countryData;


    public BaseSteps() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
        country= new CountryPage(driver);
        state =new StatePage(driver);
        Log = LogManager.getLogger("LoginSteps");

    }
   /* @Before
    public void login() {
    	
    	driver.get("https://products.pisystindia.com/showroom/admin/login");
    	
    	loginPage.enterEmail("masteradmin@gmail.com");
    	loginPage.enterPassword("Sample@123");
    	loginPage.clickLogin();
    }*/
}

