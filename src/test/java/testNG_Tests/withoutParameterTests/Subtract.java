package testNG_Tests.withoutParameterTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.apache.log4j.Logger;

public class Subtract {

    Logger logger = Logger.getLogger(Subtract.class);
    @Test
    public void subtract()
    {
        logger.info("Started testing subtract method");
        int a=3, b=7,c;
        c = a - b;
        Assert.assertEquals(-4,c);
        logger.info("Finished testing subtract method");
    }
}
