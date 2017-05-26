package PageFactorySearch;

import CommonAPI.BaseBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by JHANGIR on 1/26/2017.
 */
public class DifferentSingInAndOut extends BaseBlock {
    WebDriver driver;

//    public DifferentSingInAndOut(WebDriver driver) {this.driver= driver;}
//    By userName = By.cssSelector("");
//    By Password = By.cssSelector("");
//    By submit = By.xpath("");
//
//    public WebElement EmailID() { return driver.findElement(userName);}
//    public WebElement password() {return driver.findElement(Password);}
//    public WebElement Submit() {return driver.findElement(submit);}
    @FindBy(how= How.XPATH, using=".//*[@id='topNavMenu']/ul/li[2]/a")
    public static WebElement AccountLogInLink;
    @FindBy(how=How.XPATH, using=".//*[@id='email")
    public static WebElement UserId;
    @FindBy(how=How.XPATH, using=".//*[@id='password']")
    public static WebElement UserPass;
    @FindBy(how=How.XPATH, using=".//*[@id='signinButton']/input[1]")
    public static WebElement LogInSubmit;
    public void setLogoutLink(){mouseHoverByXpath(".//*[@id='myAccountLink']/a/span[2]");}
    @FindBy(how=How.XPATH, using=".//*[@id='myAccountFlyout']/ul/li[10]/a")
    public static WebElement LogoutSubmit;

    public void bedbathandbeyondLogin(String userID, String userPass)
    {
        AccountLogInLink.click();
        UserId.sendKeys(userID);
        UserPass.sendKeys(userPass);
        LogInSubmit.click();
    }

}
