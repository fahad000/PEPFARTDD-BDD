package com.FactsInfo.PEPFAR.pages.stepdefs;

import static org.junit.Assert.assertTrue;

import java.util.List;

import com.FactsInfo.PEPFARPage.MechanismsPOM;

import cucumber.api.java.en.Then;

public class MechanismsPage {
	
	MechanismsPOM Mechanism;
	
	
	@Then("^click on Mechanisms sub tab$")
	public void click_on_Mechanisms_sub_tab() throws Throwable {
		//getDriver().findElement(By.xpath("//a[.='Mechanisms']")).click();
		Mechanism.clickMechanismsSubTab();
		
	    
	}
	@Then("^system navigates to Mechanism home page and the following sub tabs are displayed$")
	public void system_navigates_to_Mechanism_home_page_and_the_following_sub_tabs_are_displayed(List<String> MecTab) throws Throwable {
		for (String MechanismTabs : MecTab ) {
	    	assertTrue("the following Mechanisms sub tabs should be available: " + MechanismTabs,Mechanism.verifyMechanismsTab(MechanismTabs));
			}
	}


}
