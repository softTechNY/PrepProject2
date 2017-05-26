package pageFactorySearch;

import CommonAPI.BaseBlock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JHANGIR on 1/25/2017.
 */
public class DropDownMenu extends BaseBlock {


        public List<String> getMenu() {
            List<String> items = new ArrayList<String>();
            items = getTextFromWebElements("html/body/div[1]/header/div/div[1]/div[4]/div[4]/div[2]/span[*]");
            return  items;
        }
        public void typeOnInputSearch(List<String> data) throws InterruptedException{
            for(int i=0; i<data.size(); i++) {
                typeByXpath("#twotabsearchtextbox",data.get(i));
                input();
                sleepFor(2);
                clearBox();
            }
        }
        public void input() { keysInput(".//*[@id='searchFormInput']");}
        public void clearBox() { clearInput(".//*[@id='searchFormInput']");}

    }


