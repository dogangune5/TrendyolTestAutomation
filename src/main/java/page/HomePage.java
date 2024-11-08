package page;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage{

    private WebDriver driver;
    private WebDriverWait wait;
    JavascriptExecutor jsExecutor;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.jsExecutor = (JavascriptExecutor) driver;
    }


    private By searchBox = By.cssSelector("input[data-testid='suggestion']");
    private By profileButton = By.cssSelector("i.i-user-orange.hover-icon"); // Profil butonu örneği
    private By logoutButton = By.xpath("//a[contains(text(), 'Çıkış Yap')]");



    public HomePage searchForProduct(String productName) {
        WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox)); // Elementin görünür olmasını bekle
        searchField.sendKeys(productName);
        return this;
    }


    public HomePage clickProfileButton() {
        WebElement profileBtn = wait.until(ExpectedConditions.elementToBeClickable(profileButton)); // Profil butonunun tıklanabilir olmasını bekle
        profileBtn.click();
        return this;
    }

    public void favorilereGit() {
        WebElement favorilerimButton = driver.findElement(By.cssSelector("p.link-text"));
        jsExecutor.executeScript("arguments[0].click();", favorilerimButton);
    }

    public void sepetimeGit() {
        WebElement sepetimButton = driver.findElement((By.cssSelector(".i-bagg-orange.hover-icon")));
        jsExecutor.executeScript("arguments[0].click();" , sepetimButton);
    }


}
