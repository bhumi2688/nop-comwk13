package com.nopcommercewk13.pages;

import com.nopcommercewk13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());


    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputerText;
    @FindBy(xpath = "//div[@class='item-grid']/div[1]/div/div[2]/h2/a")
    WebElement buildYourOwnComputerLink;
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropDown;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramDropDown;
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement radioButtonHDD;
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement radioButtonOS;
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwareCheckBox;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;
    @FindBy(xpath = "//div[@class='bar-notification success']/p")
    WebElement productAddedMessage;

    public void clickOnBuildYourOwnComputerLink() {
        clickOnElement(buildYourOwnComputerLink);
        log.info("Click on Link" + buildYourOwnComputerLink.toString());
    }

    public String verifyBuildYourOwnComputerText() {
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void selectByProcessorDropDown(String processor) {
        selectByVisibleTextFromDropDown(processorDropDown, processor);
    }

    public void selectByRamDropDown(String ram) {
        selectByVisibleTextFromDropDown(ramDropDown, ram);
    }

    public void clickOnRadioButtonHDD(String hdd) {
        clickOnElement(radioButtonHDD);
        log.info("Click on Radio Button HDD" + radioButtonHDD.toString());
    }

    public void clickOnRadioButtonOS(String os) {
        clickOnElement(radioButtonOS);
        log.info("Click on Radio Button OS" + radioButtonOS.toString());
    }

    public void clickOnSoftwareCheckBox(String software) {
        clickOnElement(softwareCheckBox);
        log.info("Click on Software Checkbox" + softwareCheckBox.toString());
    }

    public void clickonAddtoCartButton() {
        clickOnElement(addToCartButton);
        log.info("Click on Add to Cart Button " + addToCartButton.toString());
    }

    public String verifyProductAddedMessage() {
        log.info("Product Added Text" + productAddedMessage.toString());
        return getTextFromElement(productAddedMessage);
    }

    public void makeyourown(String processor, String ram, String hdd, String os, String software) {
        selectByProcessorDropDown(processor);
        selectByRamDropDown(ram);
        clickOnRadioButtonHDD(hdd);
        clickOnRadioButtonOS(os);
        clickOnSoftwareCheckBox(software);
    }


}
