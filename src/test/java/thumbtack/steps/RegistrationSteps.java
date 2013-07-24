package thumbtack.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.*;

public class RegistrationSteps extends ScenarioSteps {

   	public RegistrationSteps(Pages pages) {
		super(pages);
	}


    @Step
    public void openRegistration() {
       onLandingPage().pressLinkCreateAccount();
    }
    @Step
    public void pressLogin() {
        onLoginPage().pressBtnLogin();
    }
    @Step
       public void inputUserName(String usernameTxt) {
        onLoginPage().typeUserNameEmail(usernameTxt);
    }
    @Step
    public void inputPassword(String passwordTxt) {
        onLoginPage().typeUserPassword(passwordTxt);
    }
    @Step
       public void clickForgotPassword() {
        onLoginPage().pressLinkForgotPassword();
    }
    @Step
         public void inputFirstName(String firstNameTxt) {
        onRegistrationPage().typeFirstName(firstNameTxt);
    }
    @Step
    public void inputLastName(String lastNameTxt) {
        onRegistrationPage().typeLastName(lastNameTxt);
    }
    @Step
    public void inputUserNameReg(String usernameTxt) {
        onRegistrationPage().typeUserName(usernameTxt);
    }
    @Step
    public void inputUserEmail(String userEmailTxt) {
        onRegistrationPage().typeUserEmail(userEmailTxt);
    }
    @Step
    public void confirmUserEmail(String userEmail2Txt) {
        onRegistrationPage().confirmUserEmail(userEmail2Txt);
    }
    @Step
    public void inputPasswordRegist(String passwordTxt) {
        onRegistrationPage().typeUserPassword(passwordTxt);
    }
    @Step
    public void confirmPasswordRegist(String password2Txt) {
        onRegistrationPage().typeConfirmPassword(password2Txt);
    }
    @Step
    public void setGender(String genderTxt) {
        onRegistrationPage().chooseGender(genderTxt);
    }
    @Step
    public void setBirthdayMonth(String birthdayMonthTxt) {
        onRegistrationPage().chooseBirthdayMonth(birthdayMonthTxt);
    }
    @Step
    public void setBirthdayDay(String birthdayDayTxt) {
        onRegistrationPage().chooseBirthdayDay(birthdayDayTxt);
    }
    @Step
    public void setBirthdayYear(String birthdayYearTxt) {
        onRegistrationPage().chooseBirthdayYear(birthdayYearTxt);
    }
    @Step
    public void clickJoinNow() {
        onLoginPage().pressJoinNow();
    }
    @Step
    public void clickCreateAccount() {
        onRegistrationPage().pressCreateAccount();
    }
    @Step
    public void checkUserInformation(String usernameTxt) {
        onProfilePage().checkBasicInfo(usernameTxt);
    }
    @Step
    public void checkUserLogin(String usernameTxt) {
        onEditProfilePage().checkBasicLogin(usernameTxt);
    }
    @Step
    public void doUserLogout() {
        onProfilePage().pressLogout();
    }
    private LandingPage onLandingPage() {
        return getPages().currentPageAt(LandingPage.class);
    }
    private LoginPage onLoginPage() {
        return getPages().currentPageAt(LoginPage.class);
    }
    private RegistrationPage onRegistrationPage() {
        return getPages().currentPageAt(RegistrationPage.class);
    }
    private ProfilePage onProfilePage() {
        return getPages().currentPageAt(ProfilePage.class);
    }
    private EditProfilePage onEditProfilePage() {
        return getPages().currentPageAt(EditProfilePage.class);
    }
    @Step
    public void openLoginPage() {
        openRegistration();
    }
    @Step
    public void openRegistrationPage() {
        openRegistration();
        clickJoinNow();
    }
    @Step
    public void loginSuccess(String usernameTxt,String passwordTxt) {
        inputUserName(usernameTxt);
        inputPassword(passwordTxt);
        pressLogin();
    }
    @Step
    public void RegistrationSuccess(String firstNameTxt,String lastNameTxt,String usernameTxt,String userEmailTxt,String passwordTxt,String genderTxt,String bMonthTxt,String bDayTxt,
                                    String bYearTxt) {
        inputFirstName(firstNameTxt);
        inputLastName(lastNameTxt);
        inputUserNameReg(usernameTxt);
        inputUserEmail(userEmailTxt);
        confirmUserEmail(userEmailTxt);
        inputPasswordRegist(passwordTxt);
        confirmPasswordRegist(passwordTxt);
        setGender(genderTxt);
        setBirthdayMonth(bMonthTxt);
        setBirthdayDay(bDayTxt);
        setBirthdayYear(bYearTxt);
        clickCreateAccount();
    }

   @Step
    public void checkUserInfoAfterRegistration(String usernameTxt){
       checkUserInformation(usernameTxt);
   }
    @Step
    public void checkUserLoginSuccess(String usernameTxt){
        checkUserLogin(usernameTxt);
    }
    @Step
    public void RegistrationUnsuccess(String firstNameTxt,String lastNameTxt,String usernameTxt,String passwordTxt,String password2Txt,String userEmailTxt,String userEmail2Txt) {

    }
}

