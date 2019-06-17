package com.caax.utilities;

import com.caax.base.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebEventListener extends TestBase implements WebDriverEventListener {
    /**
     * This action will be performed each time before {@link Alert#accept()}
     *
     * @param driver WebDriver
     */
    public void beforeAlertAccept(WebDriver driver) {

    }

    /**
     * This action will be performed each time after {@link Alert#accept()}
     *
     * @param driver WebDriver
     */
    public void afterAlertAccept(WebDriver driver) {

    }

    /**
     * This action will be performed each time before {@link Alert#dismiss()}
     *
     * @param driver WebDriver
     */
    public void afterAlertDismiss(WebDriver driver) {

    }

    /**
     * This action will be performed each time after {@link Alert#dismiss()}
     *
     * @param driver WebDriver
     */
    public void beforeAlertDismiss(WebDriver driver) {

    }

    /**
     * Called before {@link WebDriver#get get(String url)} respectively
     * {@link WebDriver.Navigation#to navigate().to(String url)}.
     *
     * @param url    URL
     * @param driver WebDriver
     */
    public void beforeNavigateTo(String url, WebDriver driver) {

        System.out.println("Before navigating to: '" + url + "'");

    }

    /**
     * Called after {@link WebDriver#get get(String url)} respectively
     * {@link WebDriver.Navigation#to navigate().to(String url)}. Not called, if an
     * exception is thrown.
     *
     * @param url    URL
     * @param driver WebDriver
     */
    public void afterNavigateTo(String url, WebDriver driver) {

        System.out.println("Navigated to:'" + url + "'");

    }

    /**
     * Called before {@link WebDriver.Navigation#back navigate().back()}.
     *
     * @param driver WebDriver
     */
    public void beforeNavigateBack(WebDriver driver) {

        System.out.println("Navigating back to previous page");

    }

    /**
     * Called after {@link WebDriver.Navigation navigate().back()}. Not called, if an
     * exception is thrown.
     *
     * @param driver WebDriver
     */
    public void afterNavigateBack(WebDriver driver) {

        System.out.println("Navigated back to previous page");

    }

    /**
     * Called before {@link WebDriver.Navigation#forward navigate().forward()}.
     *
     * @param driver WebDriver
     */
    public void beforeNavigateForward(WebDriver driver) {

        System.out.println("Navigating forward to next page");

    }

    /**
     * Called after {@link WebDriver.Navigation#forward navigate().forward()}. Not called,
     * if an exception is thrown.
     *
     * @param driver WebDriver
     */
    public void afterNavigateForward(WebDriver driver) {

        System.out.println("Navigated forward to next page");

    }

    /**
     * Called before {@link WebDriver.Navigation#refresh navigate().refresh()}.
     *
     * @param driver WebDriver
     */
    public void beforeNavigateRefresh(WebDriver driver) {

    }

    /**
     * Called after {@link WebDriver.Navigation#refresh navigate().refresh()}. Not called,
     * if an exception is thrown.
     *
     * @param driver WebDriver
     */
    public void afterNavigateRefresh(WebDriver driver) {

    }

    /**
     * Called before {@link WebDriver#findElement WebDriver.findElement(...)}, or
     * {@link WebDriver#findElements WebDriver.findElements(...)}, or {@link WebElement#findElement
     * WebElement.findElement(...)}, or {@link WebElement#findElement WebElement.findElements(...)}.
     *
     * @param by      locator being used
     * @param element will be <code>null</code>, if a find method of <code>WebDriver</code> is called.
     * @param driver  WebDriver
     */
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {

        System.out.println("Trying to find Element By : " + by.toString());

    }

    /**
     * Called after {@link WebDriver#findElement WebDriver.findElement(...)}, or
     * {@link WebDriver#findElements WebDriver.findElements(...)}, or {@link WebElement#findElement
     * WebElement.findElement(...)}, or {@link WebElement#findElement WebElement.findElements(...)}.
     *
     * @param by      locator being used
     * @param element will be <code>null</code>, if a find method of <code>WebDriver</code> is called.
     * @param driver  WebDriver
     */
    public void afterFindBy(By by, WebElement element, WebDriver driver) {

        System.out.println("Found Element By : " + by.toString());

    }

    /**
     * Called before {@link WebElement#click WebElement.click()}.
     *
     * @param element the WebElement being used for the action
     * @param driver  WebDriver
     */
    public void beforeClickOn(WebElement element, WebDriver driver) {

        System.out.println("Trying to click on: " + element.toString());

    }

    /**
     * Called after {@link WebElement#click WebElement.click()}. Not called, if an exception is
     * thrown.
     *
     * @param element the WebElement being used for the action
     * @param driver  WebDriver
     */
    public void afterClickOn(WebElement element, WebDriver driver) {

        System.out.println("Clicked on: " + element.toString());

    }

    /**
     * Called before {@link WebElement#clear WebElement.clear()}, {@link WebElement#sendKeys
     * WebElement.sendKeys(...)}.
     *
     * @param element    the WebElement being used for the action
     * @param driver     WebDriver
     * @param keysToSend
     */
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

        System.out.println("Value of the:" + element.toString() + " before any changes made");

    }

    /**
     * Called after {@link WebElement#clear WebElement.clear()}, {@link WebElement#sendKeys
     * WebElement.sendKeys(...)}}. Not called, if an exception is thrown.
     *
     * @param element    the WebElement being used for the action
     * @param driver     WebDriver
     * @param keysToSend
     */
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

        System.out.println("Element value changed to: " + element.toString());

    }

    /**
     * Called before {@link RemoteWebDriver#executeScript(String, Object[]) }
     *
     * @param script the script to be executed
     * @param driver WebDriver
     */
    public void beforeScript(String script, WebDriver driver) {

    }

    /**
     * Called after {@link RemoteWebDriver#executeScript(String, Object[]) }.
     * Not called if an exception is thrown
     *
     * @param script the script that was executed
     * @param driver WebDriver
     */
    public void afterScript(String script, WebDriver driver) {

    }

    /**
     * This action will be performed each time before  {@link WebDriver.TargetLocator#window(String)}
     *
     * @param windowName
     * @param driver     WebDriver
     */
    public void beforeSwitchToWindow(String windowName, WebDriver driver) {

    }

    /**
     * This action will be performed each time after  {@link WebDriver.TargetLocator#window(String)}
     *
     * @param windowName
     * @param driver     WebDriver
     */
    public void afterSwitchToWindow(String windowName, WebDriver driver) {

    }

    /**
     * Called whenever an exception would be thrown.
     *
     * @param throwable the exception that will be thrown
     * @param driver    WebDriver
     */
    public void onException(Throwable throwable, WebDriver driver) {

        System.out.println("Exception occured: " + throwable);

    }

    /**
     * Called before {@link TakesScreenshot#getScreenshotAs(OutputType)}
     * allows the implementation to determine which type of output will be generated
     *
     * @param target target type, @see OutputType
     */
    public <X> void beforeGetScreenshotAs(OutputType<X> target) {

    }

    /**
     * Called after {@link TakesScreenshot#getScreenshotAs(OutputType)}
     * allows the implementation to determine which type of output was generated
     * and to access the output itself
     *
     * @param target     target type, @see OutputType
     * @param screenshot screenshot output of the specified type
     */
    public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {

    }

    /**
     * Called before {@link WebElement#getText()} method is being called
     *
     * @param element - {@link WebElement} against which call is being made
     * @param driver  - instance of {@link WebDriver}
     */
    public void beforeGetText(WebElement element, WebDriver driver) {

    }

    /**
     * Called right after {@link WebElement#getText()} method is being called
     *
     * @param element - {@link WebElement} against which call is being made
     * @param driver  - instance of {@link WebDriver}
     * @param text    - {@link String} object extracted from respective {@link WebElement}
     */
    public void afterGetText(WebElement element, WebDriver driver, String text) {

    }
}
