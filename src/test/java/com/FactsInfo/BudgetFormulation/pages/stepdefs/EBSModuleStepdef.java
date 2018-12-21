package com.FactsInfo.BudgetFormulation.pages.stepdefs;

import com.FactsInfo.BudgetFormulationPage.EBSModulePage;

import cucumber.api.java.en.When;

public class EBSModuleStepdef {
	
	EBSModulePage ebs;
	
	

	@When("^I enter my EBS narrative and save$")
	public void i_enter_my_EBS_narrative_and_save() throws Throwable {
		ebs.enterNarrative();
		ebs.clickSaveButton();
		
}
	
}
