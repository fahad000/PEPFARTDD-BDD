package com.FactsInfo.BudgetFormulation.pages.stepdefs;

import com.FactsInfo.BudgetFormulationPage.BudgetHomePage;

import cucumber.api.java.en.Then;

public class BudgetFormulationHomeStepDef {
	
	BudgetHomePage home;
      
	@Then("^the Budget Formulation home page should display$")
	public void the_Budget_Formulation_home_page_should_display() throws Throwable {    
		home.budgetDashbuardTitleVisivle();

	}
	
	
	
	
	
	
	
	
}
