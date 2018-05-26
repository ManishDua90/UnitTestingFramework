package testNG_Tests.withoutParameterTests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Add {
Logger logger = Logger.getLogger(Add.class);
    @Test
    public void add()
    {
        logger.info("Started testing Add method");
        int a=3, b=7,c;
        c = a + b;
        Assert.assertEquals(10,c);
        logger.info("Finished testing Add method");
    }
}
