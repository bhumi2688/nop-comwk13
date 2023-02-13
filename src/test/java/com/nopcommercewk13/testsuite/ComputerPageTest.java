package com.nopcommercewk13.testsuite;

import com.nopcommercewk13.pages.*;
import com.nopcommercewk13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {
    HomePage homePage;
    ComputerPage computerPage;
    DesksTopsPage desksTopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desksTopsPage = new DesksTopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test
    public void verifyUserShouldNavigatetoComputerPageSuccessfully() {
        homePage.clickOnComputerTab();
        String actualMsg = computerPage.verifyComputerText();
        String expectedMsg = "Computers";
        Assert.assertEquals(actualMsg, expectedMsg, "Computer text is verified");

    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.clickOnComputerTab();
        computerPage.clickOnDesktopsLink();
        String actualMsg = desksTopsPage.verifyDesktopsText();
        String expectedMsg = "Desktops";
        Assert.assertEquals(actualMsg, expectedMsg, "Desktops text is verified");
    }

    //    @Test
    @Test
    public void verifyThatUserShouldBuildYourOwnComputerAndAddThemToCartSuccessfully() {
        homePage.clickOnTab("computers");
        homePage.clickOnSubTab("NoteBooks");
        // computerPage.clickOnDesktopsLink();
//        buildYourOwnComputerPage.clickOnBuildYourOwnComputerLink();
//        buildYourOwnComputerPage.selectByProcessorDropDown(Processor);
//        buildYourOwnComputerPage.selectByRamDropDown(Ram);
//        buildYourOwnComputerPage.clickOnRadioButtonHDD(hdd);
//        buildYourOwnComputerPage.clickOnRadioButtonOS(os);
//        buildYourOwnComputerPage.clickOnSoftwareCheckBox(software);
//        buildYourOwnComputerPage.clickonAddtoCartButton();
//        String actualMsg1 = buildYourOwnComputerPage.verifyProductAddedMessage();
//        String expectedMsg1 = "The product has been added to your shopping cart";
//        Assert.assertEquals(actualMsg1, expectedMsg1, "Product added message is verified");

    }
}