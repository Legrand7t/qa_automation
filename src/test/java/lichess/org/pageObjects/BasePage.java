package lichess.org.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Explicit waits

    public WebElement getElementWait(String path) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
        return driver.findElement(By.xpath(path));
    }

    public List<WebElement> getElementsWait(String path) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
        return driver.findElements(By.xpath(path));
    }
}
