package com.herokuapp.theinternet.filedownlodetests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.FileDownlodePage;
import org.testng.annotations.Test;

public class FileDownlodeTests extends TestUtilities {
    @Test
    public void testFileDownloadPage(){
        FileDownlodePage fileDownlodePage = new FileDownlodePage(driver, log);
        fileDownlodePage.openPage();
    }
    @Test
    public void testDownloadFileTestOnePdf(){
        
    }


}
