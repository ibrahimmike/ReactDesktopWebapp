package cityfalcon.pages.sideBarList;

import cityfalcon.pages.BasePage;
import cityfalcon.pages.segments.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterpriseAudiences extends BasePage {
    public EnterpriseAudiences(WebDriver driver) {
        super(driver);
    }

    private final WebElement brokers = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/segments/brokers']"));
    private final WebElement academia = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/segments/academia']"));
    private final WebElement wealthManagers = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/segments/wealth-managers-advisors']"));

    private final WebElement p2pCrowdFunding = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/segments/private-equity']"));
    private final WebElement institutionalInvestors = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/segments/institutional']"));

    private final WebElement consultancyAndLegalAccounting = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/segments/consultancy-legal-accounting']"));
    private final WebElement centralBanksRegulatory = driver.findElement(By.xpath("//section[6]//ul/li//a[@href='/segments/central-banks-regulatory']"));


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
