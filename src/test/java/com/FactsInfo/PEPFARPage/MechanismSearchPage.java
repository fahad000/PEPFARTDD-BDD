package com.FactsInfo.PEPFARPage;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class MechanismSearchPage extends PageObject{
	
	
	
	By mechanismIdXpath=By.xpath(".//input[@id='mechanismID']");
	String searchFieldXpath=".//input[@id='%s']";
	By mechanismNameXpath=By.xpath(".//input[@id='mechanismName']");
	By awardNumXpath=By.xpath(".//input[@id='awardNumber']");
	By dunsNumXpath=By.xpath(".//input[@id='duns']");
	By fundingAgenXpath=By.xpath(".//*[@id='fundingAgency']");
	String verifyFundAgecyList=".//span[@class='mat-option-text'][text()=' %s ']";
	By primePartXpath=By.xpath(".//input[@id='partnerName']");
	By ouXpath=By.xpath(".//*[@id='operatingUnit']");
	String ouList=".//span[@class='mat-option-text'][text()='%s']";
	By filterXpath=By.xpath(".//input[@id='awardNumber']");
	By clearSearchIconXpath=By.xpath(".//*[@role='img'][text()='clear']']");
	By SearchIconXpath=By.xpath(".//*[@role='img'][text()='search']");
	String verifySearchResults=".//div[@class='mat-paginator-range-label'][text()='%s']";
	By creatMechanismIconXpath=By.xpath(".//*[@role='img'][text()='file_copy']");
	By searchResultMechIDXpath=By.xpath(".//button[@class='mechanism-button mat-raised-button']//span[text()='17919']");
	
	
	public boolean searchTermFieldsExist() {
		if (element(mechanismIdXpath).isPresent() &&
				element(mechanismNameXpath).isPresent() &&
				element(awardNumXpath).isPresent() &&
				element(dunsNumXpath).isPresent() &&
				element(fundingAgenXpath).isPresent() &&
				element(primePartXpath).isPresent() &&
				element(ouXpath).isPresent() &&
				element(filterXpath).isPresent() &&
				element(clearSearchIconXpath).isPresent() &&
				element(SearchIconXpath).isPresent() &&
				element(creatMechanismIconXpath).isPresent() &&
				element(searchResultMechIDXpath).isPresent()
					) {
				return true;
				} else {
					return false;
				}
	}
	
	public void enterSearterms(String trems) {
		String termsName = String.format(searchFieldXpath);
		typeInto(element(searchFieldXpath), termsName);
				
	}
	public boolean verifySearchresultsIsdisplayed(String results) {
		String element= String.format(verifySearchResults, results);
		return element(By.xpath(element)).isDisplayed();	
		 
		
//		String element =String.format(reportStatusXpath, status);
//    	return element(By.xpath(element)).isDisplayed();
		
	}
	

	public void enterMechanismID(String terms) {
		typeInto(element(mechanismIdXpath), terms);
//		typeInto(element(deviceSerialField), deviceSerial);
	}

	public void enterMechanismName(String mechanismName) {
		typeInto(element(mechanismNameXpath), mechanismName);
	}

	public void enterAwardNum(String awardNum) {
		typeInto(element(awardNumXpath), awardNum);
	}
	public void enterDunsNum(String dunsNum) {
		typeInto(element(dunsNumXpath), dunsNum);
	}
	public boolean selectFundingAgency(String funAgency) {
		String element= String.format(verifyFundAgecyList, funAgency);
		return element(By.xpath(element)).isDisplayed();
		
		
	}
	public void typeAheadFundingAgecyDPList(String funAgency) {
		typeInto(element(fundingAgenXpath),funAgency);
	}
	
	public void selectOU(String ou) {
		element(ouList).click();
	}
	
	public void clickOUDropDownField() {
		element(ouXpath).click();
	}
		
		public boolean ouListIsdisplayed(String ous) {
			String element= String.format(ouList, ous);
			return element(By.xpath(element)).isDisplayed();
		
	}
	public void clearSearch() {
		element(clearSearchIconXpath).click();	
	}
	public void clickSearchIcon() {
		element(SearchIconXpath).click();
	}
	public void clickCreateMechanism() {
		element(creatMechanismIconXpath).click();	
	}
	public void clickMechanismId(String selectMecahnusmId) {
		element(creatMechanismIconXpath).click();	
	}
}
