package gmail_testScripts;

import gmail_login_page.POM_with_PageFactory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import browserFactory.browserFactory;

public class testScript_with_Pagefactory {
    @Test
    public void gmail_login()
    {
        WebDriver driver=browserFactory.startBrowser("chrome","https://gmail.com");
        POM_with_PageFactory login = PageFactory.initElements(driver, POM_with_PageFactory.class);
        login.login_gmail("devrajadhikari333@gmail.com", "123456");
    }
}
