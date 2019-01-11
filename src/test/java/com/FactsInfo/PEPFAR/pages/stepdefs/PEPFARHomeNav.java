package com.FactsInfo.PEPFAR.pages.stepdefs;

import static org.junit.Assert.assertTrue;

import java.util.List;

import com.FactsInfo.PEPFAR.pages.MinSteps.CommonSteps;
import com.FactsInfo.PEPFARPage.PEPFARHomeNavigation;

import cucumber.api.java.en.Then;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class PEPFARHomeNav extends PageObject{
	
	PEPFARHomeNavigation home;
	
	@Steps
	CommonSteps common;
	
	
	@Then("^the home navigation page should dispaly$")
	public void the_home_navigation_page_should_dispaly() throws Throwable {
		home.pageTtileIsPresent();
	}
		@Then("^I view my '(.*)' tab then 'Mecanisms Search' tab$")
		public void i_view_my_Mechanisms_tab_then_Mecanisms_Search_tab(String tab) throws Throwable {
			home.clickTab(tab);
	}
	
	@Then("^the following tabs should displayed:$")
	public void the_following_tabs_should_displayed(List<String> tab) throws Throwable {
		for (String tabName : tab) {
			assertTrue("the following tabs should not displayed: " + tabName, home.tabNameIsVisible(tabName));
		}
	}
	}


