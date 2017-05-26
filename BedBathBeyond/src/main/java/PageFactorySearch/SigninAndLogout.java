package PageFactorySearch;

import CommonAPI.BaseBlock;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by JHANGIR on 1/21/2017.
 */
public class SigninAndLogout extends BaseBlock {

    @FindBy(how = How.XPATH, using =".//*[@id='topNavMenu']/ul/li[2]/a")
    public static WebElement signin;
    public void clickSignin() {signin.click();}

    @FindBy(how =How.XPATH, using=".//*[@id='email']")
    public static WebElement inputEmail;
    public void typeEmail() {inputEmail.sendKeys("mhossain456@gmail.com");}

    @FindBy(how =How.XPATH, using=".//*[@id='password']")
    public static WebElement inputPassword;
    public void typePassword() {inputPassword.sendKeys("Room@6temp");}

    @FindBy(how =How.XPATH, using=".//*[@id='signinButton']/input[1]")
    public static WebElement submitSignin;
    public void signInNOw() {submitSignin.click();}


    @FindBy(how =How.XPATH, using=".//*[@id='myAccountLink']/a/span[2]")
    public static WebElement userTag;
    // does not have implimentation.
    @FindBy(how =How.XPATH, using=".//*[@id='myAccountFlyout']/ul/li[10]/a")
    public static WebElement logoutButton;
    public void setLogoutLink(){hoverAndSelectUsingXpath("html/body/div[1]/div[1]/div[1]/div[2]/div[1]/div/ul/li[2]/div[1]/a", ".//*[@id='myAccountFlyout']/ul/li[10]/a");}
    public void logOutNOw() {logoutButton.click();}
    public void loginasUser() {
        clickSignin();
        typeEmail();
        typePassword();
        signInNOw();
    }
    public void logoutasUser(){
        //mouseHoverByWebElement();
        setLogoutLink();
        //logOutNOw();
    }
//    @FindBy(how =How.XPATH, using="")
//    public static WebElement
//    public void
}
