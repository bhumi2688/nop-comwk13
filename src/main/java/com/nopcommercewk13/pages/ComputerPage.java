package com.nopcommercewk13.pages;

import com.nopcommercewk13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());


    public ComputerPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]")
    WebElement computerText;
    @FindBy(xpath = "//div[@class='item-grid']/div[1]")
    WebElement desktopsLink;
    @FindBy(xpath = "//div[@class='item-grid']/div[2]")
    WebElement noteBooksLink;
    @FindBy(xpath = "//div[@class='item-grid']/div[3]")
    WebElement softWareLink;

    public String verifyComputerText(){
        return getTextFromElement(computerText);
    }
    public void clickOnDesktopsLink(){
        clickOnElement(desktopsLink);
        log.info("Click on DeskTops Link" + desktopsLink.toString());
    }
    public void clickOnNoteBooksLink(){
        clickOnElement(noteBooksLink);
        log.info("Click on DeskTops Link" + noteBooksLink.toString());
    }
    public void clickOnSoftwareLink(){
        clickOnElement(softWareLink);
        log.info("Click on DeskTops Link" + softWareLink.toString());
    }


}
