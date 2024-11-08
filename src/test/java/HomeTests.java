import base.BaseTest;
import base.Veriler;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import page.HomePage;
import page.LoginPage;

public class HomeTests extends Veriler {

    private WebDriver driver;
    private HomePage homePage;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get("https://www.trendyol.com"); // Test edilecek siteyi aç
    }

    @Test
    @Description("Sitenin açılıp açılmadığını kontrol etme")
    @Severity(SeverityLevel.NORMAL)
    public void openWebSite() {

        HomePage homePage = new HomePage(driver);

    }

    @Test
    @Description("Arama çubuğuna yazı yazılıyor mu kontrol etme")
    @Severity(SeverityLevel.MINOR)
    public void testSearchProduct() {
        HomePage homePage = new HomePage(driver);
        homePage.searchForProduct("Laptop");
        Allure.step("Deneme");
    }


    @Test
    @Description("Profil butonuna tıklanıyor mu kontrol etme")
    @Severity(SeverityLevel.MINOR)
    public void testClickProfileButton() {
        // Profil butonuna tıklıyoruz
        homePage.clickProfileButton();
        // Profil sayfasına yönlendirildik mi diye kontrol edebiliriz
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
    }


    @Test
    @Description("Favorilere git butonuna tıklanıyor mu kontrol etme")
    @Severity(SeverityLevel.MINOR)
    public void testFavorilereGit() {
        homePage.favorilereGit();
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
    }

    @Test
    @Description("Sepete git butonuna tıklanıyor mu kontrol etme")
    @Severity(SeverityLevel.MINOR)
    public void testSepetimeGit() {
        homePage.sepetimeGit();
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
    }


}
