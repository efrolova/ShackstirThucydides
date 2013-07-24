package thumbtack;

import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.WithDriver;
import net.thucydides.junit.annotations.UseTestDataFrom;
import net.thucydides.junit.runners.ThucydidesParameterizedRunner;
import org.junit.Test;
import org.junit.runner.RunWith;




@UseTestDataFrom(value="src/test/resource/userExit.csv",separator = ',')
@RunWith(ThucydidesParameterizedRunner.class)

public class EditProfileInfo extends BaseTest {
    @Issue("Login Successful")


    @Test
    @WithDriver("chrome")
    public void EditProfileBaseInfo() {
        userRegistSteps.openLoginPage();
        userRegistSteps.loginSuccess(name+2+email,password);
        userRegistSteps.checkUserInfoAfterRegistration(name);



        userRegistSteps.doUserLogout();
    }



} 