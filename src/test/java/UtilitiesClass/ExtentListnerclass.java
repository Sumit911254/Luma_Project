package UtilitiesClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentListnerclass implements ITestListener {
    ExtentReports report;
    ExtentSparkReporter sparkreporter;
    ExtentTest test;

    public void configreport(){

        report=new ExtentReports();
        sparkreporter =new ExtentSparkReporter("D:\\Luma_Project\\Reports\\report1.html");
        report.attachReporter(sparkreporter);


        report.setSystemInfo("User","Sumit Kumar");
        report.setSystemInfo("System","Window");
        report.setSystemInfo("Device","Lenevo");


        sparkreporter.config().setDocumentTitle("Report");
        sparkreporter.config().setReportName("New Report");
        sparkreporter.config().setTheme(Theme.STANDARD);


    }
   public void onStart(ITestContext context) {
        configreport();
       System.out.println("On Start");
    }

    public void onTestStart(ITestResult result) {
        System.out.println("On Test Start");


    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Case Success");
        test=report.createTest(result.getName());
        test.log(Status.PASS,"Test Case Pass");



    }

   public void onTestFailure(ITestResult result) {
       System.out.println("On Test Fail"+" "+result.getTestName());
       test=report.createTest(result.getName());
       test.log(Status.FAIL,"Tset Case Fail");





    }

 public void onTestSkipped(ITestResult result) {
     System.out.println("on Test Skipped"+" "+result.getTestName());
     test=report.createTest(result.getName());
     test.log(Status.SKIP,"Test Case Skipped");


    }

  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }
   public void onFinish(ITestContext context) {
       System.out.println("On Method Finish");
       report.flush();

    }

}

