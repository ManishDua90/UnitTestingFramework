package testNG_Tests.parametrisedTests;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sun.rmi.runtime.Log;

public class DataProviderTest {
    Logger logger = Logger.getLogger(DataProviderTest.class);

    @DataProvider(name = "Authentication")
    public Object[][] dataProvider()
    {
        Object[][] object = new Object[][]{{"testUser1","test@123"},{"testUser2","test@987"}};
        return object;
    }

    @Test(dataProvider = "Authentication")
    public void login(String username, String password)
    {

        System.out.println(username+":"+password);
        logger.info("Login Successful");
    }
}
