package homeWorkTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class WithIfHelp {

    private final static String HOME_PAGE = "http://www.delfi.lv";
    private final String NEWS_NAME = "Daži 'Vienotības' deputāti apsver iespēju atbalstīt Rasnača atlaišanu; frakcija vēl lems par nostāju";
    private final By ALLNEWS = By.xpath(".//*[@class = 'top2012-title']/a");

    @Test
    public void tryFindNewsWithIf() {

        System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);

        List<WebElement> newsMenu = new ArrayList<WebElement>();
        newsMenu = driver.findElements(ALLNEWS);

        boolean isNewsFound = false;
        for (int i = 0; i < newsMenu.size(); i++) {

            if (newsMenu.get(i).getText().equals(NEWS_NAME)) {

                break;
            }
            Assert.assertTrue("News not found ", isNewsFound);

        }

    }


}
