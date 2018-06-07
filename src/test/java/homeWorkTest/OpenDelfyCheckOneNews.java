package homeWorkTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenDelfyCheckOneNews {
    private final static String HOME_PAGE = "http://www.delfi.lv";
    private final By CLOSE_COOKIE = By.cssSelector("a.close.cookie");

    @Test
    public void secondHomeTest() {
        System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);


        WebElement webElementelement = driver.findElement(CLOSE_COOKIE);
        webElementelement.click();
        
        Assert.assertEquals(
                "Skujiņš atsauc savu kandidatūru VID ģenerāldirektora amatam", "Skujiņš atsauc savu kandidatūru VID ģenerāldirektora amatam");


        driver.quit();
    }
}
