package com.caax.testCases;

import com.caax.base.TestBase;
import com.caax.pages.DashBoard;
import com.caax.pages.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class loginPageTest extends TestBase {

    private LoginPage login_P;
    private DashBoard dash_P;

    public loginPageTest(){
        super();
    }

    @BeforeClass
    public void setUp(){

        initialization();
        login_P=new LoginPage();
        log.info("Setup method done");
    }

    @Test(priority = 1)
    public void loginPageTitleTest(){
        String title=login_P.validateLoginPageTitle();
        Assert.assertEquals("Caax | Sign In",title);

    }

    @Test(priority = 2)
    public void loginTest(){

        dash_P=login_P.login(prop.getProperty("userName"),prop.getProperty("password"));

    }

    @AfterClass
    public void close(){
        driver.close();
    }

}
