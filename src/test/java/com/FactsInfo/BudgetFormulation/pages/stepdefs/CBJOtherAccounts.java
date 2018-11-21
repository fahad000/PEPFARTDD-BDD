package com.FactsInfo.BudgetFormulation.pages.stepdefs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import com.FactsInfo.BudgetFormulationPage.CBJOtherAccountsPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CBJOtherAccounts {
	
	CBJOtherAccountsPage cbj;
	
	@When("^I select '(.*)' from Budget Area$")
	public void i_select_Congressional_Budget_Justification_from_Budget_Area(String module) throws Throwable {
	  cbj.selectBudgetArea(module);
	}
	@Then("^the following top level dropdown menu should not display:$")
	public void the_following_top_level_dropdown_menu_should_not_display(List<String> menu) throws Throwable {
		for (String menuName : menu) {
		assertFalse("the following options should be avaiable: "+menuName,cbj.toplevelOUoptionIsNotVisible(menuName));	
		}
	}
		
		@Then("^the following top level dropdown menu should display:$")
		public void the_following_top_level_dropdown_menu_should_display(List<String> menu) throws Throwable {
			for (String menuName : menu) {
			assertTrue("the following options should be avaiable: "+menuName,cbj.toplevelOUoptionIsNotVisible(menuName));	
			}	
	}
	@Then("^the 'Save' and '(.*)' buttons should be enabled$")
	public void the_save_and_discard_buttons_should_be_enabled(List<String> buttons) throws Throwable {
		for (String buttonName : buttons) {
			assertTrue("the following options should not be avaiable: "+buttonName,cbj.allButtonsPresent(buttonName));
	}
	}
	@When("^select the '(.*)' from the Bureau dropdown list$")
	public void select_the_USAID_Management_from_Bureau_dropdown_list(String bureau) throws Throwable {
	  cbj.selectBureau(bureau);
}
	@Then("^the following accounts should display in account dropdown list:$")
	public void the_following_accounts_should_display_in_account_dropdown_list(List<String> account) throws Throwable {
		for (String accountName : account) {
			assertTrue("the following options should not be avaiable: "+accountName,cbj.accountPresent(accountName));
	}
		}

	@When("^selecting an '(.*)' from above list that is funded$")
	public void selecting_an_account_from_above_list_that_is_funded(String accounts) throws Throwable {
		cbj.selectAccount(accounts);
	}

	@Then("^the following OU should display in OU dropdwon list:$")
	public void the_following_OU_should_display_in_OU_dropdwon_list(List<String> ou) throws Throwable {
		for (String ouList : ou) {
			assertTrue("the following options should not be avaiable: "+ouList,cbj.ousPresent(ouList));
	}
	}
}
