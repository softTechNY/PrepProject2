package SearchItems;

import CommonAPI.BaseBlock;
import PageFactorySearch.FindStoreMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by JHANGIR on 1/21/2017.
 */
public class FindStore extends BaseBlock {
    @Test
    public void findStore() throws InterruptedException {
        FindStoreMethods find = PageFactory.initElements(driver, FindStoreMethods.class);
       find.clickFindStore();
       find.clickFindStoreNEnter("10001");
       find.clickSearchWithinButton("30");
       find.clickSubmitButton();
    }
}
