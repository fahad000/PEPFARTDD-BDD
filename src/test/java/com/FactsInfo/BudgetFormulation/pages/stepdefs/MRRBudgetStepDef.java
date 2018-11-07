package com.FactsInfo.BudgetFormulation.pages.stepdefs;

import static org.junit.Assert.assertTrue;

import java.util.List;

import com.FactsInfo.BudgetFormulationPage.MRRBudgetPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MRRBudgetStepDef {
	
	MRRBudgetPage budget;

	
	
	@When("^I view the (.*) tab$")
	public void i_view_the_Budget_tab(String tab) throws Throwable {
		budget.clicktab(tab);
		
		
	   
	}


	@Then("^current Mission Resource Request page display$")
	public void current_Mission_Resource_Request_page_display() throws Throwable {
		
	    
	}

	@When("^I view the account dropdown following option should exist:$")
	public void i_view_the_account_dropdown_following_option_should_exist(List<String> account) throws Throwable {
		for (String accountName : account) {
			assertTrue("the following options should not be avaiable: " + accountName,budget.accountTypeListIspresent(accountName));
		}
	}
	@When("^Select (.*) from account dropdown list$")
	public void select_a_value_from_account_dropdown_list(String accountType) throws Throwable {
	   budget.selectaccountType(accountType);
	}

@When("^I click on the (.*) tab$")
public void i_click_on_the_other_tab(String other) throws Throwable {
      budget.clickOtherTab(other);
}

@Then("^I should be able to enter (.*) in the budget grid and save$")
public void i_should_be_able_to_enter_values_in_the_budget_grid_and_save(String value) throws Throwable {
   budget.enterBudgetamount(value);
}   
	}



