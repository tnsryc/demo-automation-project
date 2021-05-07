import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    protected WebDriver driver;
    GittiGidiyorPage gittiGidiyorPage;


    @BeforeAll
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver1.exe");
        driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com");
        driver.manage().window().maximize();
        System.out.println("Gitti Gidiyor Anasayfa Açılmıştır.");

        Actions act = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[3]/div/div[1]/div"));
        act.moveToElement(we).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[3]/div/div[1]/div[2]/div/div/div/a")).click();
        gittiGidiyorPage = new GittiGidiyorPage(driver);


        System.out.println("LOGIN SUCCESSFUL");



    }





    @AfterAll
    public void tearDown() {

        System.out.println("Test Finished!");
    }
}
