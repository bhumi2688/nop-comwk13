package com.nopcommercewk13.pages;

import com.nopcommercewk13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li")
    List<WebElement> sevenTab;
    @FindBy(xpath = "//div[@class='listbox']/ul[1]/li[1]/a")
    List<WebElement> noteBooksSubTab;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]")
    WebElement computersTab;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]")
    WebElement electronicsTab;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]")
    WebElement apparelTab;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[4]")
    WebElement digitalDownloadsTab;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]")
    WebElement booksTab;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[6]")
    WebElement jewelryTab;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[7]")
    WebElement giftCardsTab;
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;
    @FindBy(xpath = "//div[@class='header-logo']")
    WebElement nopCommerceLogo;
    @FindBy(xpath = "//div[@class='footer-upper']/div[3]/ul/li[1]")
    WebElement myAccountLink;
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;

    public void clickOnTab(String menu) {
        for(WebElement a:sevenTab){
            if(a.getText().equalsIgnoreCase(menu)){
                a.click();
                break;
            }
        }
    }
    public void clickOnSubTab(String subMenu){
        for(WebElement b:noteBooksSubTab){
            if(b.getText().equalsIgnoreCase(subMenu)){
                b.click();
                break;
            }

        }
    }


    public void clickOnComputerTab(){
        clickOnElement(computersTab);
        log.info("Click on Computerstab" + computersTab.toString());
    }
    public void clickOnElectronicsTab(){
        clickOnElement(electronicsTab);
        log.info("Click on ElectronicsTab" + electronicsTab.toString());
    }
    public void clickOnApparelTab(){
        clickOnElement(apparelTab);
        log.info("Click on ApparelTab" + apparelTab.toString());
    }
    public void clickOnDigitalDownloads(){
        clickOnElement(digitalDownloadsTab);
        log.info("Click on DigitalDownloadsTab" + digitalDownloadsTab.toString());
    }
    public void clickOnBooksTab(){
        clickOnElement(booksTab);
        log.info("Click on BooksTab" + booksTab.toString());

    }
    public void clickOnJewelry(){
        clickOnElement(jewelryTab);
        log.info("Click on JewelryTab" + jewelryTab.toString());
    }
    public void clickOnGiftCardsTab(){
        clickOnElement(giftCardsTab);
        log.info("Click on GiftCardsTab" + giftCardsTab.toString());
    }
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
        log.info("Click on LoginLink" + loginLink.toString());
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
        log.info("Click on Register Link" + registerLink.toString());
    }
    public void clickOnNopCommerceLogo(){
        clickOnElement(nopCommerceLogo);
        log.info("Click on NopCommerceLogo Link" + nopCommerceLogo.toString());
    }
    public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink);
        log.info("Click on MyAccount Link" + myAccountLink.toString());
    }
    public void clickOnLogOutLink(){
        log.info("Click on Logout Link" + logoutLink.toString());
        clickOnElement(logoutLink);
    }
    public String verifyLogInLink(){
        log.info("Verify LogIn Link" + loginLink.toString());
        return getTextFromElement(loginLink);
    }
    public String verifyLogOutLink(){
        log.info("Verify LogOut Link" + logoutLink.toString());
        return getTextFromElement(logoutLink);
    }


}
