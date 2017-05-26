package SearchItems;

import pageFactorySearch.DropDownMenu;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by JHANGIR on 1/25/2017.
 */
public class DropDownMenuSearch extends DropDownMenu {
    @Test
    public void dropDownMenu() throws InterruptedException{
        List<String> text = getMenu();
        typeOnInputSearch(text);
    }
}
