package com.herokuapp.theinternet.addremovetests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.AddRemovePage;
import org.testng.annotations.Test;

public class AddRemovePageTests extends TestUtilities {
    @Test
    public void testOpenAddRemovePage(){
        AddRemovePage addRemovePage = new AddRemovePage(driver, log);
        addRemovePage.openPage();
        addRemovePage.verifyDriverIsAddRemovePage();

    }
    @Test
    public void veryfyAddElementsButtonWorks(){
        AddRemovePage addRemovePage = new AddRemovePage(driver, log);
        addRemovePage.openPage();
        addRemovePage.clickOnAddElementButton();
        addRemovePage.verifyDeleteButtonIsPresent();
    }
    @Test
    public void veryfyDeleteButtonWorks(){
        AddRemovePage addRemovePage = new AddRemovePage(driver, log);
        addRemovePage.openPage();
        addRemovePage.verifyDriverIsAddRemovePage();
        addRemovePage.clickOnAddElementButton();
        addRemovePage.clickOnDeleteButton();
        addRemovePage.verifyDeleteButtonDeleted();
    }


}
