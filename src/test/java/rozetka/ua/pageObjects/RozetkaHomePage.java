package rozetka.ua.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RozetkaHomePage extends BasePage {
    public RozetkaHomePage(WebDriver driver) {
        super(driver);
    }

    public void getCatalog() {
        // Перехід на сторінку "Компьютеры и ноутбуки"
        driver.findElement(By.xpath("//div[@class='fat-wrap']//a[text()='Ноутбуки и компьютеры']")).click();
    }

    public void getItem() {
        // клік по фото-посиланню "Графические планшеты"
        driver.findElement(By.xpath("//a[@title='Графические планшеты']")).click();
    }

    public void addToCart() {
        // Додаємо у кошик
        driver.findElement(By.xpath("//button[@aria-label = 'Купить' and contains(@class, 'green')]")).click();
    }

    public void addNumberProducts() {
        // Клікаємо на "+" чотири рази, щоб додати 5 штук у кошик
        for (int i = 0; i < 4; i++) {
            driver.findElement(By.xpath("//rz-cart-counter/div/button[2]")).click();
        }
    }
}
