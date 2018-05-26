package testNG_Tests.withoutParameterTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.apache.log4j.Logger;

public class Multiply {
Logger logger = Logger.getLogger(Multiply.class);
    @Test
    public void multiply()
    {
        logger.info("Started testing multiply method");
        int a=3, b=7,c;
        c = a * b;
        Assert.assertEquals(21,c);
        logger.info("Finished testing multiply method");
    }
}
