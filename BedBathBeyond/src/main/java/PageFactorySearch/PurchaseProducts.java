package PageFactorySearch;

import CommonAPI.BaseBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by JHANGIR on 5/22/2017.
 */
public class PurchaseProducts extends BaseBlock {
    @FindBy(how= How.XPATH, using=".//*[@id='collegeBridalArea']/div[1]/a")
    public static WebElement selectProducts ;

    @FindBy(how= How.XPATH, using=".//*[@id='collegeBridalArea']/div[1]/div/ul/li[4]/a")
    public static WebElement selectBath ;

    @FindBy(how= How.LINK_TEXT, using="Fine Bath")
    public static WebElement clickFineBath ;

    @FindBy(how= How.LINK_TEXT, using="Kassatex Baratta Turkish Cotton Bath Rug")
    public static WebElement click_Kassatax ;

    @FindBy(how= How.XPATH, using=".//*[@id='row1']/div[1]/div[2]/fieldset/div/ul/li[1]/div")
    public static WebElement selectNavycolor ;

    @FindBy(how= How.XPATH, using=".//*[@id='buttonRedesign']/div/input")
    public static WebElement addingToCart  ;

    @FindBy(how= How.XPATH, using=".//*[@id='row1']/div[1]/div[2]/fieldset/div/ul/li[2]/div")
    public static WebElement selectSeaFoamColor ;


    @FindBy(how= How.XPATH, using=".//*[@id='cartItems']")
    public static WebElement cartItems  ;

    @FindBy(how= How.XPATH, using=".//*[@id='shoppingCartItems']/a")
    public static WebElement clickOncart ;

    @FindBy(how= How.XPATH, using=".//*[@id='cartItemID_DC2ci44940008251']/div[2]/div[2]/table/tbody/tr[3]/td/a/strong")
    public static WebElement removeAnItem ;

    public void mouseHoverAndClick() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(selectProducts).perform();
        action.moveToElement(selectBath).click().perform();
    }

   public void selectAType(){clickFineBath.click();}
   public void selectAnItem(){click_Kassatax.click();}
   public void select1stColor(){selectNavycolor.click();}
   public void addToCart() {addingToCart.click();}
   public void verifythecart(){cartItems.getText();}
   public void select2ndColor(){selectSeaFoamColor.click();}
   public void checkOutthecart(){clickOncart.click();}
   public void delateAnItemFromCart(){removeAnItem.click();}
   public void assertionAfterOnce() {
       String actualValue;
       actualValue = driver.findElement(By.xpath(".//*[@id='cartItems']")).getText();
       Assert.assertEquals(actualValue, "1");
       System.out.print("\n assertion to check for adding first item");
    }




}
