package com.FactsInfo.PEPFARPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.PageObject;

public class PEPFARHomeNavigation extends PageObject{
	
	String topLevelTabsXpath=".//span[@class='mat-h2'][text()='Mechanisms']";
	By pageTitleXpath=By.xpath(".//*[@id='titleElement']");
	By clickSearchTab=By.xpath("//a[.='Mechanism Search']");
	By clickSearchIcon=By.xpath(".//*[@role='img'][text()='search']");
	
	public void clickTab(String tab) {
		String tabName = String.format(topLevelTabsXpath);
//		try {
//			this.getDriver().manage().timeouts().wait('4');
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		element(tabName).waitUntilPresent().click();
		element(clickSearchTab).click();
//		element(clickSearchIcon).click();
	}
		
		public void clickSearch(String tab) {
//			String tabName = String.format(clickSearchTab);
			element(clickSearchTab).click();	
	}
	
	public boolean tabNameIsVisible(String tab) throws Throwable{	 
		 String tabName = String.format(topLevelTabsXpath);
		 return element(tabName).isDisplayed();
	 }
	
	public void pageTtileIsPresent() {
		waitFor(ExpectedConditions.presenceOfElementLocated(pageTitleXpath));
		this.getDriver().switchTo().defaultContent();		
		element(pageTitleXpath).isPresent();
	}
	
	

}
