package WebHooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

import org.junit.After;
import org.junit.Before;



public class WebHooks {
     public static void openWeb(){
        Selenide.open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
       }

    @Before
    public  void SetUp(){
        openWeb();
        Configuration.startMaximized = true;

        }
    @After
    public void SetDown() {
        WebDriverRunner.closeWebDriver();
    }



}