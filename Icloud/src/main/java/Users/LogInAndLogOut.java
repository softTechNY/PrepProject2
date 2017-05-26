package Users;

import CommonAPI.BaseBlock;
import org.openqa.selenium.By;

/**
 * Created by JHANGIR on 5/23/2017.
 */
public class LogInAndLogOut extends BaseBlock {

    public void logInToAccount() throws InterruptedException {
        switchToFrame("auth-frame");
        driver.findElement(By.id("appleId")).sendKeys("mhossain456@gmail.com");
        driver.findElement(By.id("pwd")).sendKeys("Room@6temp");
        driver.findElement(By.cssSelector("button[id='sign-in']")).click();
        }



    public void logOutFromAccount() throws InterruptedException {
        mouseHoverByCss("lable#sc2055-label");
       // driver.findElement(By.xpath("html/body/div[3]/div[4]/div[2]/div[1]/label"));
         driver.findElement(By.linkText("Sign Out")).click();

    }
}

