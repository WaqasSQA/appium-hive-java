package com.test;

import Pages.changePersonalInfo;
import Pages.invalidInfoChange;
import Pages.loginRepo;
import Pages.personalInfromationRepo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static util.configReader.getNumber;
import static util.configReader.getPassword;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class testcase {

    public AndroidDriver driver;
    public loginRepo loginDtls;
    public changePersonalInfo changeInfo_actions;
    public personalInfromationRepo personalInfo_Actions;
    public invalidInfoChange invalidInfo_Actions;

    @BeforeMethod
    public void setupClass() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setDeviceName("Pixel 2");
        options.setApp(System.getProperty("user.dir") + "/Android/Preseus project.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    }
    @Test
    public void loginApp() throws IOException {
        loginDtls = PageFactory.initElements(driver, loginRepo.class);
        loginDtls.loginActions(getNumber(), getPassword());
    }
    @Test
    public void personalInformationActions() throws IOException {
        personalInfo_Actions = PageFactory.initElements(driver, personalInfromationRepo.class);
        personalInfo_Actions.PersonalInfoActions(getNumber(), getPassword());
    }

    @Test
    public void changeInfo() throws IOException {
        changeInfo_actions = PageFactory.initElements(driver, changePersonalInfo.class);
        changeInfo_actions.changeInfoActions(getNumber(), getPassword());
    }
    @Test
    public void setInvalidInfo_Actions() throws IOException {
        invalidInfo_Actions = PageFactory.initElements(driver, invalidInfoChange.class);
        invalidInfo_Actions.changeInvalidInfo(getNumber(), getPassword());
        String actualText = driver.findElement(By.xpath("//android.widget.TextView[@text='Name should only contain characters']")).getText();
        String expectedText = "Name should only contain characters";
        Assert.assertEquals(expectedText, actualText, "Text is verified");

    }
    @AfterMethod
    public void destroy(){
        driver.quit();
    }
}