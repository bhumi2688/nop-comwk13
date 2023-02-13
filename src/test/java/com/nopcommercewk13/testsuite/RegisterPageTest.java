package com.nopcommercewk13.testsuite;

import com.nopcommercewk13.pages.HomePage;
import com.nopcommercewk13.pages.LoginPage;
import com.nopcommercewk13.pages.RegisterPage;
import com.nopcommercewk13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnRegisterLink();
        String actualMsg = registerPage.verifyRegisterText();
        String expectedMsg = "Register";
        Assert.assertEquals(actualMsg, expectedMsg, "Register Text is verified");
    }

    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
        homePage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        String actualMsg = registerPage.verifyFirstnameRequired();
        String expectedMsg = "First name is required.";
        Assert.assertEquals(actualMsg, expectedMsg, "First name is required is verified");

        String actualMsg1 = registerPage.verifyLastNameRequired();
        String expectedMsg1 = "Last name is required.";
        Assert.assertEquals(actualMsg1, expectedMsg1, "Last name is required is verified");

        String actualMsg2 = registerPage.verifyEmailRequired();
        String expectedMsg2 = "Email is required.";
        Assert.assertEquals(actualMsg2, expectedMsg2, "Email is required is verified");

        String actualMsg3 = registerPage.verifyPasswordRequired();
        String expectedMsg3 = "Password is required.";
        Assert.assertEquals(actualMsg3, expectedMsg3, "Password is required is verified");

        String actualMsg4 = registerPage.verifyConfirmPasswordRequired();
        String expectedMsg4 = "Password is required.";
        Assert.assertEquals(actualMsg4, expectedMsg4, "Password is required is verified");

    }

    @Test
    public void verifyUserShouldCreateAccountSuccessfully() {
        homePage.clickOnRegisterLink();
        registerPage.selectMaleFemaleRadioButton();
        registerPage.enterFirstName("trusty3");
        registerPage.enterLastName("trust");
        registerPage.selectDayofBirth("4");
        registerPage.selectDateofBirthMonth("June");
        registerPage.selectDateofBirthYear("1986");
        registerPage.enterEmailField("trusty3_trust@yahoo.com");
        registerPage.enterPasswordField("123456T");
        registerPage.confirmPasswordField("123456T");
        registerPage.clickOnRegisterButton();
        String actualMsg4 = registerPage.verifyRegistrationCompleteMsg();
        String expectedMsg4 = "Your registration completed";
        Assert.assertEquals(actualMsg4, expectedMsg4, "Registration complete message is verified");


    }


}
