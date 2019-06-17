package com.caax.pages;

import com.caax.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WfaBill extends TestBase {

    @FindBy(xpath = "//*[text()='Approve'][1]")
    WebElement approvebtn;

    @FindBy(xpath = "//*[text()='View details']")
    WebElement viewDetails;

    @FindBy(xpath = "//*[@class='statusBlock']/ul/span")
    WebElement status;


    public WfaBill(){
        PageFactory.initElements(driver,this);
    }

    public void approveBill(){

        util.waitForElemtntToBeVisible(approvebtn);
        approvebtn.click();
    }

    public void viewDetails(){

        util.waitForElemtntToBeVisible(viewDetails);
        driver.navigate().to(viewDetails.getAttribute("href"));
    }

    public String billstatus(){

        util.waitForElemtntToBeVisible(status);
        return status.getText();

    }

}
