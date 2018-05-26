package testNG_Tests.retryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

    int counter = 0;
    int retrycount = 4;
    public boolean retry(ITestResult iTestResult) {
        if (counter<retrycount)
        {
            counter++;
            return true;
        }
        return false;
    }
}
