package com.FactsInfo.BudgetFormulation.pages.MinSteps;

import com.FactsInfo.BudgetFormulationPage.LogingPage;

import net.thucydides.core.annotations.Step;

public class DashboardPageMinSteps {
	LogingPage login;

	
	@Step
	public void CheckTerms() {
		login.acknowladgeCheckTerms();
	}
	@Step
	public void closeNotification() {
		login.notificationClose();
	}
}
