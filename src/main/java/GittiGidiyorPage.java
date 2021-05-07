import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class GittiGidiyorPage {
    private WebDriver driver;

    public GittiGidiyorPage(WebDriver driver) {
        this.driver = driver;
    }


    public void setPassword(String password) {

        WebElement passwordSpace = driver.findElement(By.id("L-PasswordField"));
        passwordSpace.click();
        passwordSpace.sendKeys(password);


    }
    public void setNickname(String nickname) throws InterruptedException {

        WebElement nicknameSpace = driver.findElement(By.id("L-UserNameField"));
        nicknameSpace.click();
        nicknameSpace.sendKeys(nickname);


    }
    public void setSearchBox(String search)  {

        WebElement setSearchSpace = driver.findElement(By.xpath("//input[@name='k']"));
        setSearchSpace.click();
        setSearchSpace.sendKeys(search);


    }





}
