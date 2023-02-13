package com.nopcommercewk13.testsuite;

import com.nopcommercewk13.pages.HomePage;
import com.nopcommercewk13.pages.LoginPage;
import com.nopcommercewk13.pages.RegisterPage;
import com.nopcommercewk13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnLoginLink();
        String actualMsg = loginPage.verifyWelcomeText();
        String expectedMsg = "Welcome, Please Sign In!";
        Assert.assertEquals(actualMsg, expectedMsg, "Login page verified");

    }

    @Test
    public void verifyTheErrorMessageWithInValidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("trusty_trust@yahoo.com");
        loginPage.enterPassword("123456T");
        loginPage.clickOnLoginButton();
        String actualMsg = loginPage.getErrorMessage();
        String expectedMsg = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actualMsg, expectedMsg, "Error message verified");

    }

    @Test
    public void verifyTheuserShouldLoginSuccessfullyWithValidCredentials() {
        homePage.clickOnRegisterLink();
        registerPage.enterFirstName("trusty3");
        registerPage.enterLastName("trust");
        registerPage.enterEmailField("trusty3_trust@yahoo.com");
        registerPage.enterPasswordField("123456T");
        registerPage.confirmPasswordField("123456T");
        registerPage.clickOnRegisterButton();
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("trusty2_trust@yahoo.com");
        loginPage.enterPassword("123456T");
        loginPage.clickOnLoginButton();
        String actualMsg = homePage.verifyLogOutLink();
        String expectedMsg = "Log out";
        Assert.assertEquals(actualMsg, expectedMsg, "Logout Link verified");

    }

    @Test
    public void userShouldLogOutSuccessfully() {
        homePage.clickOnRegisterLink();
        registerPage.enterFirstName("trusty3");
        registerPage.enterLastName("trust");
        registerPage.enterEmailField("trusty3_trust@yahoo.com");
        registerPage.enterPasswordField("123456T");
        registerPage.confirmPasswordField("123456T");
        registerPage.clickOnRegisterButton();
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("trusty3_trust@yahoo.com");
        loginPage.enterPassword("123456T");
        homePage.clickOnLogOutLink();
        String actualMsg = homePage.verifyLogInLink();
        String expectedMsg = "Log in";
        Assert.assertEquals(actualMsg, expectedMsg, "Login Link verified");

    }

}






