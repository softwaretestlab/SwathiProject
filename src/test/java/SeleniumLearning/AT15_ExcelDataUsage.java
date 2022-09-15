package SeleniumLearning;
import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utilities.Xls_Reader;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class AT15_ExcelDataUsage {

    @Test
    public void table() throws IOException {
//        //setting up chromedriver
//        WebDriverManager.chromedriver().setup();
//        //options
//        ChromeOptions chromeOptions = new ChromeOptions();
//        //we create an object of WebDriver
//        WebDriver driver = new ChromeDriver(chromeOptions);
//        //At this point browser will be opened
//        //maximize browser
//        driver.manage().window().maximize();
        //Navigate to GG AccountCreation page

        OpenBrowser.NavtoWebsite(ReadPropertiesFile.PropFile("GGHomePageUrl"));
        //implicit wait
        OpenBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     //   C:\Users\softw\IdeaProjects\DileepProject\src\main\java\Resources/TestDataHN1.xlsx
        Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\TestDataHN1.xlsx");
// count of rows in the excel sheet
        int rowcount=reader.getRowCount("RegTestData");
        System.out.println("rowcount :"+rowcount);
        for(int i=2;i<=rowcount;i++){
            String FirstName=reader.getCellData("RegTestData","FirstName",i);
            System.out.println("FirstName value is : "+ FirstName);
            //FistName
            OpenBrowser.driver.findElement(By.id("regAddForm_firstName")).clear();
            OpenBrowser.driver.findElement(By.id("regAddForm_firstName")).sendKeys(FirstName);
            //Here we picked up data for LastName from excel
            String lastname=reader.getCellData("RegTestData","LastName",i);
            OpenBrowser.driver.findElement(By.id("regAddForm_lastName")).clear();
            OpenBrowser.driver.findElement(By.id("regAddForm_lastName")).sendKeys(lastname);
            //Here we picked up data for Email Address from excel
            String email_address=reader.getCellData("RegTestData","EmailAddress",i);
            OpenBrowser.driver.findElement(By.id("regAddForm_email1")).clear();
            OpenBrowser.driver.findElement(By.id("regAddForm_email1")).sendKeys(email_address);
            //Password
            String password=reader.getCellData("RegTestData","Password",i);
            OpenBrowser.driver.findElement(By.id("regAddForm_password")).clear();
            OpenBrowser.driver.findElement(By.id("regAddForm_password")).sendKeys(password);
            //reenter password
            String confirmation=reader.getCellData("RegTestData","RePassword",i);
            OpenBrowser.driver.findElement(By.id("regAddForm_passwordNew")).clear();
            OpenBrowser.driver.findElement(By.id("regAddForm_passwordNew")).sendKeys(confirmation);
            //put data back into excelsheet
            String textName=OpenBrowser.driver.findElement(By.xpath("//h1[contains(text(),'Create an Account')]")).getText();
            reader.setCellData("RegTestData","Result",i,textName);
        }
    }
}
