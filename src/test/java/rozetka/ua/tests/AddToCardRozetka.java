package rozetka.ua.tests;

import org.testng.annotations.Test;
import rozetka.ua.pageObjects.RozetkaHomePage;


public class AddToCardRozetka extends TestInit {
    @Test
    public void doIt() throws InterruptedException {

        getPage();
        implicitlyWait();

        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
        rozetkaHomePage.addToCart();
        Thread.sleep(5000);
        rozetkaHomePage.addNumberProducts();
    }
}
