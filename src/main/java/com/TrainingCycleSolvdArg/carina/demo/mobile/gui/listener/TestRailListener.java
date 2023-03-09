package com.TrainingCycleSolvdArg.carina.demo.mobile.gui.listener;

import binding_TestRail.APIException;
import binding_TestRail.TestRailManager;
import com.qaprosoft.carina.core.foundation.report.testrail.ITestRailManager;
import org.testng.*;

import java.io.IOException;

public class TestRailListener extends TestRailManager implements ITestListener, ITestRailManager{

    @Override
    public void onTestStart(ITestResult result) {
        //creamos el test run
        ITestContext context = result.getTestContext();
        try {
            createTestRailRun(context, result);
        } catch (IOException | APIException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        testRailResultUpdate(result, TestRailManager.TEST_CASE_PASSED_STATUS);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        testRailResultUpdate(result, TestRailManager.TEST_CASE_FAILED_STATUS);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        testRailResultUpdate(result, TestRailManager.TEST_CASE_BLOCKED_STATUS);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        //ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        //ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        //ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
    }

}
