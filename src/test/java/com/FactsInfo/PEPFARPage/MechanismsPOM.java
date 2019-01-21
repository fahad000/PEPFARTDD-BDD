package com.FactsInfo.PEPFARPage;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class MechanismsPOM extends PageObject{
	By MechanismDashboard = By.xpath("//a[.='Mechanism Dashboard']");
	String MechanismSearch="//a[.='Mechanism Search']";
	By mechanismsSubTab=By.xpath("//a[.='Mechanisms']");
	String mechanismstablist="//a[.='Mechanism Dashboard']";
	
	
	
	public boolean MechanismstabsExist() {
		if (element(MechanismDashboard).isPresent() &&
				element(MechanismSearch).isPresent() )
				return true;
//				} else {
//					return false;
//				}
		return false;
	}
	

	public void clickMechanismsSubTab() {
		element(mechanismsSubTab).click();
	}
	
	public boolean verifyMechanismsTab(String MecTab) {
		String element= String.format(mechanismstablist, MecTab);
		return element(By.xpath(element)).isDisplayed();}


}
