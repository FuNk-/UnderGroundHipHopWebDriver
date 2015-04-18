import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by FuNk on 4/18/2015.
 */
public class FirstTest {

    @Test
    public void getTitle() {

        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.undergroundhiphop.com/");

        Assert.assertTrue(driver.getTitle().equals("Underground Hip Hop | Official Home Of Underground Hip Hop"),
                "The title should be: 'Underground Hip Hop | Official Home Of Underground Hip Hop'");

        driver.close();
        driver.quit();

    }


    @Test
    public void getTitleWrong() {

        WebDriver driver = new HtmlUnitDriver();
        driver.navigate().to("http://www.undergroundhiphop.com/");

        Assert.assertTrue(driver.getTitle().equals("Underground Hip Hop | Official Home Of Underground Hip Hop"),
                "The title should be: 'Underground Hip Hop | Official Home Of Underground Hip Hop'");

        driver.close();
        driver.quit();

    }
}
