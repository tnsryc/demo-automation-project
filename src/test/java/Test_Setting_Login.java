import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Test_Setting_Login extends BaseTest {

    @Test
    public void setNickname() throws InterruptedException {

        gittiGidiyorPage.setNickname("testtest362746");
        driver.findElement(By.id("gg-login-enter")).click();
        Thread.sleep(2000);

        gittiGidiyorPage.setSearchBox("Bilgisayar");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[2]/form/div/div[2]/button")).click();


        Thread.sleep(3000);



    }
    @Test
    public void setPassword() throws InterruptedException {

        gittiGidiyorPage.setPassword("123test");


    }






}
