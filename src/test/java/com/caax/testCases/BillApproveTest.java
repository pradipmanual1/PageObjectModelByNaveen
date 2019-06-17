package com.caax.testCases;

import com.caax.base.TestBase;
import com.caax.pages.DashBoard;
import com.caax.pages.LoginPage;
import com.caax.pages.WfaBill;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BillApproveTest extends TestBase {

    LoginPage login_P;
    DashBoard dash_P;
    WfaBill bill_P;
    public BillApproveTest(){

        super();
    }

    @BeforeClass
    public void setUp(){

        initialization();
        login_P=new LoginPage();
    }

    @Test(priority = 2)
    public void loginTest(){

        dash_P=login_P.login(prop.getProperty("userName"),prop.getProperty("password"));

    }

    @Test(priority = 3)
    public void clickOnBill(){
        dash_P.skipPopUp();
        bill_P=dash_P.clickOnWfaBill();
    }

    @Test(priority = 4)
    public void approveBill(){

       bill_P.approveBill();
       bill_P.viewDetails();
    }

    @Test(priority = 5)
    public void verifyStatus(){

        String billstatus = bill_P.billstatus();
        System.out.println(billstatus);
    }


    @AfterClass
    public void close(){
        driver.close();
    }


}
