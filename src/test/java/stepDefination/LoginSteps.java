package stepDefination;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;
import utils.LogHelper;
import utils.TestDataReader;

public class LoginSteps extends BaseSteps {
	
	

	
    @Given("User launches Chrome browser")
    public void user_launches_chrome_browser() {
        driver = DriverFactory.getDriver();

        LogHelper.logInfo("launch chrome browser");


    }

    @When("User opens URL {string}")
    public void user_opens_url(String URL) {
        driver = DriverFactory.getDriver();

        driver.get(URL);
	  //  Log.info("url opend");
        LogHelper.logInfo("Url Opened");


    }

    @Then("User enters valid credentials from JSON index {string}")
    public void userEnterValidCredentials(String indexStr) {
        driver = DriverFactory.getDriver();
        int index = Integer.parseInt(indexStr);

        // Read JSON test data
        List<Map<String, String>> dataList = TestDataReader.readLoginData(
            "D:\\selenium-eclipse workspace\\project-Cucumber\\TVS_ShowroomManagement\\src\\test\\resources\\testdata\\loginData.json"
        );

        loginData = dataList.get(index);

        String email = loginData.get("email");
        String password = loginData.get("password");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        LogHelper.logInfo("admin entered username and password");


    }

    @And("Clicks on Login")
    public void clicks_on_login() throws InterruptedException {
         driver = DriverFactory.getDriver();
        Thread.sleep(3000);
        loginPage.clickLogin();
        LogHelper.logInfo("admin login successfully");

    }

    @Then("Page title should match expected title from JSON")
    public void page_title_should_match_expected_title_from_json() {
         driver = DriverFactory.getDriver();
        String actualTitle = driver.getTitle();
        String expectedTitle = loginData.get("expectedTitle");

        System.out.println("Actual Title: " + actualTitle);
        System.out.println("Expected Title: " + expectedTitle);

        Assert.assertEquals("Page title does not match!", expectedTitle, actualTitle);
        LogHelper.logInfo("expected title matches with actual title");
        
        
    }
   
    @Then("Closes the browser")
    public void closes_the_browser() {
        if (driver != null) {
            driver.quit();
            LogHelper.logInfo("close the browser");

        }
    }
	
   }

    

