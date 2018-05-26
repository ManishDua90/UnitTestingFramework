package testNG_Tests.retryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
    static int count = 0;

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void retry()
    {
        System.out.print("Retry : " + (count+1));
        count++;
        Assert.assertEquals(count,3);
    }
}
