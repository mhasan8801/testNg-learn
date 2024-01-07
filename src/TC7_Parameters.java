import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC7_Parameters {

    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser, String app){
        if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.get(app);

    }

    @Test(priority = 1)
    void logoTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")));
        Assert.assertTrue(logo.isDisplayed(),"Logo is not displayed on page");
    }

    @Test(priority = 2)
    void titlePage(){
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM",title,"Title is not matched");
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }

}
