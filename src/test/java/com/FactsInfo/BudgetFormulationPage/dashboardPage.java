package com.FactsInfo.BudgetFormulationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import java.util.List;
import net.serenitybdd.core.pages.PageObject;


public class dashboardPage extends PageObject {
	
	    By dashboardTitle = By.xpath("//a[@class='navbar-brand']/img[@src='/images/FACTSIntoLogoV2.png']");
	   static String viewModulesTile = "(.//small[@class='ng-binding'] [text() = '%s'])";
	   By clickbudgetFormulationTile= By.xpath(".//small[text()='Budget Formulation']");
	   
	   
	   
	   
	   public boolean dashboardTitleVisible() {
			waitFor(ExpectedConditions.presenceOfElementLocated(dashboardTitle));			
			if (element(dashboardTitle).isPresent() 

					) {
				return true;
				} else {
					return false;
				}
	    }

	    
		public boolean tileIsVisible(String moduleTile) {
			String element =String.format(viewModulesTile, moduleTile);
//			waitFor(ExpectedConditions.presenceOfElementLocated(viewModulesTile));
	    	return element((element)).isVisible();
		}
		

		
	public void viewModulesTile(String tileName) {
		String element =String.format(viewModulesTile, tileName);
//		waitFor(ExpectedConditions.presenceOfElementLocated(viewModulesTile));
    	 element((element)).click();
		
	}

	
}
