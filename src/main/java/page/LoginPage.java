package page;


import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BaseTest {




    public LoginPage fillEmail(String text) {
        driver.findElement(By.id("login-email")).sendKeys(text);
        return this;
    }

    public LoginPage fillPassword(String text) {
        driver.findElement(By.id("login-password-input")).sendKeys(text);
        return this;
    }

    public LoginPage clickLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".q-primary.q-fluid.q-button-medium.q-button.submit")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
        return this;
    }

}



