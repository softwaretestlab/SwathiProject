package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
public static WebDriver driver;
    public static void NavtoWebsite(String url) {
        //chromedriver setup
        WebDriverManager.chromedriver().setup();
        //  driver initiated ---meaning chrome browser will open
         driver = new ChromeDriver();
        //window maximze
        driver.manage().window().maximize();
        //navigate to url
        driver.get(url);
    }
}