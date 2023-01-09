package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FileDownlodePage extends BasePageObject{
    private String url = "https://the-internet.herokuapp.com/download";
    private String fileDownloadpaath ="/Users/fatemaakter/Downloads";
    By header =By.xpath("//h3[text()='File Downloader']");
    By testOnePdfFileDownloadElement = By.linkText("test1.pdf");

    public FileDownlodePage(WebDriver driver, Logger log) {
        super(driver, log);
    }
    /**
     * 1. landing on file Downloader page
     * 2. veryfy we are in landing page
     * 3.select the path for the downlod
     * 4..click on test1.pdf file
     * */
    //url for file downlode page
    public void openPage(){
        log.info("Open page : "+ url);
        openUrl(url);
        log.info("Page opened : + u" + url);

        log.info(" verify Driver is in download page: " + header );
       //String expectedText = "File Downloader";
       //String actualText = driver.findElement(header).getText();
       Assert.assertEquals("File Downloader", driver.findElement(header).getText());
       //Assert.assertEquals(expectedText,actualText);
        log.info("Driver is in download page");
    }
    public void testOnePdfFileDownload(){
        log.info("Click on Test1.pdf file: " + testOnePdfFileDownloadElement);
        click(testOnePdfFileDownloadElement);
        log.info("Clicked on the file text1.pdf: " + testOnePdfFileDownloadElement);

        /*File getLatestFile = getLatestFilefromDir(fileDownloadpaath);
        String fileName = getLatestFile.getName();
        Assert.assertTrue(fileName.equals("mailmerge.xls"), "Downloaded file name is not matching with expected file name");*/

    }




}
