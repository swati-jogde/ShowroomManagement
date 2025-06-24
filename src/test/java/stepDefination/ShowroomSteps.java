package stepDefination;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.LogHelper;
import utils.TestDataReader;

public class ShowroomSteps extends BaseSteps {
	

	@Given("sub-admin is on the dashboard page")
	public void admin_is_on_the_dashboard_page() {
		LogHelper.logInfo("Admin logged in");

	}

	@When("sub-admin navigates to the {string} module")
	public void admin_navigates_to_the_showroom(String string) throws InterruptedException {
		showroom.clickOnShowroom();
	    Thread.sleep(3000);
	}

	@When("sub-admin clicks on the {string} button")
	public void clicks_on_the_add_showroom_button(String string) {
		showroom.clickOnAddShowroo();

	   
	}

	@Then("sub-admin fills showroom details from JSON index {string}")
	public void admin_fills_showroom_details_from_json_index(String showIndex) throws InterruptedException {
	  
		int index = Integer.parseInt(showIndex);

        // Read JSON test data
        List<Map<String, String>> dataList = TestDataReader.readLoginData(
            "D:\\selenium-eclipse workspace\\project-Cucumber\\TVS_Showroom_Management\\src\\test\\resources\\testData\\showroomData.json");

        showroomData = dataList.get(index);

     
        showroom.enterShowroom(showroomData.get("ShowroomName"));
        showroom.enterEmail(showroomData.get("Email"));
        showroom.enterPhone(showroomData.get("MobileNumber"));
        showroom.enterInvoiceServiceNum(showroomData.get("InvoiceServicesContactNo"));
        showroom.enterInvoiceSpareNum(showroomData.get("InvoiceSparesContactNo"));
        showroom.enterInvoiceSale(showroomData.get("InvoiceSalesContactNo"));
        showroom.enterInvoiceGst(showroomData.get("GSTNumber"));
        showroom.enterInvoicePan(showroomData.get("PAN_Number"));
        
        
      
        
     	Thread.sleep(3000);


		
	}
	@Then("sub-admin select {string}, {string} and {string} options")
	public void sub_admin_select_country_state_city(String country, String state, String city) {
	    showroom.selectCountry(country);
	    showroom.selectState(state);
	    showroom.selectCity(city);
	}

	@And("sub-admin enter {string}")
	public void sub_admin_enter_address(String field) {
	    if (field.equalsIgnoreCase("address")) {
	        showroom.enterAddress(showroomData.get("address"));
	    } else {
	        throw new IllegalArgumentException("Unsupported field: " + field);
	    }
	}

	@Then("sub-admin clicks the {string} button")
	public void clicks_the_button(String string) {
		showroom.clickOnOkButton();
		showroom.clickOnYesAddButton();
	    	}

	@Then("success message for showroom {string} should be displayed")
	public void success_message_should_be_displayed(String string) {
		showroom.clickOnOkButton();
	   
	}

}
