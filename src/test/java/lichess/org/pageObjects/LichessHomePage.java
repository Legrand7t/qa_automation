package lichess.org.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LichessHomePage extends BasePage {
    public LichessHomePage(WebDriver driver) {
        super(driver);
    }

    public void getMenuItem1() {
        driver.findElement(By.xpath("//a/span[text()='Игра']")).click();
    }

    public void getMenuItem2() {
        driver.findElement(By.xpath("//section/a[text()='Задачи']")).click();
    }

    public void getMenuItem3() {
        driver.findElement(By.xpath("//section/a[text()='Обучение']")).click();
    }

    public void getMenuItem4() {
        driver.findElement(By.xpath("//section/a[text()='Просмотр']")).click();
    }

    public void getMenuItem5() {
        driver.findElement(By.xpath("//section/a[text()='Сообщество']")).click();
    }

    public void getMenuItem6() {
        driver.findElement(By.xpath("//section/a[text()='Инструменты']")).click();
    }
}
