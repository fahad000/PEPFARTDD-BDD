package com.FactsInfo.PEPFAR.pages.stepdefs;




import com.FactsInfo.PEPFAR.pages.MinSteps.CommonSteps;
import com.FactsInfo.PEPFARPage.LogingPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class PEPFARLoginStepDef{
	
	LogingPage login;
	
	@Steps
	CommonSteps common;
	
	@Given("^that the '(.*)' has logged into the PEPFAR application$")
	public void that_the_user_has_logged_into_the_PEPFAR_info_application(String role) throws Throwable {    
	   login.visit(); 
//	   common.i_acknowladge_terms();
	   login.LoginWithRole(role);
	  

	}
	
}
