package gmail_login_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class POM_without_Pagefactory {
    WebDriver driver;

    /**Locators
     * this section contains only locators
     * */
    By username = By.id("identifierId");
    By usrNextButton = By.id("identifierNext");
    By password = By.xpath("//*[@name='password']");
    By passNextButton = By.id("passwordNext");

    /*OR
    @FindBy(id = "identifierId")
    WebElement username;
    @FindBy(how = How.ID,using = "identifierId") WebElement username;
    @FindBy(how=How.ID_OR_NAME,using = "identifierId") WebElement username;
    @FindBy(how=How.LINK_TEXT,using = "xyz") WebElement forgot_password; //can use a locator element using link_Text
     */

    /**
     * this is a constructor which initialize the webdriver
     * @param driver
     */

    public POM_without_Pagefactory(WebDriver driver)
    {
        this.driver=driver;
    }

    /**Basic Actions
     * this section contains the basic action methods/functions
     * */
    public void loginToGmail(String userid, String pass)
    {
        driver.findElement(username).sendKeys(userid);
        driver.findElement(usrNextButton).click();
        driver.findElement(password).sendKeys(pass);
        driver.findElement(passNextButton).click();
    }
    public void typeUsername(String userid)
    {
        driver.findElement(username).sendKeys(userid);
    }
    public void clickUsrNext()
    {
        driver.findElement(usrNextButton).click();
    }
    public void typePassword(String pass)
    {
        driver.findElement(password).sendKeys(pass);
    }
    public void clickPassNextButton()
    {
        driver.findElement(passNextButton).click();
    }

}


