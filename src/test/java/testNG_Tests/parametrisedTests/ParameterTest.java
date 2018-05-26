package testNG_Tests.parametrisedTests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class ParameterTest {
    Logger logger = Logger.getLogger(ParameterTest.class);

    @Test(parameters = {"username","password"})
    public void login(String userName, String password)
    {
        System.out.println(userName+":"+password);
        logger.info("Login Successful");
    }
}
