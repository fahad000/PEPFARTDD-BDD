package com.FactsInfo.BudgetFormulation.pages.stepdefs;

import static org.junit.Assert.assertTrue;

import java.util.List;

import com.FactsInfo.BudgetFormulationPage.BudgetHomePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BudgetFormulationHomeStepDef {
	
	BudgetHomePage home;
      
	@Then("^the Budget Formulation home page should display$")
	public void the_Budget_Formulation_home_page_should_display() throws Throwable {    
		home.budgetDashbuardTitleVisivle();

	}
	
	
	@When("^I view Budget Area drop down menu$")
	public void i_view_Budget_Area_drop_down_menu() throws Throwable {
		home.clickBudgetArea();
	    
	}

	@Then("^the following options should be available:$")
	public void the_following_options_should_be_available(List<String> module) throws Throwable {
//		home.budgetDashbuardTitleVisivle();
//		home.clickBudgetArea();
		for (String budgetmodule : module) {
			assertTrue("the following options should not be avaiable: " + budgetmodule,home.budgetModuleVisible(budgetmodule));
		
		} 
		
	}
		@Then("^the following top level dropdown menu should display:$")
		public void the_following_top_level_dropdown_menu_should_display(List<String> menu) throws Throwable {
			
		  
		}


		@Then("^the following tabs should display:$")
		public void the_following_tabs_should_display(List<String> tab) throws Throwable {
			for (String tabName : tab) {
				assertTrue("the following options should not be avaiable: " + tabName,home.tabIsVisible(tabName));
			}
		}

		@When("^I view the Budget bureau drop down menu$")
		public void i_view_the_Budget_bureau_drop_down_menu() throws Throwable {
			
		 
		}

		@Then("^the following bureau options should be available:$")
		public void the_following_bureau_options_should_be_available(List<String> bereau) throws Throwable {
			for (String bereauName : bereau) {
				assertTrue("the following options should not be avaiable: " + bereauName,home.beareauListIsExist(bereauName));
			}
		}

		

		@When("^I view the OU drop down menu$")
		public void i_view_the_OU_drop_down_menu() throws Throwable {
		    
		}

		@Then("^the following OU options should be avaiable:$")
		public void the_following_OU_options_should_be_avaiable(List<String> oU) throws Throwable {
			for (String oUName : oU) {
				assertTrue("the following options should not be avaiable: " + oUName,home.OUListIsExist(oUName));
			}
		}
			
		}


		
	

