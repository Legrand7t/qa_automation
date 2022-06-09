package zakaz.ua.tests;

import org.testng.annotations.Test;
import zakaz.ua.pageObjects.ZakazHomePage;


public class ScrollZakaz extends TestInit{

    @Test
    public void doIt(){
        getZakaz();                         // переходимо на zakaz.ua
        implicitlyWait();

        ZakazHomePage zakazHomePage = new ZakazHomePage(driver);
        zakazHomePage.goToMegaMarket();     // переходимо в Мегамаркет
        zakazHomePage.scrollToElement();    // скролимо до футеру та клікаємо по посиланню "Контакти"
    }
}
