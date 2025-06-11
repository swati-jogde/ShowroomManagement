package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    public static ExtentReports extent;

    public static ExtentReports getExtentReports() {
        if (extent == null) {
            ExtentSparkReporter reporter = new ExtentSparkReporter("Report/Spark.html");
            extent = new ExtentReports();
            extent.attachReporter(reporter);

            // System Info
            extent.setSystemInfo("OS", "Windows");
            extent.setSystemInfo("User", "Swati");
            extent.setSystemInfo("AppName", "TVS Automation");
        }
        return extent;
    }
}
