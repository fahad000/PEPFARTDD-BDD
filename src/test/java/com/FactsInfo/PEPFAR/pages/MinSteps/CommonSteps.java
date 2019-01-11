package com.FactsInfo.PEPFAR.pages.MinSteps;

import com.FactsInfo.PEPFARPage.LogingPage;

import net.thucydides.core.annotations.Step;

public class CommonSteps {
	
	LogingPage login;
	
	@Step
	public void i_acknowladge_terms() throws InterruptedException {
		login.acknowladgeCheckTerms();
	}
	
	

}
