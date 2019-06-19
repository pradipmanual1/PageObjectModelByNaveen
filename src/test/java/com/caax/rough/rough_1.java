package com.caax.rough;

import com.caax.Helper.Resource.ResourceHelper;
import com.caax.utilities.ExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class rough_1 {

    String path= ResourceHelper.getResourcePath("//src//main//java//com//caax//testData//data.xlsx");
    ExcelReader r=new ExcelReader(path);


    @Test(dataProvider="getData")
    public void path(String a,String b,String c){

        System.out.println("name is "+a);
        System.out.println("lname is "+b);
        System.out.println("role is"+c);




    }

   @DataProvider
    public Object[][] getData(){

       String sheetName="contacts";

       int totalRow=r.getRowCount(sheetName);
       int totalCol=r.getRowCount(sheetName);

       Object[][] data=new Object[totalRow-1][totalCol];
       //totalRow-1 because 1st row is null null null store : row start from 0

       for (int i=2;i<=totalRow;i++)
       {
           for (int j=0;j<totalCol;j++)
           {
               data[i-2][j]=r.getCellData(sheetName,j,i);
           }
       }
       return data;

    }

    @Test
    public  void m(){

        String testName="bayside";
        String sheetName ="contacts";

        int totalRow = r.getRowCount(sheetName);
        int totalCol = r.getRowCount(sheetName);

        for(int i=2;i<=totalRow;i++){


            String testCaseName=r.getCellData(sheetName,0,i);
            System.out.println(testCaseName);
            if(testCaseName.equalsIgnoreCase("testName"))
            {

                String runMode=r.getCellData(sheetName,1,i);
                {
                    System.out.println(runMode);
                }
            }

        }

    }
}
