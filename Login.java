package Airline;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Login {
    SHAFT.TestData.JSON testData;
    SHAFT.GUI.WebDriver driver;
    By username=By.xpath("//*[@id=\"id-Username\"]");
    By password=By.xpath("//*[@id=\"id-Password\"]");
    By loginbutton=By.xpath("/html/body/ndc-root/ndc-login-page/ndc-auth-container/div/div/div/ndc-auth-form-container/div/div[2]/ndc-fg-form-generator/form/div/div/button/span");


    public Login (SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }

    public Login login(){

        testData=new SHAFT.TestData.JSON("C:\\Users\\QC User\\Desktop\\Airline\\target\\classes\\userinfo.json");
        driver.element().type( username, testData.getTestData("name"));
        driver.element().type(password, testData.getTestData("password"));
        return this;
    }

    public Home gotohomepage(){
        driver.element().click(loginbutton);
        return new Home(driver);
    }
}
