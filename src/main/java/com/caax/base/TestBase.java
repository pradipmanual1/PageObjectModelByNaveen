package com.caax.base;

import com.caax.Helper.Resource.ResourceHelper;
import com.caax.utilities.ExcelReader;
import com.caax.utilities.WebEventListener;
import com.caax.utilities.utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;
    public static EventFiringWebDriver e_driver;
    public static WebDriverWait wait;
    public static WebEventListener eventListener;
    public static utils util;
    public ExcelReader reader;
    String excel_path= ResourceHelper.getResourcePath("//src//main//java//com//caax//testData//data.xlsx");

    public static Logger log= LogManager.getLogger(TestBase.class);


    public TestBase()
    {
        prop=new Properties();
        FileInputStream fis= null;
        try {
            fis =new FileInputStream(ResourceHelper.getResourcePath("//src//main//resources//config.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            prop.load(fis);
            log.info("Config file loaded");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void initialization(){

        String browserName=prop.getProperty("browser_name");

        if (browserName.equalsIgnoreCase("ff"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();

        }else if (browserName.equalsIgnoreCase("chroma"))
        {

            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }

        e_driver=new EventFiringWebDriver(driver);

        //Now create object of EventListerHandler to register it with EventFiringWebDriver
        /*
            WebDrier Event Listener is to listen the events triggered by webdriver like beforeClickOn, afterClickOn, beforeFindBy, afterFindBy, etc and take actions.
            It is mainly used to write log file for selenium test execution.
            TestNG listener mainly used to generate the report for the test. Also, you can capture screenshot when there is test failure.
            TestNG events are like onTestFailure, onTestSkipped, onTestSuccess, etc.
        * */
        eventListener = new WebEventListener();
        e_driver.register(eventListener);
        driver = e_driver;

        util=new utils();
        reader=new ExcelReader(excel_path);

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(prop.getProperty("pageLoad")), TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicit")), TimeUnit.SECONDS);
        wait=new WebDriverWait(driver,Integer.parseInt(prop.getProperty("explicit_wait")));
        driver.get(prop.getProperty("testURL"));

    }





}
