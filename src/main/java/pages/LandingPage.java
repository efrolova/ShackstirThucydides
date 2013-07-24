package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.FindBy;
import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created with IntelliJ IDEA.
 * User: efrolova
 * Date: 18.07.13
 * Time: 20:05
 * To change this template use File | Settings | File Templates.
 */
//@DefaultUrl("http://shakestir-dev.dev.thumbtack.net/")
public class LandingPage extends PageObject{

    @FindBy (linkText="create account")
 private WebElementFacade createAccount ;

    @FindBy (id="dnn_dnnLogin_cmdLogin")
    private WebElementFacade login ;

    @FindBy(linkText = "Help")
    private WebElementFacade help;

    @FindBy(linkText = "Full Profile +")
    private WebElementFacade fullProfile;

    public LandingPage(WebDriver driver ) {

        super(driver);
    }

    public void pressLinkCreateAccount() {
        createAccount.click();
    }
    public void pressLinkLogin() {
        login.click();
    }
}
