package TestClass;

import UtilitiesClass.ReadFiles;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseClass {
    ReadFiles read = new ReadFiles();
    String url = read.Getbaseurl();
    String browser = read.Getbaseurl();


    public static WebDriver driver;

    @BeforeClass
    public void setup() {

        String browser = "msedge";

        switch (browser.toLowerCase()) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;

            case "msedge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                break;
            default:
                driver = null;
                break;
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(url);
    }

    @AfterClass
    public void TearDown() {
        //driver.close();
      // driver.quit();


    }

}
