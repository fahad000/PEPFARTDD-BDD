package com.FactsInfo.BudgetFormulation.pages.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserRoleStepDef {
	
	@Given("^my role is \"([^\"]*)\"$")
	public void my_role_is(String arg1) throws Throwable {
	    
	}


	@Given("^my primary OU is \"([^\"]*)\" and my Bureau is \"([^\"]*)\"$")
	public void my_primary_OU_is_and_my_Bureau_is(String arg1, String arg2) throws Throwable {
	   
	}

	@Given("^I have edit access to CBJ module$")
	public void i_have_edit_access_to_CBJ_module() throws Throwable {
	    
	}

	@Then("^my primary OU should be \"([^\"]*)\" and my Bureau should be \"([^\"]*)\"$")
	public void my_primary_OU_should_be_and_my_Bureau_should_be(String arg1, String arg2) throws Throwable {
	    
	}

	@When("^I select Budget area as \"([^\"]*)\"$")
	public void i_select_Budget_area_as(String arg1) throws Throwable {
	    
	}

	@When("^I view my Budget tab$")
	public void i_view_my_Budget_tab() throws Throwable {
	   
	}

//	@When("^Select (.*) from account dropdown list$")
//	public void select_a_value_from_account_dropdown_list(String accountType) throws Throwable {
//	   
//	}
//
//	@When("^I click on the other tab$")
//	public void i_click_on_the_other_tab() throws Throwable {
//	    
//	}
//
//	@Then("^I should be able to enter values in the budget grid and save$")
//	public void i_should_be_able_to_enter_values_in_the_budget_grid_and_save() throws Throwable {
//	   
//	}



}
