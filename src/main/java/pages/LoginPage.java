package pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created with IntelliJ IDEA.
 * User: efrolova
 * Date: 18.07.13
 * Time: 20:05
 * To change this template use File | Settings | File Templates.
 */
// @DefaultUrl("http://shakestir-dev.dev.thumbtack.net/login")
public class LoginPage extends PageObject{

    @FindBy (id="dnn_ctr413_Loader_ctl00_txtStandardUsername")
 private WebElementFacade usernameOrEmail;

    @FindBy (id="dnn_ctr413_Loader_ctl00_txtStandardPassword")
    private WebElementFacade password ;

    @FindBy(id = "dnn_ctr413_Loader_ctl00_btnStandardLogin")
    private WebElementFacade btnLogin;

    @FindBy(id = "dnn_ctr413_Loader_ctl00_hlForgotPassword")
    private WebElementFacade forgotPassword;

    @FindBy(id ="dnn_ctr413_Loader_ctl00_btnFacebook")
    private WebElementFacade loginAcrossFacebook;

    @FindBy(id ="dnn_ctr413_Loader_ctl00_btnTwitter")
    private WebElementFacade loginAcrossTwitter;

    @FindBy(id ="dnn_ctr413_Loader_ctl00_hlRegister")
    private WebElementFacade joinNow;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void typeUserNameEmail(String usernameTxt) {
        usernameOrEmail.type(usernameTxt);
    }
    public void typeUserPassword(String passwordTxt) {
        password.type(passwordTxt);
    }
    public void pressBtnLogin() {
        btnLogin.click();
    }
    public void pressLinkForgotPassword() {
       forgotPassword.click();
    }
    public void pressLoginFacebook() {
        loginAcrossFacebook.click();
    }
    public void pressLoginTwitter() {
        loginAcrossTwitter.click();
    }
    public void pressJoinNow() {
        joinNow.click();
    }
}
