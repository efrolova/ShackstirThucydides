package pages;

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

public class EditProfilePage extends PageObject{

    @FindBy (id="headerBar")
 private WebElementFacade userNameTitle;

    @FindBy (id="dnn_ctr445_View_EditProfile_txtFirstName")
    private WebElementFacade firstName;

    @FindBy (id="dnn_ctr445_View_EditProfile_txtLastName")
    private WebElementFacade lastName;

    @FindBy (id="dnn_ctr445_View_EditProfile_txtDisplayName")
    private WebElementFacade displayName;

    @FindBy (id="dnn_ctr445_View_EditProfile_btnSaveMain1")
    private WebElementFacade btnUpdateName;

    @FindBy (id="savedNotificationMain1")
    private WebElementFacade saveNotification1;

    @FindBy (id="dnn_ctr445_View_EditProfile_aboutMeInput")
    private WebElementFacade infoAboutUser;

    @FindBy (id="countdown2")
    private WebElementFacade numberCharactRemain;

    @FindBy (id="dnn_ctr445_View_EditProfile_btnSaveMain2")
    private WebElementFacade btnUpdateInfoAboutUser;

    @FindBy (id="savedNotificationMain2")
    private WebElementFacade saveNotification2;

    @FindBy (id="dnn_ctr445_View_EditProfile_ddSpirits")
    private WebElementFacade editSplits;

    @FindBy (id="dnn_ctr445_View_EditProfile_btnAddSpirit")
    private WebElementFacade btnAddSpirit;

    @FindBy (id="dnn_ctr445_View_EditProfile_ddBrands")
    private WebElementFacade editBrands;

    @FindBy (id="dnn_ctr445_View_EditProfile_btnAddBrand")
    private WebElementFacade btnAddBrands;

    @FindBy (linkText = "Let us know!")
    private WebElementFacade linkLetUsKnow;

    @FindBy(id ="dnn_ctr445_RegistrationForm_ddlMonth")
    private WebElementFacade birthMonthEditProfile;

    @FindBy(id ="dnn_ctr445_RegistrationForm_ddlDay")
    private WebElementFacade birthDayEditProfile;

    @FindBy(id ="dnn_ctr445_View_EditProfile_birthdayYearDD")
    private WebElementFacade birthYearEditProfile;

    @FindBy (id="dnn_ctr445_View_EditProfile_btnSaveMain3")
    private WebElementFacade btnUpdateBirthday;

    @FindBy (id="savedNotificationMain3")
    private WebElementFacade saveNotification3;

    @FindBy (id="dnn_ctr445_View_EditProfile_currentCityInput")
    private WebElementFacade currentCity;

    @FindBy (id="dnn_ctr445_View_EditProfile_deleteCurrent")
    private WebElementFacade deleteCurrentCity;

    @FindBy (id="dnn_ctr445_View_EditProfile_hometownCityInput")
    private WebElementFacade hometownCity;

    @FindBy (id="dnn_ctr445_View_EditProfile_btnSaveMain4")
    private WebElementFacade btnUpdateLocationUser;

    @FindBy (id="savedNotificationMain4")
    private WebElementFacade saveNotification4;

    @FindBy (id="dnn_ctr445_View_EditProfile_shakerfacesInput")
    private WebElementFacade videoURL;

    @FindBy (id="dnn_ctr445_View_EditProfile_btnSaveMain5")
    private WebElementFacade btnUpdateVideo;

    @FindBy (id="savedNotificationMain5")
    private WebElementFacade saveNotification5;

    @FindBy (id="dnn_ctr445_View_EditProfile_emailInput")
    private WebElementFacade contactEmail;

    @FindBy (id="btnAddEmail")
    private WebElementFacade btnAddEmail;

    @FindBy (id="dnn_ctr445_View_EditProfile_phoneTypeDD")
    private WebElementFacade phoneTypeSelect;

    @FindBy (id="dnn_ctr445_View_EditProfile_phoneInput")
    private WebElementFacade phoneNumber;

    @FindBy (id="dnn_ctr445_View_EditProfile_addPhone")
    private WebElementFacade btnAddPhoneNumber;

    @FindBy (id="dnn_ctr445_View_EditProfile_screenNameDD")
    private WebElementFacade screenNameType;

    @FindBy (id="dnn_ctr445_View_EditProfile_screenNameInput")
    private WebElementFacade screenName;

    @FindBy (id="dnn_ctr445_View_EditProfile_addScreenName")
    private WebElementFacade btnAddScreenName;
    @FindBy (className="inlinelabel")
    private WebElementFacade phoneListLabels;

    @FindBy (id="dnn_ctr445_View_EditProfile_dlEmploymentStatus")
    private WebElementFacade selectBoxEmployStatus;

    @FindBy (id="dnn_ctr445_View_EditProfile_btnSaveMiscEmpChanges1")
    private WebElementFacade updateEmployStatus;

    @FindBy (id="savedNotificationEmployment1")
    private WebElementFacade savedEmployStatus;

    @FindBy (id="dnn_ctr445_View_EditProfile_jobtitle")
    private WebElementFacade positionJob;

    @FindBy (id="dnn_ctr445_View_EditProfile_pubSourceInput")
    private WebElementFacade publicationSource ;

    @FindBy (id="dnn_ctr445_View_EditProfile_pubLinkInput")
    private WebElementFacade publicationURL;

    @FindBy (id="dnn_ctr445_View_EditProfile_btnAddPublication")
    private WebElementFacade btnAddPublication;

    @FindBy (id="dnn_ctr445_View_EditProfile_dlUsbgCertification")
    private WebElementFacade typeUSBGCertification;

    @FindBy (id="dnn_ctr445_View_EditProfile_chkUSBGMember")
    private WebElementFacade  USBartendersGuildMember;

    @FindBy (id="dnn_ctr445_View_EditProfile_btnSaveMiscEmpChanges2")
    private WebElementFacade updateUSBG;

    @FindBy (id="savedNotificationEmployment2")
    private WebElementFacade savedUSBG;

    @FindBy (id="dnn_ctr445_View_EditProfile_certificationInput")
    private WebElementFacade certification;

    @FindBy (id="dnn_ctr445_View_EditProfile_btnAddCertification")
    private WebElementFacade btnAddCertification;

    @FindBy (id="dnn_ctr445_View_EditProfile_achievementInput")
    private WebElementFacade HonorsAndAwards;

    @FindBy (id=" dnn_ctr445_View_EditProfile_btnSaveMiscEmpChanges3")
    private WebElementFacade updateHonorsAndAwards;

    @FindBy (id="savedNotificationEmployment3")
    private WebElementFacade savedHonorsAndAwards;

            public EditProfilePage(WebDriver driver) {
        super(driver);
    }
    public void checkBasicLogin(String usernameTxt) {
        userNameTitle.waitUntilVisible();
        userNameTitle.shouldContainText(usernameTxt);
    }

}
