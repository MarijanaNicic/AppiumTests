import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;


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
        cap.setCapability("udid","192.168.1.2:5555");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","10");

        cap.setCapability("appPackage","com.sec.android.app.popupcalculator");
        cap.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");

         java.net.URL url = new URL(" http://127.0.0.1:4723/wd/hub");

        driver = new AppiumDriver<MobileElement>(url, cap);

        System.out.println("Application Started...");

        MobileElement one = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01"));
        MobileElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02"));
        MobileElement three = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03"));
        MobileElement four = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_04"));
        MobileElement five = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05"));
        MobileElement six = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_06"));
        MobileElement seven = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07"));
        MobileElement eight = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_08"));
        MobileElement nine = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09"));
        MobileElement zero = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_00"));
        MobileElement clear = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_clear"));
        MobileElement brackets = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_parenthesis"));
        MobileElement percent = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_percentage"));
        MobileElement division = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_div"));
        MobileElement multiplication = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul"));
        MobileElement minus = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_sub"));
        MobileElement plus = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
        MobileElement plusminus = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_plusminus"));
        MobileElement dot = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_dot"));
        MobileElement equal = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
        MobileElement result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));


        five.click();
        seven.click();
        clear.click();
        eight.click();
        plus.click();
        three.click();
        equal.click();


        String res = result.getText();

        System.out.println("Rezultat je "+ res);







    }
}
