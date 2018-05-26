package testNG_Tests.withoutParameterTests;

import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.*;

import org.apache.log4j.Logger;

public class AnnotationsTest {
private Logger logger = Logger.getLogger(AnnotationsTest.class);
    @Test
    public void test1()
    {
        logger.info("In Test1");
    }

    @Test
    public void test2()
    {
        logger.info("In Test2");
    }

    @BeforeTest
    public void beforeTest()
    {
        logger.info("Before Test");
    }

    @AfterTest
    public void afterTest()
    {
        logger.info("After Test");
    }

    @BeforeClass
    public void beforeClass()
    {
        logger.info("Before Class");
    }

    @AfterClass
    public void afterClass()
    {
        logger.info("After Class");
    }

    @BeforeSuite
    public void beforeSuite()
    {
        Reporter.log("Started Suite testing");
        logger.info("Before Suite");
    }

    @AfterSuite
    public void afterSuite()
    {
        Reporter.log("Finished Suite testing");
        logger.info("After Suite");
    }

    @BeforeGroups
    public void beforeGroup()
    {
        logger.info("Before Group");
    }

    @AfterGroups
    public void afterGroup()
    {
        logger.info("After Group");
    }


    @BeforeMethod
    public void beforeMethod()
    {
        logger.info("Before Method");
    }

    @AfterMethod
    public void afterMethod()
    {
        logger.info("After Method");
    }

}
