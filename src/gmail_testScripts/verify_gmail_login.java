package gmail_testScripts;


import gmail_login_page.POM_without_Pagefactory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class verify_gmail_login {
        @Test
        public void verify_valid_login ()
        {
            System.setProperty("webdriver.chrome.driver", "/Users/devrajadhikari/Downloads/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.gmail.com");

            POM_without_Pagefactory login = new POM_without_Pagefactory(driver);
            //login.loginToGmail("devrajadhikari333@gmail.com","123456");
            login.typeUsername("devrajadhikari333@gmail.com");
            login.clickUsrNext();
            login.typePassword("123456");
            login.clickPassNextButton();
            driver.quit();

        }
}
