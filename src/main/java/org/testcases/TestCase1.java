package org.testcases;
import org.testng.annotations.*;

public class TestCase1 {
    @BeforeTest
    public void creatingDBConnection(){
        System.out.println("CreatingDBConnection");
    }
    @AfterTest
    public void closingDBConnection(){
        System.out.println("ClosingDBConnection");
    }
    @BeforeMethod
    public void launchBrowser(){
        System.out.println("Launching browser.");
    }
    @AfterMethod
    public void closingBrowser(){
        System.out.println("Closing browser.");
    }
    @Test(priority=2, groups="functional")
    public void doLogin(){
        System.out.println("Executing login test.");
    }
    @Test(priority=1, groups="functional")
    public void doUserRegistration(){
        System.out.println("Executing user registration.");
    }
}
