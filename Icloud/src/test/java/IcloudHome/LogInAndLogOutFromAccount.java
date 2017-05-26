package IcloudHome;

import Users.LogInAndLogOut;
import org.testng.annotations.Test;

/**
 * Created by JHANGIR on 5/23/2017.
 */
public class LogInAndLogOutFromAccount extends LogInAndLogOut {
    @Test
    public void AccountTest() throws InterruptedException {
        LogInAndLogOutFromAccount user = new LogInAndLogOutFromAccount();
        user.logInToAccount();
        sleepFor(2);
        user.logOutFromAccount();
    }
}
