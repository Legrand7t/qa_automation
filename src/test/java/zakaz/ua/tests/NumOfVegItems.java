package zakaz.ua.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import zakaz.ua.pageObjects.ZakazHomePage;

public class NumOfVegItems extends  TestInit {

    @Test
    public void doIt() throws InterruptedException {

        getZakaz();
        implicitlyWait();

        ZakazHomePage homePage = new ZakazHomePage(driver);
        homePage.goToMegaMarket();
        homePage.getSearchField("овочі");
        Thread.sleep(3000);


        // перевірка відображення товарів після прямого пошуку
        Assert.assertTrue(homePage.getVegItems().size() > 5);
    }
}
