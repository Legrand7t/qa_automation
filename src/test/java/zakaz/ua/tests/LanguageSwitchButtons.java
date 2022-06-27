package zakaz.ua.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import zakaz.ua.pageObjects.ZakazHomePage;

public class LanguageSwitchButtons extends TestInit {

    @Test
    public void doIt() {

        getZakaz();
        implicitlyWait();

        ZakazHomePage homePage = new ZakazHomePage(driver);

        // перевірка відображення всіх кнопок для вибору мови
        Assert.assertTrue(homePage.getLangSwitchButtons().size() == 3);
    }
}
