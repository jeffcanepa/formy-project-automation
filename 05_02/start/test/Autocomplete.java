import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Autocomplete {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "/Users/jcanepa/dev/echosign/src/qa/automation/selenium_trunk/TESTNG/echosign/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("955 Skip Away Ct., Morgan Hill, CA");

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);


        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

        driver.quit();
    }
}
