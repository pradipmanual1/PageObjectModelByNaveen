package com.caax.utilities;

import com.caax.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class utils extends TestBase {


public void waitForElemtntToBeVisible(WebElement element){

    wait.until(ExpectedConditions.visibilityOf(element));
    if (!element.isDisplayed())
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




}
