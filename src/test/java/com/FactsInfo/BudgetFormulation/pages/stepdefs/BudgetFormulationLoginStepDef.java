package com.FactsInfo.BudgetFormulation.pages.stepdefs;



import com.FactsInfo.BudgetFormulation.pages.MinSteps.DashboardPageMinSteps;
import com.FactsInfo.BudgetFormulationPage.LogingPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class BudgetFormulationLoginStepDef{
	
	LogingPage login;
//	DashboardPageMinSteps commonSteps1;
	
	@Steps
	com.FactsInfo.BudgetFormulation.pages.MinSteps.DashboardPageMinSteps commonSteps;
	
	@Given("^that the '(.*)' has logged into the facts info application$")
	public void that_the_user_has_logged_into_the_facts_info_application(String role) throws Throwable {    
	   login.visit(); 
//	   login.workflowLogin(role);
	   login.LoginWithRole(role);

	}
	
}
