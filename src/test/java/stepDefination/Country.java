package stepDefination;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.*;
import utils.LogHelper;
import utils.TestDataReader;

public class Country extends BaseSteps {

	@Given("admin launches Chrome browser")
	public void admin_launches_chrome_browser() {
        LogHelper.logInfo("launch chrome browser");
	}

	@When("admin opens URL {string}")
	public void admin_opens_url(String url) {
        driver.get(url);
        LogHelper.logInfo("Url Opened");
	}

	@Then("admin enters valid credentials from JSON index {string}")
	public void admin_enters_valid_credentials_from_json_index(String indexStr) throws InterruptedException {
		int index = Integer.parseInt(indexStr);
        List<Map<String, String>> dataList = TestDataReader.readLoginData(
            "D:\\selenium-eclipse workspace\\project-Cucumber\\TVS_ShowroomManagement\\src\\test\\resources\\testdata\\loginData.json"
        );
        loginData = dataList.get(index);

        String email = loginData.get("email");
        String password = loginData.get("password");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    	Thread.sleep(3000);

	      
	}
	
	@And("Click on login")
	public void clickOnLogin() throws InterruptedException {
		 loginPage.clickLogin();
	      Thread.sleep(3000);     
	        LogHelper.logInfo("login Successfully");
		
	}
	
	

	@Given("admin is on dashboard page")
	public void admin_is_on_dashboard_page() {
        LogHelper.logInfo("dashboard displayed");
	   	}

	@When("the admin navigates to the {string} button")
	public void the_admin_navigates_to_the_button(String section) {
		//driver.switchTo().frame("iframeNameOrId");
		// then find element

		 if (section.equalsIgnoreCase("Location")) {
	            country.clickOnLocation();
	            LogHelper.logInfo("clicked on location ");
	        }
	    	}

	@Then("the admin clicks on the country option")
	public void the_admin_clicks_on_the_country_option() {
		// if (option.equalsIgnoreCase("Country")) {
	            country.clickOnCountry();
	            LogHelper.logInfo("Clicked on Country");

	        }
	    	//}

	@Then("the admin clicks on the {string} button")
	public void the_admin_clicks_on_the_button(String button) {
		 if (button.equalsIgnoreCase("Add Country")) {
	            country.clickOnAddCountry();
	            LogHelper.logInfo("Clicked on add country");

	        }
	    	}

	@Then("the admin enters the country details from JSON index {string}")
	public void the_admin_enters_the_country_details_from_json_index(String indexCo) throws InterruptedException {
		int index = Integer.parseInt(indexCo);

        // Read JSON test data
        List<Map<String, String>> dataList = TestDataReader.readLoginData(
            "D:\\selenium-eclipse workspace\\project-Cucumber\\TVS_ShowroomManagement\\src\\test\\resources\\testdata\\countryData.json");

        countryData = dataList.get(index);

       country.enterCountryName(countryData.get("countryName"));
       country.enterSortName(countryData.get("shortName"));
       country.enterPhoneCode(countryData.get("phoneCode"));
     	Thread.sleep(3000);

       country.ClickOnAddButton();
       LogHelper.logInfo("Country added successfully");

		
	    	}

	@Then("the admin should see the confirmation message {string}")
	public void the_admin_should_see_the_confirmation_message(String expectedMessage) {
		WebElement messageElement;
	        if (expectedMessage.equalsIgnoreCase("Are you sure?")) {
	        	Log.warn("expected title not matched");
	            messageElement = driver.findElement(By.xpath("//h2[@id='swal2-title']"));
	        } else {
	            messageElement = driver.findElement(By.xpath("//div[@id='swal2-html-container']"));
	        }

	        String actualMessage = messageElement.getText();
	        Assert.assertEquals(expectedMessage, actualMessage);
	        LogHelper.logPass("expected title match with actual title");
		

	    	}

	
	
	 @Then("the admin clicks on {string}")
	    public void yes_add_it(String option) throws InterruptedException {
	        if (option.equalsIgnoreCase("Yes, Add it!")) {
	        	Thread.sleep(3000);

	            country.clickYes();
	            LogHelper.logInfo("Admin clicked on yes Add!");

	            Thread.sleep(3000);
	        } else if (option.equalsIgnoreCase("OK")) {
	        	
	            country.clickOK();
	            LogHelper.logInfo("Admin Clicked on ok");


	        }
	    }




}
