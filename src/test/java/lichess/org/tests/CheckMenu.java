package lichess.org.tests;

import lichess.org.pageObjects.LichessHomePage;
import org.testng.annotations.Test;

public class CheckMenu extends TestInit{

    @Test
    public void doIt() {

       getLichess();
       implicitlyWait();

       LichessHomePage lichessHomePage = new LichessHomePage(driver);
       lichessHomePage.getMenuItem1();
       lichessHomePage.getMenuItem2();
       lichessHomePage.getMenuItem3();
       lichessHomePage.getMenuItem4();
       lichessHomePage.getMenuItem5();
       lichessHomePage.getMenuItem6();
    }
}
