package com.FactsInfo.PEPFAR.pages.stepdefs;

import static org.junit.Assert.assertTrue;

import java.util.List;

import com.FactsInfo.PEPFARPage.ManagementOperationsPOM;
import com.ibm.icu.impl.LocaleDisplayNamesImpl.DataTable;

import cucumber.api.java.en.Then;



public class ManagementOperationsDef {
	
	ManagementOperationsPOM MO;
	@Then("^click on Management & Operations sub tab$")
	public void click_on_Management_Operations_sub_tab() throws Throwable {
	   MO.clickManagementOperations();
	}

	@Then("^system navigates to Management & Operations home page and the following sub tabs are displayed$")
	public void system_navigates_to_Management_Operations_home_page_and_the_following_sub_tabs_are_displayed(List<String> ManagementOP) throws Throwable {
		for (String ManagementOPerationTabs : ManagementOP  ) {
	    	assertTrue("the following Management and Operations sub tabs should be available: " +ManagementOPerationTabs,MO.verifyManagementOPerationASubTabs(ManagementOPerationTabs));
			}
	}
}
