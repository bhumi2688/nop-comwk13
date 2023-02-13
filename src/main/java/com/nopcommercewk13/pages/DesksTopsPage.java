package com.nopcommercewk13.pages;

import com.nopcommercewk13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesksTopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesksTopsPage.class.getName());


    public DesksTopsPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='page category-page']/div/h1")
    WebElement desksTopsText;
    @FindBy(xpath = "//div[@class='product-selectors']/div[2]/span")
    WebElement sortBy;
    @FindBy(xpath = "//div[@class='product-selectors']/div[3]")
    WebElement displayBy;
    @FindBy(xpath = "//div[@class='product-selectors']/div[1]/a[2]")
    WebElement selectProductList;
    public String verifyDesktopsText(){
        return getTextFromElement(desksTopsText);
    }
    public void getSortByText() {
        log.info("Getting text From" + sortBy.toString());

    }
    public String getDisplayText(){
        log.info("Getting Display By" + displayBy.toString());
        return getTextFromElement(displayBy);
    }
    public String getSelectProductList(){
        log.info("Select Product List" + selectProductList.toString());
        return getTextFromElement(selectProductList);

    }

}
