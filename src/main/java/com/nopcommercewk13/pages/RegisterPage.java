package com.nopcommercewk13.pages;

import com.nopcommercewk13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());


    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement registerText;
    @FindBy(xpath = "//div[@class='form-fields']/div/div/span[2]")
    WebElement maleFemaleRadioButton;
    @FindBy(xpath="//input[@id='FirstName']")
     WebElement firstNameField;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameField;
    @FindBy(name = "DateOfBirthDay")
     WebElement dateOfBirthDay;
    @FindBy(name = "DateOfBirthMonth")
    WebElement dateOfBirthMonth;
    @FindBy(name = "DateOfBirthYear")
    WebElement dateOfBirthYear;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordField;
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @FindBy(id = "FirstName-error")
    WebElement firstNameRequired;
    @FindBy(id = "LastName-error")
    WebElement lastNameRequired;
    @FindBy(id = "Email-error")
    WebElement emailRequired;
    @FindBy(id = "Password-error")
    WebElement passwordRequired;
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordRequired;
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompletedMessage;
    @FindBy(xpath = "//div[@class='buttons']/a")
    WebElement continueButton;

    public String verifyRegisterText(){
        log.info("Register Text Verify" + registerText.toString());
        return getTextFromElement(registerText);
    }
    public void selectMaleFemaleRadioButton(){
        log.info("Click on Female option" + maleFemaleRadioButton.toString());
    }
    public void enterFirstName(String firstname){
        sendTextToElement(firstNameField,firstname);
    }
    public void enterLastName(String lastname){
        sendTextToElement(lastNameField,lastname);
    }
    public void selectDayofBirth(String day){
        selectByVisibleTextFromDropDown(dateOfBirthDay,day);

    }
    public void selectDateofBirthMonth(String month){
        selectByVisibleTextFromDropDown(dateOfBirthMonth,month);
    }
    public void selectDateofBirthYear(String year){
        selectByVisibleTextFromDropDown(dateOfBirthYear,year);

    }
    public void enterEmailField(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPasswordField(String password){
        sendTextToElement(passwordField,password);
    }
    public void confirmPasswordField(String confirmPassword){
        sendTextToElement(confirmPasswordField,confirmPassword);
    }
    public void clickOnRegisterButton(){
        log.info("Click on Register Button" + registerButton.toString());
        clickOnElement(registerButton);
    }
    public String verifyFirstnameRequired(){
        log.info("Verify First Name Required" + firstNameRequired.toString());
        return getTextFromElement(firstNameRequired);
    }
    public String verifyLastNameRequired(){
        log.info("Verify Last Name Required" + lastNameRequired.toString());
        return getTextFromElement(lastNameRequired);
    }
    public String verifyEmailRequired(){
        log.info("Verify email is Required" + emailRequired.toString());
        return getTextFromElement(emailRequired);
    }
    public String verifyPasswordRequired(){
        log.info("Verify Password Required " + passwordRequired.toString());
        return getTextFromElement(passwordRequired);
    }
    public String verifyConfirmPasswordRequired(){
        log.info("Verify Confirm Password" + confirmPasswordRequired.toString());
        return getTextFromElement(confirmPasswordRequired);
    }
    public String verifyRegistrationCompleteMsg(){
        log.info("Verify Registration Complete Text" + registrationCompletedMessage.toString());
        return getTextFromElement(registrationCompletedMessage);
    }
    public void clickonContinueButton(){
        clickOnElement(continueButton);
    }





}
