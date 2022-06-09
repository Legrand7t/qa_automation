package zakaz.ua.tests;


import org.testng.annotations.Test;
import zakaz.ua.pageObjects.ZakazHomePage;

public class CheckOrder extends TestInit {

    @Test
    public void doIt() {

        getZakaz();     // переходимо на zakaz.ua
        implicitlyWait();

        ZakazHomePage homePage = new ZakazHomePage(driver);
        homePage.goToMegaMarket();     // переходимо в Мегамаркет
        homePage.getSearchField();     // вводимо у поле пошуку назву товару і тиснемо Enter
        homePage.proofOfAge();         // підтвержуємо, що нам 18+
        homePage.chooseProduct();      // клікаємо по фото-посиланню першого товару
        homePage.addToCart();          // додаємо в корзину
        homePage.chooseNP();           // обираємо доставку Новою Поштою
    }
}
