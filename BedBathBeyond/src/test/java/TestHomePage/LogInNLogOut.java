package TestHomePage;

import CommonAPI.BaseBlock;
import PageFactorySearch.SigninAndLogout;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by JHANGIR on 1/21/2017.
 */
public class LogInNLogOut extends BaseBlock {
    @Test
    public void checkuserTest() throws InterruptedException {
        SigninAndLogout user = PageFactory.initElements(driver, SigninAndLogout.class);
        user.loginasUser();
        sleepFor(2);
        user.logoutasUser();
        sleepFor(2);
    }
}
