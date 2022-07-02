package zakaz.ua.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import zakaz.ua.pageObjects.ZakazHomePage;

public class StoreTile extends  TestInit {

    @Test
    public void doIt() {

        getZakaz();
        implicitlyWait();

        ZakazHomePage homePage = new ZakazHomePage(driver);

        // перевіряємо, що в плитці маркетів відображається всі десять магазинів
        Assert.assertTrue(homePage.getStoreTile().size() == 10);
    }
}