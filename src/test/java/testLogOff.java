
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.FileAssert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class testLogOff {

    public static WebDriver driver;

    @BeforeTest
    public void setuoTest() {

        System.setProperty("webdriver.gecko.driver", "D:/java/geckodriver/geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionete", true);
        driver = new FirefoxDriver();
    }

    @AfterTest
    public void finishTest() {
        // driver.quit();
    }

    @Test
    public void checkLoginPage() {
        driver.get("http://www.ofsite.ru/board/");
        //open("http://www.ofsite.ru/board/");
        WebElement login = driver.findElement(By.name("nick"));
        login.sendKeys("Brucesep");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("kjgeijr");
        WebElement submit = driver.findElement(By.xpath("//input[@value='Войти']"));
        submit.click();

    }
}
