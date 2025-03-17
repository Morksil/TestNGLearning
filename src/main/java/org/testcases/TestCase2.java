package org.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {
    @Test
    public void validateTitles(){
        System.out.println("Beggining!");
        String expectedTitle = "Yahoo.com";
        String actualTitle = "google.com";

        /*if(expectedTitle.equals(actualTitle)){
            System.out.println("Test case passed.");
        }else{
            System.out.println("Test case failed.");
            //Assert.fail("Test failed.");
        }*/

        SoftAssert softAssert = new SoftAssert();

        System.out.println("Assertion #1");
        softAssert.assertEquals(actualTitle, expectedTitle, "Assertion #1 failed.");
        //Assert.assertTrue(false, "Element not found");

        System.out.println("Assertion #2");
        softAssert.assertEquals(true, false, "Assertion #2 failed.");

        System.out.println("Assertion #3");
        softAssert.assertEquals(true, false, "Assertion #3 failed.");

        System.out.println("Ending!");
        softAssert.assertAll();
    }
}
