package SearchItems;

import CommonAPI.BaseBlock;
import PageFactorySearch.SearchIteams;
import dataToSearch.ItemsToBeSearched;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by JHANGIR on 1/25/2017.
 */
public class SearchFromXLFile extends BaseBlock {
    @Test
    public void searchUsingExcelFile()throws IOException,InterruptedException{
        //initialize Search page factory
        SearchIteams search = PageFactory.initElements(driver, SearchIteams.class);
        //Read search.data from excel file
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] value = itemsToBeSearched.getData();
        for(String read:value) {
            search.searchFor(read);
            sleepFor(2);
            search.clearSearchInput();
        }
    }
}
