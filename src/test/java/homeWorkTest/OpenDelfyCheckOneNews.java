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
    private final By TOP_NEWS = By.cssSelector("a.top2012-title");

    @Test
    public void secondHomeTest() {
        System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);


        WebElement webElementelement = driver.findElement(CLOSE_COOKIE);
        webElementelement.click();

        WebElement firstNews = driver.findElement(TOP_NEWS);
        firstNews.click();

        Assert.assertEquals(
                        "Tramps sadusmojies uz Trudo un negaidīti atsauc ASV atbalstu G7 samita komunikē - DELFI", driver.getTitle());
        driver.quit();
    }
}
