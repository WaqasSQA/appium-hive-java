package com.test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;


public class sample {
    AndroidDriver driver;

    @BeforeClass
    public void setupClass() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setDeviceName("Pixel 2");
        options.setApp(System.getProperty("user.dir")+"/Android/Preseus project.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
    }
@Test
    public void launchApp() {

    driver.findElement(By.xpath("//android.widget.Button[@text='Allow']")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@text='Close']")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@text='Login']")).click();
    driver.findElement(By.xpath("//android.widget.EditText[@text='Phone Number']")).sendKeys("3067496061");
    driver.findElement(By.xpath("//android.widget.EditText[@resource-id='text-input-flat']")).sendKeys("Yousma@biomark1");
    driver.findElement(By.xpath("//android.widget.TextView[@text='Login']")).click();





}

}
