package rozetka.ua.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestInit {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void closeWindow() {
        driver.quit();
    }

    public void getRozetka() {
        driver.get("https://rozetka.com.ua");
        driver.manage().window().maximize();
    }

    public void getPage() {
        // Переходимо на сторінку товару
        driver.get("https://rozetka.com.ua/wacom_intuos_s_ctl_4100wle_n/p46761072/");
        driver.manage().window().maximize();
    }
    public void implicitlyWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

}

