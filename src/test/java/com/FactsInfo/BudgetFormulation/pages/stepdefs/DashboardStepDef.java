package com.FactsInfo.BudgetFormulation.pages.stepdefs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.FactsInfo.BudgetFormulationPage.dashboardPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class DashboardStepDef {
	
	dashboardPage dashboard;
	
	@Steps
	com.FactsInfo.BudgetFormulation.pages.MinSteps.DashboardPageMinSteps commonSteps;
	
	@Then("^the facts info dashboard should display$")
	public void the_facts_info_dashboard_should_display() throws Throwable {
		assertTrue("The dashboard title not all displayed",dashboard.dashboardTitleVisible());   
	}
	
	@Given("^the following tile should be visible:$")
	public void the_following_tile_should_be_visible(List<String> tile) throws Throwable {
		for (String moduleTile : tile) {
			assertTrue("the following tile should not be visible: " + moduleTile,dashboard.tileIsVisible(moduleTile));
		}
	}
	@Given("^the following tile should not be visible:$")
	public void the_following_tile_should_be_not_visible(List<String> tile) throws Throwable {
		for (String moduleTile : tile) {
			assertFalse("he following tile should be visible: " + moduleTile,dashboard.tileIsVisible(moduleTile));
		}
	}
		

	@When("^I view my (.*) tile$")
	public void i_view_my_Budget_Formulation_tile(String tileName) throws Throwable {
		dashboard.viewModulesTile(tileName);
	   
	}

}
	    
	
