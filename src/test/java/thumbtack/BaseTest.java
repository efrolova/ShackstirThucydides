package thumbtack;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import net.thucydides.junit.runners.ThucydidesParameterizedRunner;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import thumbtack.steps.RegistrationSteps;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.fail;


@UseTestDataFrom(value="src/test/resource/users.csv",separator = ',')

@RunWith(ThucydidesParameterizedRunner.class)
//@RunWith(ThucydidesRunner.class)

public class BaseTest {

    public String baseUrlProduction = "http://www.shakestir.com/";


    public static   ChromeDriverService serviceGC;
    public static   InternetExplorerDriverService serviceIE;
   //  static WebDriver driver;
    public String baseUrlDev="http://shakestir-dev.dev.thumbtack.net/";
    public String titleDashboard=" Dashboard ";
    public int i=4;

    public String firstName;
    public String lastName;
    public String name;

    public  String email;
    public String re_email;
    public String password;
    public  String re_password;

    public String gender;
    public String bMonth;
    public String bDay;
    public String bYear;

    public String adr1;
    public  String adr2;
    public  String city;
    public  String state;
    public String zipCode;
    public  String country;

    public String fullName;
    public String currency;
    public String passwordNew;
    public String emailNew;

    public void inputUserDataFreeRegistra(String firstName,String lastName,String name, String email,String re_email, String password,String re_password) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.name = name;
        this.email = email;

        this.re_email=re_email;
        this.password = password;
        this.re_password = re_password;

    }

     public void inputUserDataLocation(String gender,String bMonth,String bDay,String bYear)
    {
        this.gender = gender;
        this.bMonth = bMonth;
        this.bDay = bDay;
        this.bYear = bYear;

    }
    public void inputUserEditProfile(String fullName,String currency,String passwordNew,String emailNew)
    {

        this.fullName = fullName;
        this.currency = currency;
        this.passwordNew=passwordNew;
        this.emailNew=emailNew;
    }

            @Qualifier
            public String getQualifier() {
        return name;
    }
    @BeforeClass
    public static void setUp() throws Exception {
        serviceGC = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("C:/Tools/Selenium/chromedriver.exe"))
                .usingAnyFreePort()
                .build();
        serviceGC.start();
//        serviceIE = new InternetExplorerDriverService.Builder()
//                .usingDriverExecutable(new File("C:/Tools/Selenium/IEDriverServer.exe"))
//                .usingAnyFreePort()
//                .build();
//        serviceIE.start();

//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        System.setProperty("webdriver.ie.driver","IEDriverServer.exe");

//       driver = new RemoteWebDriver(serviceIE.getUrl(),
//               DesiredCapabilities.internetExplorer());
//                DesiredCapabilities.chrome());


    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
        //serviceGC.stop();
        serviceIE.stop();
        }

    @Managed(uniqueSession = true,driver = "chrome")
    public static WebDriver driver;

@ManagedPages(defaultUrl = "http://shakestir-dev.dev.thumbtack.net/")
public Pages pages;


@Steps
public RegistrationSteps userRegistSteps;

}