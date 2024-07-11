import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {

    AndroidDriver driver;
    WebDriverWait wait;

    //Constructor
    public HomePage(AndroidDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    //Locator atau element
    By productsText = AppiumBy.xpath("//*[contains(@text, 'PRODUCTS')]");


    //Action method
    public void textProductsisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(productsText)).isDisplayed();
    }

}
