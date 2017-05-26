package SearchItems;

import CommonAPI.BaseBlock;
import PageFactorySearch.SearchObjects;

import java.io.IOException;

/**
 * Created by JHANGIR on 1/22/2017.
 */
public class FindProductByObjectdriver extends BaseBlock {

    public void searchItems() throws IOException, InterruptedException{
        SearchObjects findObject = new SearchObjects(driver);

    }
}
