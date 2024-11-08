import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    @Description("Başarılı giriş yapılıyor mu kontrol etme")
    @Severity(SeverityLevel.CRITICAL)
    public void testSuccesfullLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.fillEmail(email);
        loginPage.fillPassword(password);
        loginPage.clickLogin();

    }

    @Test
    @Description("geçersiz email ile giriş yapılıyor mu kontrol etme")
    @Severity(SeverityLevel.MINOR)
    public void testInvalidEmailLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.fillEmail("invalidemail@example.com"); // Geçersiz bir email
        loginPage.fillPassword(password);
        loginPage.clickLogin();

    }

    @Test
    @Description("Boş şifre alanı ile giriş yapılıyor mu kontrol etme")
    @Severity(SeverityLevel.MINOR)
    public void testEmptyPasswordLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.fillEmail(email);
        loginPage.fillPassword(""); // Şifre alanı boş bırakıldı
        loginPage.clickLogin();

    }

    @Test
    @Description("boş email alanı ile giriş yapılıyor  mu kontrol etme")
    @Severity(SeverityLevel.MINOR)
    public void testEmptyEmailLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.fillEmail(""); // Email alanı boş bırakıldı
        loginPage.fillPassword(password);
        loginPage.clickLogin();
        // Hata mesajını doğrulayın
    }

    @Test
    @Description("geçersiz şifre ile giriş yapılıyor mu kontrol etme")
    @Severity(SeverityLevel.MINOR)
    public void testInvalidPasswordLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.fillEmail(email);
        loginPage.fillPassword("wrongpassword"); // Yanlış bir şifre
        loginPage.clickLogin();

    }


}
