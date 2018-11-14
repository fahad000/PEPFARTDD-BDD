package com.FactsInfo.BudgetFormulationPage;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.DriverFactory;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MRRBudgetPage extends PageObject{
	private static final String WebUiCommonHelper = null;
	By ExportButtonxpath= By.xpath("");
	 By SaveButtonxpath= By.xpath("");
	 By DiscardButtonxpath= By.xpath("");
	 By clickAccountxpath=By.xpath(".//select[@class='form-control input-sm ng-pristine ng-valid'][@data-ng-change='tlbr.changeAccount()']");
	 static String AccountDropdownListxpath= ".//select[@data-ng-change='tlbr.changeAccount()']//option[text()='%s']";
	 static String tabXpath=".//a[@data-ng-click='vm.changeView(tab)'][text()='%s']";
	 By clicktabXpath=By.xpath(".//a[@data-ng-click='vm.changeView(tab)'][text()='%s']");
	 By ClicktabXpath=By.xpath(".//a[@data-ng-click='vm.changeView(tab)'][text()='Home']");
	 By switchWindow= By.xpath(".//div[@data-ng-switch-when='%s']");
	 static String ClickOtherTabXpath=".//button[@data-ng-click='vm.setActiveTab(tab)'][@title='Other']";
	 By BudgetGridFlields=By.xpath(".//*[@id='divrdresourcerequestc8061b02-46bb-467b-88ab-71be8e0b9cf3']");
	 static String typeInGrid=".//*[@id='divrdresourcerequestc8061b02-46bb-467b-88ab-71be8e0b9cf3'][@class='ui-grid-cell-contents ng-scope ng-binding ui-grid-cell-focus']";
	 
	 
	    public void clicktab(String tab) {	 
		 waitFor(ExpectedConditions.invisibilityOfElementLocated(clicktabXpath));
	 	 String element =String.format(tabXpath,tab);
	     element(By.xpath(element)).waitUntilEnabled().click();
	     
	    }
	public void clickAccountListDropdown(String accountType) {
		new WebDriverWait(getDriver(), 4)
		.until(ExpectedConditions.invisibilityOfElementLocated(clickAccountxpath));
		WebElement iframe = getDriver().findElement(By.xpath("//iframe"));
		getDriver().switchTo().frame(iframe);
			waitFor(ExpectedConditions.presenceOfElementLocated(clickAccountxpath));
			element(clickAccountxpath).click();
		
	 } 
	 	
	     public boolean accountTypeListIspresent(String accountName) throws InterruptedException { 
	    	   Thread.sleep(1000);
	    	   this.getDriver().switchTo().defaultContent();
	    	   Thread.sleep(1000);
	    	   element(clickAccountxpath).waitUntilEnabled().click();
//	    	   String account = accountName.replace(" ", "*");
//	    	   String account = accountName.toLowerCase().replace(" ", "-");
	  		   String element =String.format(AccountDropdownListxpath,accountName);
	      	   return element(By.xpath(element)).waitUntilPresent().isPresent();
	      	
	     }
	     public void clickOtherTab(String other) throws InterruptedException {	 
//			 waitFor(ExpectedConditions.visibilityOfElementLocated(ClickOtherTabXpath));
	    	 
		 	 String element =String.format(ClickOtherTabXpath,other);
		 	 Thread.sleep(2500);
		     element(By.xpath(element)).waitUntilEnabled().click();
		     Thread.sleep(2500);
		    }
	     public void selectaccountType(String accountType) throws InterruptedException {
	    	 Thread.sleep(1000);
	    	   this.getDriver().switchTo().defaultContent();
	    	   Thread.sleep(1000);
	    	   element(clickAccountxpath).waitUntilEnabled().click();
	    	  String element=String.format(AccountDropdownListxpath, accountType);
	    	  element(By.xpath(element)).waitUntilEnabled().click();
	    	 
	     }


		public void enterBudgetamount(String value) throws InterruptedException {
			Iterable<net.serenitybdd.core.pages.WebElementFacade> budgetGrid = findAll(BudgetGridFlields);
			for (net.serenitybdd.core.pages.WebElementFacade current: budgetGrid) {
				element(current).click();
//			    Thread.sleep(1500);
//				element(BudgetGridFlields).click();
//    			element(BudgetGridFlields).clear();
//			    Thread.sleep(1500);	
//			    typeInto(element(BudgetGridFlields),value);
////				Thread.sleep(1500);
//				typeInto(current, value);	 
////		        find(By.xpath(typeInGrid)).clear();
//			    Thread.sleep(1500);
				find(By.xpath(typeInGrid)).waitUntilEnabled().sendKeys(value);
//				Thread.sleep(1500);
			}

				
}
	
		
}
	 
	 
	 
	 

