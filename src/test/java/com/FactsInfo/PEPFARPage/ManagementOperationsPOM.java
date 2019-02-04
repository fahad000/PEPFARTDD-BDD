package com.FactsInfo.PEPFARPage;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class ManagementOperationsPOM extends PageObject{
	By ManagementOperationsTab = By.xpath("//a[.='Management & Operations']");
	String StaffingSearch="//a[.='Staffing Search']";
	By AgencyCostOfDoingBusiness=By.xpath("//a[.='Agency Cost Of Doing Business']");
	

public boolean ManagementOperationsExist() {
	if (element(	StaffingSearch).isPresent() &&
			element(AgencyCostOfDoingBusiness).isPresent() )
			return true;
//			} else {
//				return false;
//			}
	return false;
}


public void clickManagementOperations() {
	element(ManagementOperationsTab).click();
}


public boolean verifyManagementOPerationASubTabs(String ManagementOP) {
	String element= String.format(StaffingSearch, ManagementOP);
	return element(By.xpath(element)).isDisplayed();}


}


