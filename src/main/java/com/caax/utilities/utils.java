package com.caax.utilities;

import com.caax.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;


public class utils extends TestBase {


    public void waitForElemtntToBeVisible(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));
        if (!element.isDisplayed()) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @DataProvider(name = "dp")
    public Object[][] getData(Method m) {

        String sheetName =m.getName();

        int totalRow = reader.getRowCount(sheetName);
        int totalCol = reader.getRowCount(sheetName);

        Object[][] data = new Object[totalRow - 1][totalCol];
        //totalRow-1 because 1st row is null null null store : row start from 0

        for (int i = 2; i <= totalRow; i++) {
            for (int j = 0; j < totalCol; j++) {
                data[i - 2][j] = reader.getCellData(sheetName, j, i);
            }
        }
        return data;

    }

    @Test
    public  void m(){

        String testName="pradip";
        String sheetName ="contacts";

        int totalRow = reader.getRowCount(sheetName);
        int totalCol = reader.getRowCount(sheetName);

        for(int i=2;i<=totalRow;i++){


                String testCaseName=reader.getCellData(sheetName,0,i);
            System.out.println(testCaseName);

        }

    }


}
