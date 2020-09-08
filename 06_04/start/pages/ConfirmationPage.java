import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by jcanepa on 2020-09-08.
 */


public class ConfirmationPage {

  public static void waitForAlertBanner(WebDriver driver)
  {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
  }

  public static String getAlertBannerText(WebDriver driver)
  {
    return driver.findElement(By.className("alert")).getText();
  }
}
