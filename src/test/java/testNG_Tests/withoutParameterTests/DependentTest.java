package testNG_Tests.withoutParameterTests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import sun.rmi.runtime.Log;

public class DependentTest {
    Logger logger = Logger.getLogger(DependentTest.class);

    @Test(dependsOnMethods = {"login"})
    public void logout()
    {
        logger.info("This method depends on method LOGIN");
        logger.info("Logout");
    }

    @Test
    public void login()
    {
        logger.info("Login");
    }
}
