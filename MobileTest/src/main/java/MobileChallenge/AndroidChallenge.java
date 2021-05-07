package MobileChallenge;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static java.lang.Thread.sleep;

public class AndroidChallenge {

    public static AppiumDriver<MobileElement> driver;
    public static DesiredCapabilities cap;


    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        cap = new DesiredCapabilities();
        cap.setCapability("appPackage", "com.chase.sig.android");
        cap.setCapability("appActivity", ".activity.DeepLinkHandlerActivity");
        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("automationName", "UiAutomator2");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        sleep(30000);

        driver.quit();
    }



}
