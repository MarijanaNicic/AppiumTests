import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileElement;
import org.apache.http.io.SessionOutputBuffer;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import static io.appium.java_client.clipboard.ClipboardContentType.URL;

public class CalculatorTest {

    static AppiumDriver<MobileElement> driver;


    public static void main (String[] args){
        try {
            OpenCalculator();
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void OpenCalculator()throws Exception{

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviseName","SM-A202F/DS");
        cap.setCapability("udid","R58N50J3C9N");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","10");

        cap.setCapability("appPackage","com.sec.android.app.popupcalculator");
        cap.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");

         java.net.URL url = new URL(" http://127.0.0.1:4723/wd/hub");

        driver = new AppiumDriver<MobileElement>(url, cap);

        System.out.println("Application Started...");


    }
}
