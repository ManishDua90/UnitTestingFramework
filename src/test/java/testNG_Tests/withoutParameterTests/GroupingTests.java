package testNG_Tests.withoutParameterTests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class GroupingTests {
    Logger logger = Logger.getLogger(GroupingTests.class);

    @Test(groups = {"Group1"})
    public void test1Group1()
    {
        logger.info("In Test1 Group1");
    }

    @Test(groups = {"Group1"})
    public void test2Group1()
    {
        logger.info("In Test2 Group1");
    }


    @Test(groups = {"Group2"})
    public void test1Group2()
    {
        logger.info("In Test1 Group2");
    }

    @Test(groups = {"Group2"})
    public void test2Group2()
    {
        logger.info("In Test2 Group2");
    }
}
