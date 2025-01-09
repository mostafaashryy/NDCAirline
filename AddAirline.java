package Airline;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class AddAirline {
    SHAFT.GUI.WebDriver driver;
    By add=By.id("add_click");
    By airlinename=By.id("airlineName");
    By airlinecode=By.id("airlineCode");
    By Airlinetype=By.id("typeAir");
    By NetworkType=By.id("network_type");
    By allianceName=By.id("allianceName");
    By codesharing=By.xpath("//*[@id=\"formId\"]/div/div[6]/div/div[2]/label");
    By sendForApproval=By.id("create");
    By Cansel=By.xpath("//*[@id=\"formId\"]/div/div[7]/input[2]");

    public AddAirline (SHAFT.GUI.WebDriver driver){
        this.driver=driver;}

    public void sendApprovalWithValidInput(){

        driver.element().click(add);
        driver.element().type(airlinename,"1328245558");
        driver.element().type(airlinecode,"@#5252-`");
        driver.element().select(Airlinetype,"GDS");
        driver.element().select(NetworkType,"International");
        driver.element().select(allianceName,"SkyTeam");
        driver.element().click(codesharing);
        driver.element().click(sendForApproval);
    }
    //invalid airlinename
    public void sendApprovalWithDuplicateAirlineName(){
        driver.element().click(add);
        driver.element().type(airlinename,"CS");
        driver.element().type(airlinecode,"6564");
        driver.element().select(Airlinetype,"GDS");
        driver.element().select(NetworkType,"International");
        driver.element().select(allianceName,"SkyTeam");
        driver.element().click(codesharing);
        driver.element().click(Cansel);

    }
    //invalid airlinecode
    public void sendApprovalWithDuplicateAirlineCode(){
        driver.element().click(add);
        driver.element().type(airlinename,"ssdz");
        driver.element().type(airlinecode,"85`");
        driver.element().select(Airlinetype,"GDS");
        driver.element().select(NetworkType,"International");
        driver.element().select(allianceName,"SkyTeam");
        driver.element().click(codesharing);
        driver.element().click(Cansel);

    }
    //Empty Fields
    public void sendApprovalWithEmptyFields(){
        driver.element().click(add);
        driver.element().type(airlinename,"");
        driver.element().type(airlinecode,"");
        driver.element().select(Airlinetype,"");
        driver.element().select(NetworkType,"");
        driver.element().select(allianceName,"");
        driver.element().click(codesharing);
        driver.element().click(Cansel);

    }
    //Each Field Empty
    public void sendApprovalWithEachFieldEmpty() {
        driver.element().click(add);
        driver.element().type(airlinename, "");
        driver.element().type(airlinecode, "xc");
        driver.element().select(Airlinetype, "GDS");
        driver.element().select(NetworkType, "International");
        driver.element().select(allianceName, "SkyTeam");
        driver.element().click(codesharing);
        driver.element().click(Cansel);
    }
    //..................
    //Valid Input with Different Network Types
    public void sendApprovalWithValidInputWithDifferentNetworkTypesDomestic() {
        driver.element().click(add);
        driver.element().type(airlinename, "fffd");
        driver.element().type(airlinecode, "`658");
        driver.element().select(Airlinetype, "GDS");
        driver.element().select(NetworkType, "Domestic");
        driver.element().select(allianceName, "SkyTeam");
        driver.element().click(codesharing);
        driver.element().click(sendForApproval);
    }
    //Valid Input with Different Network Types
    public void sendApprovalWithValidInputWithDifferentNetworkTypesInternational() {
        driver.element().click(add);
        driver.element().type(airlinename, "fffd");
        driver.element().type(airlinecode, "`898");
        driver.element().select(Airlinetype, "GDS");
        driver.element().select(NetworkType, "International");
        driver.element().select(allianceName, "SkyTeam");
        driver.element().click(codesharing);
        driver.element().click(sendForApproval);
    }//Valid Input with Different Network Types
    public void sendapprovalwithValidInputwithDifferentNetworkTypesBOTH() {
        driver.element().click(add);
        driver.element().type(airlinename, "dww");
        driver.element().type(airlinecode, "`8984");
        driver.element().select(Airlinetype, "GDS");
        driver.element().select(NetworkType, "Both");
        driver.element().select(allianceName, "SkyTeam");
        driver.element().click(codesharing);
        driver.element().click(sendForApproval);
    }
    //Valid Input with Different Airline Types
    public void sendapprovalwithValidInputwithDifferentAirlineTypesGDS(){
        driver.element().click(add);
        driver.element().type(airlinename,"CS");
        driver.element().type(airlinecode,"85`");
        driver.element().select(Airlinetype,"GDS");
        driver.element().select(NetworkType,"International");
        driver.element().select(allianceName,"SkyTeam");
        driver.element().click(codesharing);
        driver.element().click(sendForApproval);

    }
    //Valid Input with Different Airline Types
    public void sendapprovalwithValidInputwithDifferentAirlineTypesLCC(){
        driver.element().click(add);
        driver.element().type(airlinename,"CS");
        driver.element().type(airlinecode,"85`");
        driver.element().select(Airlinetype,"LCC");
        driver.element().select(NetworkType,"International");
        driver.element().select(allianceName,"SkyTeam");
        driver.element().click(codesharing);
        driver.element().click(sendForApproval);


    }
    //Valid Input with Different Airline Types
    public void sendapprovalwithValidInputwithDifferentAirlineTypesBOTH(){
        driver.element().click(add);
        driver.element().type(airlinename,"CS");
        driver.element().type(airlinecode,"85`");
        driver.element().select(Airlinetype,"BOTH");
        driver.element().select(NetworkType,"International");
        driver.element().select(allianceName,"SkyTeam");
        driver.element().click(codesharing);
        driver.element().click(sendForApproval);

    }
    public void sendapprovalwithVerifyAirlinenameandcodeinputwithnumbersandSpecialcharactersisrejected(){

        driver.element().click(add);
        driver.element().type(airlinename,"132458");
        driver.element().type(airlinecode,"@#-`");
        driver.element().select(Airlinetype,"GDS");
        driver.element().select(NetworkType,"International");
        driver.element().select(allianceName,"SkyTeam");
        driver.element().click(codesharing);
        driver.element().click(sendForApproval);
    }





}






