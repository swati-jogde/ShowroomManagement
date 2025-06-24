package stepDefination;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import Pages.CityPage;
import Pages.CountryPage;
import Pages.LoginPage;
import Pages.ShowroomPage;
import Pages.StatePage;
import utils.DriverFactory;

import org.apache.logging.log4j.*;

public class BaseSteps {
	

    public WebDriver driver;
    LoginPage loginPage;
    CountryPage country;
    StatePage state;
    CityPage city ;
    ShowroomPage showroom;
    public static Logger Log;
    																				
    Map<String, String> loginData;
    Map<String, String> countryData;
    Map<String,String> showroomData;


    public BaseSteps() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
        country= new CountryPage(driver);
        state =new StatePage(driver);
        city =new CityPage(driver);
        showroom = new ShowroomPage(driver);
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

