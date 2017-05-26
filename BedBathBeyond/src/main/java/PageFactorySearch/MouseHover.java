package PageFactorySearch;

import CommonAPI.BaseBlock;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by JHANGIR on 1/21/2017.
 */
public class MouseHover extends BaseBlock {
    @FindBy(how =How.XPATH, using=".//*[@id='collegeBridalArea']/div[1]/a")
    public static WebElement products;

    @FindBy(how = How.XPATH, using = ".//*[@id='collegeBridalArea']/div[2]/a")
    public static WebElement trendsandIdeas;

    @FindBy(how =How.XPATH, using=".//*[@id='shopForCollegeLink']/a")
    public static WebElement college;

    public void hoverheadings() throws InterruptedException {
        mouseHoverByWebElement(products);
        sleepFor(2);
        mouseHoverByWebElement(trendsandIdeas);
        sleepFor(2);
        mouseHoverByWebElement(college);
        sleepFor(2);
    }

    //public  void mousehover() throws InterruptedException {
       //mouseHoverByXpath(".//*[@id='collegeBridalArea']/div[1]/a");
//        sleepFor(5);
//        mouseHoverByXpath(".//*[@id='collegeBridalArea']/div[2]/a");
//        sleepFor(5);
//        mouseHoverByXpath(".//*[@id='shopForCollegeLink']/a");
//        sleepFor(5);
//    }
}