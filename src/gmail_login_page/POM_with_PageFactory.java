package gmail_login_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class POM_with_PageFactory {
    WebDriver driver;
    public POM_with_PageFactory(WebDriver ldriver)
    {
        this.driver=ldriver;
    }
    @FindBy(id="identifierId")
    @CacheLookup
    WebElement username;

    @FindBy(how=How.ID,id="identifierNext")
    @CacheLookup
    WebElement usrNextButton;

    @FindBy(how=How.XPATH,id="//*[@name='password']")
    @CacheLookup
    WebElement password;

    @FindBy(how=How.ID,id="passwordNext")
    @CacheLookup
    WebElement passNextButton;

    public void login_gmail(String uid, String pass)
    {
        username.sendKeys(uid);
        usrNextButton.click();
        password.sendKeys(pass);
        passNextButton.click();
    }
}
