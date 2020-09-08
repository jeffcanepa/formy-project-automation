import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/jcanepa/dev/echosign/src/qa/automation/selenium_trunk/TESTNG/echosign/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        Thread.sleep(2000);

        WebElement radioButton2 = ((ChromeDriver) driver).findElementByCssSelector("input[value='option2']");
        radioButton2.click();
        Thread.sleep(2000);

        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();
        Thread.sleep(2000);

        radioButton1.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
