package rozetka.ua.tests;

import org.testng.annotations.Test;
import rozetka.ua.pageObjects.RozetkaHomePage;


public class TestClickRozetka extends TestInit {

    @Test
    public void doIt() {

        getRozetka();
        implicitlyWait();

        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
        rozetkaHomePage.getCatalog();
        rozetkaHomePage.getItem();
    }
}
