package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class bodyMeasurementHP {
public AndroidDriver thisClassDriver;

@FindBy(xpath = "//android.widget.TextView[@text='Account']")
    public WebElement accountBtn;
@FindBy(xpath = "android.view.ViewGroup")
    public WebElement healthProfile;
@FindBy(xpath = "//android.widget.TextView[@text='Body Measurement']")
    public WebElement bdyMeasuremenet;
@FindBy(xpath = "//android.widget.EditText[@bounds='[58,748][1044,964]']")
    public WebElement heightField;
@FindBy(xpath = "//android.widget.TextView[@bounds='[1221,811][1310,902]']")
    public WebElement heightUnits;
@FindBy(xpath = "//android.widget.EditText[@bounds='[58,1403][1066,1619]']")
    public WebElement weightField;
@FindBy(xpath = "//android.widget.TextView[@bounds='[1221,1466][1310,1557]']")
    public WebElement weightUnits;

}
