package productsMenu;

import PageFactorySearch.MouseHover;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by JHANGIR on 1/25/2017.
 */
public class MouseHoverMenu extends MouseHover {
    @Test
    public void hoverTest() throws Exception {
        MouseHover hover = PageFactory.initElements(driver,MouseHover.class);
        hover.hoverheadings();
    }
}
