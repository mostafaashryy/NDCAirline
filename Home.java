package Airline;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;


public class Home {

    SHAFT.GUI.WebDriver driver;
    By master = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div[1]/tilde-theme-navigation-header/div/ul/li[3]/a");
    By airline=By.id("searchAirline");




    public Home (SHAFT.GUI.WebDriver driver){
        this.driver=driver;
    }

    public void master(){
        driver.element().click(master);
    }

    public AddAirline gotoaddairlinepage(){
        driver.element().click(airline);
        return new AddAirline(driver);

    }



}
