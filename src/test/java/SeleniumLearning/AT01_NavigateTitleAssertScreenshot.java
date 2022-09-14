package SeleniumLearning;

import BaseClass.OpenBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateTitleAssertScreenshot {
    @Test
    public void navigate() throws IOException {
//        //chromedriver setup
//        WebDriverManager.chromedriver().setup();
//      //  driver initiated ---meaning chrome browser will open
//        WebDriver driver = new ChromeDriver();
//        //window maximze
//        driver.manage().window().maximize();
//        //navigate to url
//        driver.get("https://www.harveynorman.com.au/");
        OpenBrowser.NavtoWebsite("https://www.harveynorman.com.au/");
        //implicit wait
        OpenBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get title
        String ActualTitle = OpenBrowser.driver.getTitle();
        System.out.println("ActualTitle : "+ActualTitle);
        String ExpectedTitle = "Computers, Electrical, Furniture & Bedding | Harvey Norman Australia";
        //Assertion version-1
        Assert.assertEquals(ExpectedTitle,ActualTitle);
        //Assertion version-2
        Assert.assertTrue(ActualTitle.contains("Electrical"));
        //Screenshot
        File screenshotFile = ((TakesScreenshot)OpenBrowser.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\softw\\screenshot.jpeg"));


    }
}
