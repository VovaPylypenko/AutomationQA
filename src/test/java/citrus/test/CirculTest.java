package citrus.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

public class CirculTest{

    protected WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://www.citrus.ua/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }

    @Test
    public void trySearch(){

        driver.findElement(By.id("search_sample")).click();
    }
}
