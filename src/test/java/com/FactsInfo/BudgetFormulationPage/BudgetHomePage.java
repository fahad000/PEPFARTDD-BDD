package com.FactsInfo.BudgetFormulationPage;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class BudgetHomePage extends PageObject {

	 By budgetDashboardtitle = By.xpath(".//*[@id='pageTitleArea']");
	 By budgetAreaOptionClick =By.xpath( ".//select[@data-ng-change='vm.changeBudgetArea()']");
	 static String budgetAreaOption= ".//select[@data-ng-change='vm.changeBudgetArea()']//option[text()='%s']";
	 static String tabXpath=".//a[@data-ng-click='vm.changeView(tab)'][text()='%s']";
	 By clicktabXpath=By.xpath(".//a[@data-ng-click='vm.changeView(tab)'][text()='%s']");
	 By ClickOUXpath= By.xpath(".//select[@data-ng-change='vm.changeOperatingUnit()']");
	 static String OUListXpath=".//select[@data-ng-change='vm.changeOperatingUnit()']//option[text()='%s']";
	 By clickBereauXpath=By.xpath(".//select[@data-ng-change='vm.changeBureau()']");
	 static String bereauListXpath=".//select[@data-ng-change='vm.changeBureau()']//option[text()='%s']";
	 By ClickFYXpath= By.xpath(".//select[@data-ng-change='vm.changeFiscalYear()']");
	 By BudgetTabxpath= By.xpath("");
	 By OTRTabxpath= By.xpath("");
	 By AttributionsTabxpath= By.xpath("");
	 By NarrativeTabxpath= By.xpath("");
	 By MOTabxpath= By.xpath("");
	 By MOVTabxpath= By.xpath("");
	 By ExportButtonxpath= By.xpath("");
	 By SaveButtonxpath= By.xpath("");
	 By DiscardButtonxpath= By.xpath("");
	 By clickAccountxpath=By.xpath(".//select[@data-ng-change='vm.tlbr.changeAccount()']");
	 static String AccountDropdownListxpath= ".//select[@data-ng-change='vm.tlbr.changeAccount()']//option[text='%s']";
	 
	
	public void clickBudgetArea() {
		waitFor(ExpectedConditions.presenceOfElementLocated(budgetAreaOptionClick));
		element(budgetAreaOptionClick).click();
		
		
	}
	
    public void selectBudgetAreaOption(String budgetOption) {
    	waitFor(ExpectedConditions.presenceOfElementLocated(budgetAreaOptionClick));
		element(budgetAreaOptionClick).click();

    }
    	  public boolean budgetModuleVisible(String moduleType) {	
    			    waitFor(ExpectedConditions.presenceOfElementLocated(budgetAreaOptionClick));
   	    		    element(budgetAreaOptionClick).waitUntilEnabled().click();
    	    		 String element =String.format(budgetAreaOption,moduleType);
    	        	return element(By.xpath(element)).isPresent();
    	    	 
	}
	 
	public boolean budgetDashbuardTitleVisivle() {
		waitFor(ExpectedConditions.presenceOfElementLocated(budgetDashboardtitle));			
		if (element(budgetDashboardtitle).isPresent() 

				) {
			return true;
			} else {
				return false;
			}
    }

	 public boolean beareauListIsExist(String bereauName) {	
	    waitFor(ExpectedConditions.presenceOfElementLocated(clickBereauXpath));
 		element(clickBereauXpath).waitUntilEnabled().click();
 		 String element =String.format(bereauListXpath,bereauName);
     	return element(By.xpath(element)).waitUntilPresent().isPresent();
 	 
}

	 public boolean OUListIsExist(String oUName) {	
		    waitFor(ExpectedConditions.presenceOfElementLocated(ClickOUXpath));
	 		element(ClickOUXpath).waitUntilEnabled().click();
	 		String OUName= oUName.toLowerCase().replace(" ", ",");
//	 		By element= By.xpath(String.format(OUListXpath, oUName));
	 		 String element =String.format(OUListXpath,oUName);
	     	return element(By.xpath(element)).waitUntilPresent().isPresent();	
	     	
	
	 	 
	}
	 
	 public boolean tabIsVisible(String tabName) {	
		    waitFor(ExpectedConditions.invisibilityOfElementLocated(clicktabXpath));
//	 		element(clicktabXpath).waitUntilEnabled().click();
	 		 String element =String.format(tabXpath,tabName);
	     	return element(By.xpath(element)).waitUntilPresent().isVisible();
	 	 
	}
		
}		
	
 

	
	





