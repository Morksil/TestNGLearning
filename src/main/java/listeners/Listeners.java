package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Passed test -- " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Capturing screenshot for the Failed test -- " + result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
