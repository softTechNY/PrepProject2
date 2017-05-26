package SearchItems;

import CommonAPI.BaseBlock;
import PageFactorySearch.SearchIteams;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by JHANGIR on 1/8/2017.
 */
public class SearchFromDataProvider extends BaseBlock {
  //One Data Driven Option to supply search.data from Data Provider
    @DataProvider(name = "items")
    public Object[][] createData(){
        return new Object[][]{
                {"Books"} ,
                {"Baby"} ,
                {"Computer"},
                {"Toys"},
                {"Candies"},
        };
    }
    @Test(dataProvider = "items")
    public void searchUsingDataProvider(String data)throws InterruptedException{
        //initialize Search page factory
        SearchIteams search = PageFactory.initElements(driver, SearchIteams.class);
        search.searchFor(data);
        sleepFor(2);
        search.clearSearchInput();
    }
}


