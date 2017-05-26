package pageFactorySearch;

import CommonAPI.BaseBlock;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JHANGIR on 1/28/2017.
 */
public class AddInCart extends BaseBlock {
    @FindBy(how= How.XPATH, using="")
    public static WebElement searchField;
    @FindBy(how=How.XPATH, using="")
    public static WebElement searchButton;
    @FindBy(how=How.LINK_TEXT,using="Bjarne Stroustrup")
    public static WebElement writerName;
   // public void findByWRName(){getTextByName()}
    @FindBy(how=How.XPATH, using="")
    public static WebElement addButton;
    @FindBy(how=How.XPATH, using="")
    public static WebElement productsIncart;
    //add assertfunction
//    @FindBy(how = How.XPATH,using = "html/body/div[2]/div[1]/div[3]/div[2]/div[1]/div[3]/*/a")
//    List<WebElement> elements = new ArrayList<WebElement>();
//
//    public ProductsMenu productsMenu(){
//        elements.get(0).click();
//        return new ProductsMenu();
//    }
    @FindBy(how=How.CSS, using="#searchDropdownBox option")
    List<WebElement> elements= new ArrayList<>();
    public DepartmentMenu departmentMenu(){
        elements.get(12).click();
        return new DepartmentMenu();

    }
    public void findProduct() {
        typeByCssNEnter(".//*[@id='twotabsearchtextbox']","C++ Programing Language");

    }


}
