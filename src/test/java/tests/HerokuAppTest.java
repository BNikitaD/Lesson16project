package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HerokuAppTest {
    //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

        @Test
        public void fillUserandPasswor() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/login");
            driver.findElement(By.name("username")).sendKeys(new CharSequence[]{"tomsmith"});
            driver.findElement(By.name("password")).sendKeys(new CharSequence[]{"SuperSecretPassword!"});
            driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
            String expectedResult = "Welcome to the Secure Area. When you are done click logout below.";

            String actualResult = driver.findElement(By.xpath("//*[@class=\"subheader\"]")).getText();
            Assert.assertEquals(expectedResult, actualResult);
        }
}


