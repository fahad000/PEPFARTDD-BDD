package com.FactsInfo.PEPFAR.pages.stepdefs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import com.FactsInfo.PEPFARPage.MechanismSearchPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PEPFARMechanismSearchStepDef {
	
	MechanismSearchPage mechanisms;
	
	@Then("^the following fields should be enabled$")
	public void the_following_fields_should_be_enabled() throws Throwable {
			assertFalse("the following fields should not be enabled: ", mechanisms.searchTermFieldsExist());
		
	}
	
	@When("^I click on the search icon$")
	public void i_click_on_the_search_icon() throws Throwable {
	   mechanisms.clickSearchIcon();
	}

	@Then("^the resutls '(.*)' display in the resutls grid$")
	public void the_resutls_5_of_470_display_in_the_resutls_grid(String results) throws Throwable {
		mechanisms.verifySearchresultsIsdisplayed(results);
//		for (String searchResults : results {
		
//		report.examinerNameIsvisible(ExaminerName); 
//    	assertTrue("the examiner name should not be: " + ExaminerName,report.examinerNameIsvisible(ExaminerName));
    
		assertTrue("the following fields should not be enabled: ", mechanisms.verifySearchresultsIsdisplayed(results));
		
	   
	}

	@When("^I search with the Mechanisms ID '(.*)'$")
	public void i_search_with_the_Mechanisms_ID(String terms ) throws Throwable {
		mechanisms.enterMechanismID(terms);
		mechanisms.clickSearchIcon();
		
	   
	}

	@Then("^only one results should display$")
	public void only_one_results_should_display() throws Throwable {
	   
	}

	@When("^I view the OU drop down field$")
	public void i_view_the_OU_drop_down_field() throws Throwable {
	   mechanisms.clickOUDropDownField();
	}

	@Then("^the following OUs should be available:$")
	public void the_following_OUs_should_be_available(List<String> ous) throws Throwable {		
		for (String ouName : ous ) {
    	assertTrue("the following OUs should not be available: " + ouName,mechanisms.ouListIsdisplayed(ouName));
		}
	}

	@When("^I type ahead '(.*)' in to Funding Agency field$")
	public void i_type_ahead_C_in_to_Funding_Agency_field(String agency) throws Throwable {
	    mechanisms.typeAheadFundingAgecyDPList(agency);
	}

	@Then("^the following agency should be available:$")
	public void the_following_agency_should_be_available(List<String> agency) throws Throwable {
		for (String agencyName : agency ) {
	    	assertTrue("the following OUs should not be available: " + agencyName,mechanisms.selectFundingAgency(agencyName));
			}
	}
	}


