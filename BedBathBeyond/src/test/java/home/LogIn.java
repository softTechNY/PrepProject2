package home;

import CommonAPI.BaseBlock;
import PageFactorySearch.DifferentSingInAndOut;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by JHANGIR on 1/26/2017.
 */
public class LogIn extends BaseBlock{
    @Test
    public void logInTest() throws Exception{
       DifferentSingInAndOut user = PageFactory.initElements(driver, DifferentSingInAndOut .class);
        user.bedbathandbeyondLogin("mhossain456@gmail.com", "" );
    }
//    @Test
//    public void tesHome(){
//
//    }
//    @Test
//    public void testSignUp() {
//
//    }
}
