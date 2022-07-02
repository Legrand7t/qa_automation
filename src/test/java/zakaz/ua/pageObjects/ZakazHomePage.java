package zakaz.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ZakazHomePage extends BasePage {


    public ZakazHomePage(WebDriver driver) {
        super(driver);
    }

    public void goToMegaMarket() {
        driver.findElement(By.xpath("//img[@alt='MegaMarket']")).click();
    }

    public void getSearchField() {
        driver.findElement(By.xpath("//input[@placeholder='Пошук у МегаМаркеті']")).sendKeys("finlandia\n");
    }

    public void getSearchField(String str) {
        driver.findElement(By.xpath("//input[@placeholder='Пошук у МегаМаркеті']")).sendKeys(str + "\n");
    }


    public void proofOfAge() {
        driver.findElement(By.xpath("//button[text()='Так, мені 18+']")).click();
    }

    public void chooseProduct() {
        //  xpath фізичного розташування першого товару в DOM
        driver.findElement(By.xpath("//*[@id='PageWrapBody_desktopMode']/div[3]/div[3]/div/div[1]/a/div[1]")).click();
    }

    public void addToCart() {
        driver.findElement(By.xpath("//div[@id='BigProductCardTopInfo__addButtons']//span[text()='Додати до кошика']")).click();
    }

    public void chooseNP() {
        driver.findElement(By.xpath("//*[@id='react-tabs-4']")).click();
    }

    public void scrollToElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//a[text() = 'Контакти']"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }
    public void getCity() {
        // обираємо Самовивіз і місто Київ з випадаючого списку через Debugger
        driver.findElement(By.xpath("//*[@id='react-tabs-2']")).click();
        driver.findElement(By.xpath("//*[@id='react-tabs-3']/div[1]/div/div[2]/div")).click();
        driver.findElement(By.xpath("//*[@id='react-select-4-option-0']")).click();
    }

    public List<WebElement> getLangSwitchButtons () {
        return driver.findElements(By.xpath("//span[contains(@class, 'jsx-2339030531 switch-locale__link')]"));
    }

    public List<WebElement> getStoreTile () {
        return driver.findElements(By.xpath("//li[contains(@data-testid, 'storeTile')]"));
    }

    public List<WebElement> getVegItems () {
        return driver.findElements(By.xpath("//div/span[contains(text(), 'овочі')]"));
    }
}
