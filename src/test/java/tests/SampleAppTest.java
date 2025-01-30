package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleAppTest {
    public SampleAppTest() {
    }

    @Test
    public void fillCorrectly() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestingplayground.com/sampleapp");
        driver.findElement(By.name("UserName")).sendKeys(new CharSequence[]{"Nikita"});
        driver.findElement(By.name("Password")).sendKeys(new CharSequence[]{"pwd"});
        driver.findElement(By.id("login")).click();
        String expectedResult = "Welcome, Nikita!";
        String actualResult = driver.findElement(By.xpath("//*[@class=\"text-success\"]")).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}

