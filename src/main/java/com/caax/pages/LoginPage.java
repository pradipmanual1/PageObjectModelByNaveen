package com.caax.pages;

import com.caax.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(id="UserName")
    WebElement username;

    @FindBy(id="Password")
    WebElement password;

    @FindBy(id="LoginButton")
    WebElement loginBtn;


    public LoginPage(){

        PageFactory.initElements(driver,this);

    }

    public String validateLoginPageTitle(){

        return driver.getTitle();
    }

    public DashBoard login(String un,String pw){

        username.sendKeys(un);
        password.sendKeys(pw);
        loginBtn.click();

        return new DashBoard();
    }

}
