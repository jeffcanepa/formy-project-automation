import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/jcanepa/dev/echosign/src/qa/automation/selenium_trunk/TESTNG/echosign/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        // Fill in the fields
        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Doe");
        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        //Select the correct radio button/checkbox
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-1")).click();

        //Select years of experience
        driver.findElement(By.cssSelector("option[value='4']")).click();

        //Enter date into date picker
        driver.findElement(By.id("datepicker")).sendKeys("10/10/2020");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        //Submit all this crap
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        driver.quit();
    }
}
