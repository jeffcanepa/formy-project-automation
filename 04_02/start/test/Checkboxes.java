import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/jcanepa/dev/echosign/src/qa/automation/selenium_trunk/TESTNG/echosign/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
        checkBox1.click();
        Thread.sleep(2000);

        WebElement checkBox2 = ((ChromeDriver) driver).findElementByCssSelector("input[value='checkbox-2']");
        checkBox2.click();
        Thread.sleep(2000);

        WebElement checkBox3 = ((ChromeDriver) driver).findElementByCssSelector("input[value='checkbox-3']");
        checkBox3.click();
        Thread.sleep(2000);

        checkBox1.click();
        Thread.sleep(2000);

        checkBox2.click();
        Thread.sleep(2000);

        driver.quit();
    }
}