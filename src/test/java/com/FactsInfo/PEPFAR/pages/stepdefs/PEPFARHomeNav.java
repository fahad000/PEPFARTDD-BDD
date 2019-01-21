package com.FactsInfo.PEPFAR.pages.stepdefs;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.FactsInfo.PEPFAR.pages.MinSteps.CommonSteps;
import com.FactsInfo.PEPFARPage.PEPFARHomeNavigation;
import com.ibm.icu.impl.LocaleDisplayNamesImpl.DataTable;

import cucumber.api.java.en.Then;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class PEPFARHomeNav extends PageObject{
	
	PEPFARHomeNavigation home;
	
	@Steps
	CommonSteps common;
	
	
	@Then("^the home navigation page should dispaly$")
	public void the_home_navigation_page_should_dispaly() throws Throwable {
		new WebDriverWait(getDriver(), 3)
		.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[data-ng-show='vm.isBusy']")));
		home.pageTtileIsPresent();
	}
	
//	@Then("^click on Mechanisms sub tab$")
//	public void click_on_Mechanisms_sub_tab() throws Throwable {
//		getDriver().findElement(By.xpath("//a[.='Mechanisms']")).click();
//		
//	    
//	}
//
//	@Then("^system navigates to Mechanism home page and the following sub tabs are displayed$")
//	public void system_navigates_to_Mechanism_home_page_and_the_following_sub_tabs_are_displayed(List<String> tabs) throws Throwable {
//		for (@SuppressWarnings("unused") String tabNames : tabs )
//			assertTrue("the following tabs should be available: ", tabs );
//	
//	}
//
//	public boolean assertTrue(String tabs, List<String> tabName) {
//		// TODO Auto-generated method stub
//		By MechanismDashboard = By.xpath("//a[.='Mechanism Dashboard']");
//		String MechanismSearch="//a[.='Mechanism Search']";
//		if (element(MechanismDashboard).isPresent() &&
//				element( MechanismSearch).isPresent()
//				
//					) {
//				return true;
//				} else {
//					return false;
//		
//				}
//	}
//
////	private  boolean Mechanismstabs(String tabs) {
////		By MechanismDashboard = By.xpath("//a[.='Mechanism Dashboard']");
////		String MechanismSearch="//a[.='Mechanism Search']";
////		if (element(MechanismDashboard).isPresent() &&
////				element( MechanismSearch).isPresent()
////				
////					) {
////				return true;
////				} else {
////					return false;
////		
////				}
////		
////	}
//
//	@Then("^click on Mechanism Search tab$")
//	public void click_on_Mechanism_Search_tab() throws Throwable {
//		getDriver().findElement(By.xpath("//a[.='Mechanism Search']")).click();
//		
//		//home.clickTab(tab);
//	}
//
//
////		@Then("^I view my '(.*)' tab then 'Mecanisms Search' tab$")
////		public void i_view_my_Mechanisms_tab_then_Mecanisms_Search_tab(String tab) throws Throwable {
////			home.clickTab(tab);
////	}
//	
//	@Then("^the following tabs should displayed:$")
//	public void the_following_tabs_should_displayed(List<String> tab) throws Throwable {
//		for (String tabName : tab) {
//			Assert.assertTrue("the following tabs should not displayed: " + tabName, home.tabNameIsVisible(tabName));
//		}
//	}
	}


