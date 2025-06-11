package hooks;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ExtentManager;
import utils.LogHelper;

public class Hooks {
    private static ExtentReports extent = ExtentManager.getExtentReports();
    public static ExtentTest test;

    @Before
    public void beforeScenario(Scenario scenario) {
        test = extent.createTest(scenario.getName());
        LogHelper.logInfo("Starting scenario: " + scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            LogHelper.logError("Scenario failed: " + scenario.getName());
        } else {
            LogHelper.logInfo("Scenario passed: " + scenario.getName());
        }
        extent.flush();
    }
}
