package cityfalcon.pages.sideBarList;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.segments.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterpriseAudiences extends BasePage {

    @FindBy(xpath = "//section[6]//ul/li//a[@href='/segments/brokers']")
    private WebElement brokers;
    @FindBy(xpath = "//section[6]//ul/li//a[@href='/segments/academia']")
    private WebElement academia;
    @FindBy(xpath = "//section[6]//ul/li//a[@href='/segments/wealth-managers-advisors']")
    private WebElement wealthManagers;
    @FindBy(xpath = "//section[6]//ul/li//a[@href='/segments/private-equity']")
    private WebElement p2pCrowdFunding;
    @FindBy(xpath = "//section[6]//ul/li//a[@href='/segments/institutional']")
    private WebElement institutionalInvestors;
    @FindBy(xpath = "//section[6]//ul/li//a[@href='/segments/consultancy-legal-accounting']")
    private WebElement consultancyAndLegalAccounting;
    @FindBy(xpath = "//section[6]//ul/li//a[@href='/segments/central-banks-regulatory']")
    private WebElement centralBanksRegulatory;

    public EnterpriseAudiences(WebDriver driver) {
        super(driver);
    }


    public SegmentsBrokersPage clickOnBrokersBtn(){
        clickOnWebElement(brokers);
        return new SegmentsBrokersPage(driver);
    }
    public SegmentsAcademia clickOnStudentsAndProfessors(){
        clickOnWebElement(academia);
        return new SegmentsAcademia(driver);
    }
    public SegmentsWealthManagement clickOnWealthManagementBtn(){
        clickOnWebElement(wealthManagers);
        return new SegmentsWealthManagement(driver);
    }
    public SegmentsPrivateEquity clickOnPrivateEquity(){
        clickOnWebElement(p2pCrowdFunding);
        return new SegmentsPrivateEquity(driver);
    }
    public SegmentsInstitutionalInvestors clickOnInstitutionalInvestors(){
        clickOnWebElement(institutionalInvestors);
        return new SegmentsInstitutionalInvestors(driver);
    }
    public SegmentsConsultencyAndLegalAccounting clickOnConsultancyAndLegalAccounting(){
        clickOnWebElement(consultancyAndLegalAccounting);
        return new SegmentsConsultencyAndLegalAccounting(driver);
    }
    public SegmentsCentralBanksPage clickOnCentralBanksRegulatory(){
        clickOnWebElement(centralBanksRegulatory);
        return new SegmentsCentralBanksPage(driver);
    }

}
