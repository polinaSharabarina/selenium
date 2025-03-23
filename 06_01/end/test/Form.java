import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/ese/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Polina");

        driver.findElement(By.id("last-name")).sendKeys("Sharabarina");

        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("03/28/2025");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//         driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

//        driver.quit();
    }
}
