package ui.Homepage;

import CommonAPI.BaseBlock;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import ui.MenuBar.College;
import ui.MenuBar.TrendsandIdeas;
import ui.MenuBar.WeddingandGiftReg;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JHANGIR on 1/21/2017.
 */
public class UiHomepage extends BaseBlock{
    @FindBy(how = How.XPATH,using = "html/body/div[2]/div[1]/div[3]/div[2]/div[1]/div[3]/*/a")
    List<WebElement> elements = new ArrayList<WebElement>();

    public void productsMenu(){
        elements.get(0).click();
        //return new ProductsMenu();
    }
    public TrendsandIdeas trendsandIdeas() {
        elements.get(1).click();
        return new TrendsandIdeas();
    }
    public College college() {
        elements.get(2).click();
        return  new College();
    }
    public WeddingandGiftReg weddingandGiftReg() {
        elements.get(3).clear();
        return new WeddingandGiftReg();
    }


}
// for(int i=0; i<elements.size(); i++)