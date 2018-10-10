package com.FactsInfo.BudgetFormulationPage;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;



public class BudgetHomePage extends PageObject {

	 By budgetDashboardtitle = By.xpath(".//*[@id='pageTitleArea']");
	 
	 
	 
	public boolean budgetDashbuardTitleVisivle() {
		waitFor(ExpectedConditions.presenceOfElementLocated(budgetDashboardtitle));			
		if (element(budgetDashboardtitle).isPresent() 

				) {
			return true;
			} else {
				return false;
			}
    }
		
}




