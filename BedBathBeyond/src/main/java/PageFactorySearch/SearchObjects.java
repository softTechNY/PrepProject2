package PageFactorySearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by JHANGIR on 1/8/2017.
 */
public class SearchObjects  {
    WebDriver pageObjectDriver;
    @FindBy(id="searchFormInput")
    public WebElement searchField;
    @FindBy(css="")
    public WebElement deptNameBold;
    @FindBy(linkText = "Picture Frames")
    public WebElement picFrame;
    @FindBy(id ="certonaLastMinute")
    public WebElement addToCartBtn;
    @FindBy(css= ".//*[@id='shoppingCartItems']")
    public WebElement cart;
    @FindBy(css= ".//*[@id='cartItems']")
    public WebElement itemInCart;
    // this constructor call initelements method of PageFactory class.
    // initelements method will create the WebEelements declared in this class.
    public SearchObjects(WebDriver driver) {
        this.pageObjectDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void findByObject() {

    }



}
