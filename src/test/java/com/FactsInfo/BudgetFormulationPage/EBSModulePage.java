package com.FactsInfo.BudgetFormulationPage;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class EBSModulePage extends PageObject{
	
	      By enterEBSnarrative= By.xpath(".//body[@name='EBS-Narrative']");
	      By ClickSaveButton=By.xpath(".//button[@data-ng-click='tlbr.save()']");
	      
	      
	 	 
	public void enterNarrative() throws InterruptedException {
		WebElement iframe = this.element(By.xpath("//iframe"));
		this.getDriver().switchTo().frame(iframe);
		Thread.sleep(1000);
		element(enterEBSnarrative).click();
		String generatedString = RandomStringUtils.randomAlphabetic(1000);
		typeInto(element(enterEBSnarrative), generatedString);
		
				 
	 }
	 public void clickSaveButton() {
	 this.getDriver().switchTo().defaultContent();
		 element(ClickSaveButton).click(); 
	 }
	 

}
