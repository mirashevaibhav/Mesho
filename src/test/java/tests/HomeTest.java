package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import testbase.WebTestBase;

public class HomeTest extends WebTestBase {
    public HomePage homePage;

    public HomeTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initializations();
        homePage = new HomePage();
    }

    @Test()
    public void verifyMouseover() {
        SoftAssert softAssert = new SoftAssert();
        homePage.mouseover();
        softAssert.assertAll();
    }

    @Test()
    public void verifyScrollMethod()  {
        SoftAssert softAssert = new SoftAssert();
        homePage.scrollByElement();
        softAssert.assertAll();

    }
    @Test
    public void verifyDropDown(){
        SoftAssert softAssert = new SoftAssert();
        homePage.scrollByElement();
        homePage.dropDown();
        softAssert.assertAll();
    }
    @Test
    public void VerifyCheckBox(){
        SoftAssert softAssert=new SoftAssert();
        homePage.scrollByCategory();
        homePage.checkBoxSelect();
        softAssert.assertAll();

    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}






