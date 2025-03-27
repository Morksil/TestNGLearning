package regression;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {
    @Test(priority=1, groups={"regression", "regression testing"})
    public void doUserRegister(){
        System.out.println("Executing the method doUserRegister test");
        Assert.fail("User did not register successfully.");
    }

    @Test(priority=2, dependsOnMethods={"doUserRegister", "testNumber3"}, groups="regression")
    public void doLogin(){
        System.out.println("Executing the user login test.");
    }
    @Test(priority=3, dependsOnMethods={"doUserRegister"}, alwaysRun=true)
    public void testNumber3(){
        System.out.println("Executing 3rd test.");
        Assert.fail("3rd test failed.");
    }
    @Test(priority=4, dependsOnMethods={"doUserRegister"}, groups="regression")
    public void testNumber4(){
        System.out.println("Executing 4th test.");
    }
}
