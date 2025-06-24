package stepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.LogHelper;
import utils.TestDataReader;

public class StateSteps extends BaseSteps{


     @Given("the Admin is logged in as admin")
   public void admin_is_logged_in_as_admin() {
       //loginPage.performLogin("admin", "admin123"); // Adjust username/password or fetch from config/JSON
       LogHelper.logInfo("Admin logged in");

    }

     @Given("the Admin navigates to the {string} menu")
      public void admin_navigates_to_the_menu(String menu) {
       state.ClickOnLocation();
       LogHelper.logInfo("Admin Cliked on Location");

    }

    @Given("the Admin clicks on the {string} option")
    public void admin_clicks_on_the_option(String option) {
        state.ClickOnState();
        LogHelper.logInfo("admin clicked on state button");

    }
    @When("the Admin clicks on the {string} button")
    public void admin_clicks_on_the_button(String button) {
        state.ClickOnAddState();;
        LogHelper.logInfo("admin Cliked on add state button");

    }

    @When("the Admin enters State name from JSON index {string}")
    public void admin_enters_state_name_from_json_index(String stIndex) throws InterruptedException {
        int index = Integer.parseInt(stIndex);
        List<Map<String, String>> dataList = TestDataReader.readLoginData("src/test/resources/testdata/countryData.json");
        countryData = dataList.get(index);
        state.enterStateName(countryData.get("stateName"));
            LogHelper.logInfo("State name entered ");

    }
  @When("the Admin selects Country as {string}")
   public void admin_selects_country_as(String countryName) {
        state.selectCountryByName(countryName);
        state.ClickOnAddButton();

      LogHelper.logInfo("Country selected successfully.");
  }

    @When("the Admin clicks the {string} button")
         public void admin_clicks_the_submit_button(String buttonName) {
        LogHelper.logInfo("clicked on add button ...");
        state.clickOnYesAdd();;
    }

    @Then("A success message should be displayed {string}")
    public void a_success_message_should_be_displayed1(String expectedMessage) {
        WebElement messageElement = driver.findElement(By.xpath("//div[contains(text(),'State has been added successfully')]"));
        String actualMessage = messageElement.getText().trim();

        System.out.println("Expected: " + expectedMessage);
        System.out.println("Actual: " + actualMessage);

        state.clickOnOk();
    }}
//
//  /*  @Then("The new state {string} should appear in the state list")
//    public void the_new_state_should_appear_in_the_state_list(String stateName) {
//        state.verifyStateInList(stateName);
//        LogHelper.logInfo("State should added in state list");
//
//    }*/
	