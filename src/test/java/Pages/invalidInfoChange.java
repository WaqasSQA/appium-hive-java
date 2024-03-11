package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class invalidInfoChange {
    public AndroidDriver thisClassDriver;
    @FindBy(xpath = "//android.widget.Button[@text='Allow']")
    public WebElement allowBtn;
    @FindBy(xpath = "//android.widget.TextView[@text='Close']")
    public WebElement closeBtn;
    @FindBy(xpath = "//android.widget.TextView[@text='Login']")
    public WebElement firstLoginBtn;
    @FindBy(xpath = "//android.widget.EditText[@text='Phone Number']")
    public WebElement phoneNumField;
    @FindBy(xpath = "//android.widget.EditText[@resource-id='text-input-flat']")
    public WebElement passwordField;
    @FindBy(xpath = "//android.widget.TextView[@text='Login']")
    public WebElement finalFinalBtn;
    @FindBy(xpath = "//android.widget.TextView[@text='Account']")
    public WebElement accountBtn;
    @FindBy(xpath = "//android.widget.TextView[@text='Personal Information']")
    public WebElement personalInfoBtn;
    @FindBy(xpath = "//android.widget.EditText[@hint='Enter first name. e-g John']")
    public WebElement firstNameField;
    @FindBy(xpath = "//android.widget.EditText[@hint='Enter last name. e-g Doe']")
    public WebElement lastNameField;

    @FindBy(xpath = "//android.widget.EditText[@hint='E.g. 950310111111']")
    public WebElement icNumberField;

    @FindBy(xpath = "//android.widget.TextView[@text='Save & Continue']")
    public WebElement saveBtn;

    public void invalidInfoChange (AndroidDriver tempDriver){

        thisClassDriver=tempDriver;
    }
    public void changeInvalidInfo(String number, String password) throws IOException {

        allowBtn.click();
        closeBtn.click();
        firstLoginBtn.click();
        phoneNumField.sendKeys(number);
        passwordField.sendKeys(password);
        finalFinalBtn.click();
        accountBtn.click();
        personalInfoBtn.click();
        firstNameField.sendKeys("Yousma 1");
        lastNameField.sendKeys("Dev Test 2");
        icNumberField.sendKeys("   ");
        firstNameField.click();
        saveBtn.click();
    }
}
