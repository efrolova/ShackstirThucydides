package thumbtack.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.*;

public class EditUserInfoSteps extends ScenarioSteps {

   	public EditUserInfoSteps(Pages pages) {
		super(pages);
	}

    @Step
    public void checkUserInformation(String usernameTxt) {
        onProfilePage().checkBasicInfo(usernameTxt);
    }
    @Step
    public void checkUserLogin(String usernameTxt) {
        onEditProfilePage().checkBasicLogin(usernameTxt);
    }

    private ProfilePage onProfilePage() {
        return getPages().currentPageAt(ProfilePage.class);
    }
    private EditProfilePage onEditProfilePage() {
        return getPages().currentPageAt(EditProfilePage.class);
    }
    @Step
    public void openLoginPage() {

    }


}

