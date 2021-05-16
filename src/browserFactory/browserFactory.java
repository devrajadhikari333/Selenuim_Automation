package browserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserFactory {
    static WebDriver driver;

    public static WebDriver startBrowser(String browserName, String url)
    {
        if(browserName.equalsIgnoreCase("firefox"))
        {
            driver= new FirefoxDriver();
        }
        else if(browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "/Users/devrajadhikari/Downloads/chromedriver");
            driver=new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("IE"))
        {
            driver=new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.get("https://gmail.com");

        return driver;
    }
}
