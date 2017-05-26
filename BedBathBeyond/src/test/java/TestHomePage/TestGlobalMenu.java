package TestHomePage;

import CommonAPI.BaseBlock;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.Homepage.UiHomepage;

/**
 * Created by JHANGIR on 1/21/2017.
 */
public class TestGlobalMenu extends BaseBlock{
    @Test
    public void testProductsMenu() throws InterruptedException {
        UiHomepage uiHomepage = PageFactory.initElements(driver, UiHomepage.class);
        uiHomepage.productsMenu();
        sleepFor(2);
        uiHomepage.trendsandIdeas();
        sleepFor(2);
        uiHomepage.college();
        sleepFor(2);
        uiHomepage.weddingandGiftReg();
        sleepFor(2);
    }
}
