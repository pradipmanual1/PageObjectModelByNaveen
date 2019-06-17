package com.caax.pages;

import com.caax.base.TestBase;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard extends TestBase {

    //utils util;
    //we use static ref. of utils in base class , so we can directly call method if its not static in base class
    //then created object and access method

    @FindBy(xpath="//*[@id='MainContent_colWfaMTank']/p[2]/span")
    WebElement wfaBills;

    @FindBy(id="remove_no")
    WebElement pop_up;



    public DashBoard(){

        PageFactory.initElements(driver,this);
    }

    public WfaBill clickOnWfaBill(){

        util.waitForElemtntToBeVisible(wfaBills);

        if(wfaBills.getAttribute("id").equalsIgnoreCase("MainContent_lblWfA1_0"))
        {
            System.out.println("No bills to approve");
            driver.close();

        }else if (wfaBills.getAttribute("id").equalsIgnoreCase("MainContent_lblWfA1"))
        {
            wfaBills.click();

        }
        return  new WfaBill();
    }


    public void skipPopUp(){

        try {
            if (pop_up.isDisplayed())
                pop_up.click();
        }catch (NoSuchElementException e){

        }

    }



}
