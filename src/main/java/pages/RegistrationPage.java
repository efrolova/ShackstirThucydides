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
 //@DefaultUrl("/login/ctl/registration/mid/413")
public class RegistrationPage extends PageObject{

    @FindBy (id="dnn_ctr413_RegistrationForm_tbFirstName")
 private WebElementFacade firstName;

    @FindBy (id="dnn_ctr413_RegistrationForm_tbLastName")
    private WebElementFacade lastName ;

    @FindBy(id = "dnn_ctr413_RegistrationForm_tbUserName")
    private WebElementFacade username;

    @FindBy(id = "dnn_ctr413_RegistrationForm_tbEmail")
    private WebElementFacade email;

    @FindBy(id ="dnn_ctr413_RegistrationForm_tbConfirmEmail")
    private WebElementFacade confirmEmail;

    @FindBy(id ="dnn_ctr413_RegistrationForm_tbPassword")
    private WebElementFacade password;

    @FindBy(id ="dnn_ctr413_RegistrationForm_tbConfirmPassword")
    private WebElementFacade confirmPassword;

    @FindBy(id ="dnn_ctr413_RegistrationForm_ddlGender")
    private WebElementFacade genderCheckBox;                //--,M,F

    @FindBy(id ="dnn_ctr413_RegistrationForm_ddlMonth")
    private WebElementFacade birthdayMonth;

    @FindBy(id ="dnn_ctr413_RegistrationForm_ddlDay")
    private WebElementFacade birthdayDay;

    @FindBy(name ="dnn$ctr413$RegistrationForm$ddlYear")
    private WebElementFacade birthdayYear;

    @FindBy(id ="dnn_ctr413_RegistrationForm_btnCreateAccount")
    private WebElementFacade btnCreateAccount;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    public void typeFirstName(String firstNameTxt) {
        firstName.type(firstNameTxt);
    }
    public void typeLastName(String lastNameTxt) {
        lastName.type(lastNameTxt);
    }
    public void typeUserName(String usernameTxt) {
        username.type(usernameTxt);
    }
    public void typeUserEmail(String userEmailTxt) {
        email.type(userEmailTxt);
    }
    public void confirmUserEmail(String userEmail2Txt) {
        confirmEmail.type(userEmail2Txt);
    }
    public void typeUserPassword(String passwordTxt) {
        password.type(passwordTxt);
    }
    public void typeConfirmPassword(String password2Txt) {
       confirmPassword.type(password2Txt);
    }
    public void chooseGender(String genderTxt) {
       genderCheckBox.selectByValue(genderTxt);
    }
    public void chooseBirthdayMonth(String birthdayMonthTxt) {
       birthdayMonth.selectByValue(birthdayMonthTxt);
    }
    public void chooseBirthdayDay(String birthdayDayTxt) {
        birthdayDay.selectByValue(birthdayDayTxt);
    }
    public void chooseBirthdayYear(String birthdayYearTxt) {
        birthdayYear.selectByValue(birthdayYearTxt);
    }
    public void pressCreateAccount() {
        btnCreateAccount.click();
    }
}
