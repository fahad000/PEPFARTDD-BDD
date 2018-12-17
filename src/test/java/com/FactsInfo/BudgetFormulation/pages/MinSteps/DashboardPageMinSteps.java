package com.FactsInfo.BudgetFormulation.pages.MinSteps;

import com.FactsInfo.BudgetFormulationPage.BudgetHomePage;
import com.FactsInfo.BudgetFormulationPage.LogingPage;
import com.FactsInfo.BudgetFormulationPage.dashboardPage;

import net.thucydides.core.annotations.Step;

public class DashboardPageMinSteps {
	LogingPage login;
	dashboardPage dashboard;
	BudgetHomePage home;
	
	@Step
	public void CheckTerms() {
		login.acknowladgeCheckTerms();
	}
	@Step
	public void closeNotification() {
		login.notificationClose();		
	}

	@Step
	public void clickBudgetAreaDropdown() {
		home.clickBudgetArea();
	}
//	@Step
//	public void clickBudgetAreaDropdown() {
//		home.clickBudgetArea();
//	}
	@Step
	public void clickMulationTile(String tileName) {
		dashboard.viewModulesTile(tileName);
	}
}
