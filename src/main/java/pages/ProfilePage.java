package pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: efrolova
 * Date: 18.07.13
 * Time: 20:05
 * To change this template use File | Settings | File Templates.
 */
 //@DefaultUrl("http://shakestir-dev.dev.thumbtack.net/")
public class ProfilePage extends PageObject{

    @FindBy (id="BasicInformation")
 private WebElementFacade userInformation;

    @FindBy (linkText="Edit Profile")
    private WebElementFacade linkEditProfile ;

    @FindBy (id="dnn_dnnLogin_cmdLogin")
    private WebElementFacade logout;

    public ProfilePage(WebDriver driver) {
        super(driver);
    }
    public void checkBasicInfo(String usernameTxt) {
        userInformation.waitUntilVisible();
        userInformation.shouldContainText(usernameTxt);
    }
    public void linkOnEditProfilePage() {
        linkEditProfile.click();
    }
    public void pressLogout() {
        logout.click();
    }

}
