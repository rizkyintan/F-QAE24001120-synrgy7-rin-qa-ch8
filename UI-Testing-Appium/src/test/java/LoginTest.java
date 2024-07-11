import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;


public class LoginTest {

    //Login credentials
    String username = "standard_user";
    String password = "secret_sauce";

    AndroidDriver driver;

    @BeforeTest
    public void setup(){

        //For Android setup capabilities is mandatory
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "13.0");
        capabilities.setCapability("deviceName", "RR8T10BX3HZ");
        capabilities.setCapability("app", "C:/Users/cengceng/Downloads/SampleApp.apk");
        capabilities.setCapability("automationName", "UIAutomator2");
        capabilities.setCapability("appPackage", "com.swaglabsmobileapp");
        capabilities.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");

        driver = new AndroidDriver(capabilities);
    }

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
        loginPage.clickLoginButton();

        //assertion: verify login success
        HomePage homePage = new HomePage(driver);
        homePage.textProductsisDisplayed();
    }

    @AfterTest
    public void closeSession(){
        if (driver != null){
            driver.quit();
        }
    }

}
