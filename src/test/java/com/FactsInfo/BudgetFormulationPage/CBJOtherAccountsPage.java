package com.FactsInfo.BudgetFormulationPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.PageObject;

public class CBJOtherAccountsPage extends PageObject {
	
	
	 By budgetAreaOptionClick =By.xpath( ".//select[@data-ng-change='vm.changeBudgetArea()']");
	 static String budgetAreaOption= ".//select[@data-ng-change='vm.changeBudgetArea()']//option[text()='%s']";
	 By clickBereauXpath=By.xpath(".//select[@data-ng-change='vm.changeBureau()']");
	 static String bereauListXpath=".//select[@data-ng-change='vm.changeBureau()']//option[text()='%s']";
	 By saveButton=By.xpath(".//button[@data-ng-click='tlbr.save()']");
	 By discardButton=By.xpath(".//button[@data-ng-click='tlbr.discard()']");
	 static By oUnotvISIBLE=By.xpath(".//label[text()='Operating Unit']");
	 By clickAccount=By.xpath(".//select[@data-ng-model='vm.selectedAccount']");
	 static String verifyAccount=".//select[@data-ng-change='vm.getOperatingUnits()']//option[text()='%s']";
	 static String clickAccoontField=".//select[@data-ng-change='vm.getOperatingUnits()']";
	 static String selectAccount=".//select[@data-ng-change='vm.getOperatingUnits()']//option[text()='%s']";
	 static String verifyOU=".//select[@data-ng-change='vm.getNarrative()']//option[text()='%s']";
	 By clickOUField=By.xpath(".//select[@data-ng-change='vm.getNarrative()']");
	 By enterNarrative= By.xpath(".//*[@id='narrativeDetails']");
	 
	 

	
	 public void selectBudgetArea(String module) {	
		    waitFor(ExpectedConditions.presenceOfElementLocated(budgetAreaOptionClick));
			element(budgetAreaOptionClick).click();
 		    String element =String.format(budgetAreaOption,module);
     	    element(By.xpath(element)).click();
	 }
	 public void selectBureau(String bureau) {	
		    waitFor(ExpectedConditions.presenceOfElementLocated(clickBereauXpath));
			element(clickBereauXpath).click();
		    String element =String.format(bereauListXpath,bureau);
		    element(By.xpath(element)).click();
	 }
     	   public boolean allButtonsPresent(String buttonName) {
     			if (element(saveButton).isPresent() &&
     				element(discardButton).isPresent()
     					) {
     				return true;
     				} else {
     					return false;
     				} 
	
	 }	
	 public boolean toplevelOUoptionIsNotVisible(String menuName) {
		 if(element(oUnotvISIBLE).isVisible());
		 return false;
		} 
			
		public boolean accountPresent(String account) throws InterruptedException {
//			waitFor(ExpectedConditions.presenceOfElementLocated(clickAccount));
			   Thread.sleep(1000);
	    	   this.getDriver().switchTo().defaultContent();
	    	   Thread.sleep(1000);
	    	   element(clickAccount).click();
	    	   String element =String.format(selectAccount,account);
			   return element(By.xpath(element)).isPresent();
	  
			
		}
		public boolean ousPresent(String ou) {
//			waitFor(ExpectedConditions.presenceOfElementLocated(clickOUField));
			   element(clickOUField).click();
	    	   String element =String.format(verifyOU,ou);
			   return element(By.xpath(element)).waitUntilPresent().isPresent();
					
		} 
		public void selectAccount(String accounts) throws InterruptedException {
			   Thread.sleep(1000);
	    	   this.getDriver().switchTo().defaultContent();
	    	   Thread.sleep(1000);
	    	   element(clickAccount).click();
	    	   String element =String.format(selectAccount,accounts);
			   element(By.xpath(element)).click();
		}
	 }
