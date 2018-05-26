import org.testng.annotations.Test;

public class NoPackageTestToExclude {

    @Test(enabled = false)
    public void toBeIgnored()
    {
        System.out.println("NotIgnored");
    }

    @Test
    public void ignored()
    {
        System.out.println("Ignored");
    }
}
