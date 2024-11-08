package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BaseLibrary{
    public static WebDriver driver;
    @BeforeMethod
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.get("https://www.trendyol.com/giris?cb=/");
    }

//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
