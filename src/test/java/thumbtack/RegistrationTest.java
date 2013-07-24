package thumbtack;

import junit.framework.TestSuite;
import net.thucydides.core.annotations.Issue;

import net.thucydides.core.annotations.WithDriver;
import net.thucydides.junit.annotations.UseTestDataFrom;
import net.thucydides.junit.runners.ThucydidesParameterizedRunner;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static net.thucydides.core.steps.StepData.withTestDataFrom;



@UseTestDataFrom(value="src/test/resource/users.csv",separator = ',')
@RunWith(ThucydidesParameterizedRunner.class)
//@RunWith(ThucydidesRunner.class)

public class RegistrationTest extends BaseTest {
    @Issue("Free_registrationSuccesful")
    @Test
    @WithDriver("iexplorer")

    public void loginSuccessful(){
      // for (i=2;i<25;i++)  {
        userRegistSteps.openLoginPage();
//        withTestDataFrom("src/test/resource/userExist.csv").run(userRegistSteps).loginSuccess(name+(i)+email,password);
//         withTestDataFrom("src/test/resource/userExist.csv").run(userRegistSteps).checkUserLoginSuccess(firstName+" "+lastName+(i));
       userRegistSteps.loginSuccess(name+(i)+email,password);
       userRegistSteps.checkUserLoginSuccess(firstName+" "+lastName+(i));
    //   }
    }
  @Test
  @WithDriver("iexplorer")
    public void Free_registrationSuccesful()  {
      //  for (i=35;i<44;i++){
      i=37;

     userRegistSteps.openRegistrationPage();

//      withTestDataFrom("src/test/resource/users.csv").run(userRegistSteps).RegistrationSuccess(firstName,lastName+i,name+i,name+i+email,password,gender,bMonth,bDay,bYear);
//      withTestDataFrom("src/test/resource/users.csv").run(userRegistSteps).checkUserInfoAfterRegistration(firstName+" "+lastName+i);

     userRegistSteps.RegistrationSuccess(firstName,lastName+i,name+i,name+i+email,password,gender,bMonth,bDay,bYear);
     userRegistSteps.checkUserInfoAfterRegistration(firstName+" "+lastName+i);
      userRegistSteps.doUserLogout();
  //     }
    }


} 