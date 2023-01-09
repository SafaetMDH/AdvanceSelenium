package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddRemovePage extends BasePageObject {
   private String url = "https://the-internet.herokuapp.com/add_remove_elements/";
   private By addElementButton = By.xpath("//button[text()='Add Element']");
   private  By pageHeader = By.xpath("//h3[text() ='Add/Remove Elements']");
   private By deleteButton =By.xpath("//button[text()='Delete']");

   public AddRemovePage(WebDriver driver, Logger log) {
      super(driver, log);
   }
   /** Open AddRemovePage with it's url */
   public void openPage() {
      log.info("Opening page: " + url);
      openUrl(url);
      log.info("Page opened!");
   }

   public void verifyDriverIsAddRemovePage(){
      log.info("veryfying if the driver is in add remove page");
      String expectedText = "Add/Remove Elements";
      //String actualResult = driver.findElement(pageHeader).getText();
      String actualResult = getText(pageHeader);
      Assert.assertEquals(expectedText,actualResult);
      log.info("Driver is in add remove page");
   }
   public void clickOnAddElementButton(){
      log.info("click button: " + addElementButton);
      click(addElementButton);
      log.info("clicked on button: " + addElementButton);

   }

   public void verifyDeleteButtonIsPresent() {
      log.info("Check if the Delete button is present");

      WebDriverWait wait = new WebDriverWait(driver, 10);
      //wait.until(ExpectedConditions.visibilityOfElementLocated(deleteButton));
      //WebElement webElement = driver.findElement(deleteButton);
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(deleteButton)));
      String deleteButtonText = getText(deleteButton);
      Assert.assertTrue(deleteButtonText.contains("Delete"));
      //Assert.assertTrue(getText(deleteButton).contains("Delete"));
      log.info("Delete button is present ");
   }
   public void clickOnDeleteButton(){
     log.info("click button: " + deleteButton);
     click(deleteButton);
     log.info(("clicked on button: ") + deleteButton );
   }
   public void verifyDeleteButtonDeleted(){
      log.info("Check if the Delete button deleted succesfully");
      Assert.assertTrue(getCurrentPageSource().contains("Delete"));
      log.info("No Delete button exist");
   }
}
