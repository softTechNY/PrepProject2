package SearchItems;

import CommonAPI.BaseBlock;
import PageFactorySearch.SearchIteams;
import Utility.ConnectDB;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JHANGIR on 1/25/2017.
 */
public class SearchInMysql extends BaseBlock {
    @Test
    public void searchUsingDB()throws Exception,InterruptedException{
        //initialize Search page factory
        SearchIteams search = PageFactory.initElements(driver, SearchIteams.class);
        //Read Data From Database
        ConnectDB db = new ConnectDB();
        List<String> st = new ArrayList<String>();
        st = db.readDataBase("Test","items");
        for(String data:st) {
            search.searchFor(data);
            sleepFor(2);
            search.clearSearchInput();
        }
    }
}
