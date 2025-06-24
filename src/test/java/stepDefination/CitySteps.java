package stepDefination;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.LogHelper;
import utils.TestDataReader;

public class CitySteps extends BaseSteps {
	
    @Given("the admin is log in as admin")
    public void confirmAdminLoggedInForCity() {
        LogHelper.logInfo("Admin logged in");
    }

    @And("the admin navigates to the {string} menu")
    public void navigateToLocationMenu(String menu) {
        country.clickOnLocation();
    }

    @And("the admin clicks on the {string} option")
    public void clickCityOption(String option) {
        city.clickOnCity();
    }

    @When("the admin click on the AC {string} button")
    public void clickAddCityButton(String buttonText) {
        city.clickOnAddCity();
    }

    @And("the admin enters State name from JSON index {string}")
    public void enterCityNameFromJson(String ctIndex) {
        int index = Integer.parseInt(ctIndex);
        List<Map<String, String>> dataList = TestDataReader.readLoginData("src/test/resources/testdata/countryData.json");
        countryData = dataList.get(index);
        state.enterStateName(countryData.get("cityName"));
        LogHelper.logInfo("State name entered");
    }

    @And("the admin selects State as {string}")
    public void selectStateForCity(String stateName) {
        city.selectStateName(stateName);
    }

    @And("the admin clicks on the add {string} button")
    public void clickAddCitySubmitButton(String buttonText) {
        city.clickOnAdd();
    }

    @Then("the admin Click on yes Add button")
    public void confirmCityAddition() {
        city.clickOnYesAdd();
    }

    @Then("the admin verify success message as {string}")
    public void verifyCityAdditionMessage(String expectedMessage) {
        city.verifymessageAndClickOnOkButton(expectedMessage);
    }

    @And("Close the browser")
    public void closeBrowserAfterCitySteps() {
        driver.quit();
    }
}



