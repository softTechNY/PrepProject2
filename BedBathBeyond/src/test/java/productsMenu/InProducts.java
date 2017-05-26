package productsMenu;

import CommonAPI.BaseBlock;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by JHANGIR on 1/7/2017.
 */
public class InProducts  extends BaseBlock {
   // @Test(priority = 1)
    public void products() throws InterruptedException {

        clickByXpath(".//*[@id='collegeBridalArea']/div[1]/a");
        for(int i =1; i<14; i++) {
            mouseHoverByXpath(".//*[@id='collegeBridalArea']/div[1]/div/ul/li[+i+]/a");
            sleepFor(5);
        }

    }
    @Test (priority = 1)
    public void assertion_hovermenu() {
        driver.get("www.bedbathandbeyond.com");
        String Actualtext;
        Actualtext = driver.findElement(By.xpath(".//*[@id='linkArea']/ul/li[3]")).getText();
        Assert.assertEquals(Actualtext,"My Offers");
        System.out.print("\n assertion is verified true");
    }
    @Test (priority = 2)
    public void checkProducts() throws InterruptedException{



        mouseHoverByXpath(".//*[@id='collegeBridalArea']/div[1]/a");
        sleepFor(1);
        mouseHoverByXpath(".//*[@id='collegeBridalArea']/div[2]/a");
        sleepFor(1);
        mouseHoverByXpath(".//*[@id='shopForCollegeLink']/a");
        sleepFor(1);
        mouseHoverByXpath(".//*[@id='bridalGiftRegistryAnchor']");
        sleepFor(1);

    }



}
