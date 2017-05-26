package customerOrders;

import PageFactorySearch.PurchaseProducts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by JHANGIR on 5/22/2017.
 */
public class EndToEndOrder extends PurchaseProducts {
    @Test
    public void checkOutProces() throws Exception {
        PurchaseProducts productsToCheckout = PageFactory.initElements(driver,PurchaseProducts.class);
//        productsToCheckout.mouseHoverAndClick();
//        sleepFor(4);
//        productsToCheckout.selectAType();
        driver.navigate().to("https://www.bedbathandbeyond.com/store/product/kassatex-baratta-turkish-cotton-bath-rug/3253136?categoryId=13483");
//        driver.navigate().refresh();
//        driver.navigate().to(driver.getCurrentUrl());
//        scrollPageDown();
//        sleepFor(2);
//        waitUnitlClickAble(By.linkText("Kassatex Baratta Turkish Cotton Bath Rug"));
//        productsToCheckout.selectAnItem();
        productsToCheckout.select1stColor();
        productsToCheckout.addToCart();
        sleepFor(2);
        productsToCheckout.assertionAfterOnce();
        productsToCheckout.select2ndColor();
        productsToCheckout.addToCart();
        //productsToCheckout.assertionAfterAdding();
        productsToCheckout.checkOutthecart();
        productsToCheckout.delateAnItemFromCart();



    }

}
