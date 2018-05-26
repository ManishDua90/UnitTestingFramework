package testNG_Tests.withoutParameterTests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class PriorityAndSequencingTests {
    Logger logger = Logger.getLogger(PriorityAndSequencingTests.class);

    @Test(priority = 8)
    public void test1(){
        logger.info("test1 with priority 8");
    }

    @Test(priority = 1)
    public void test2(){
        logger.info("test2 with priority 1");
    }
}
