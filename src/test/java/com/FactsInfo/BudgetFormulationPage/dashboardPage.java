package com.FactsInfo.BudgetFormulationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.Keys;
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
			waitFor(ExpectedConditions.presenceOfElementLocated(dashboardTitle));
	    	return element((element)).isVisible();
		}
		

		
	public void viewModulesTile(String tileName) {
		String element =String.format(viewModulesTile, tileName);
		waitFor(ExpectedConditions.presenceOfElementLocated(dashboardTitle));
    	 element((element)).click();
		
	}
//	// TODO Auto-generated method stub
//	   return null;
//}
//		public boolean clickModuleTile(String tabName) {
//			String tileXpath = "";
//			switch(tabName.toLowerCase()) {
//				case "rfs" :
//					tileXpath = viewModulesTile;
//				    break;
//				case "collections":
//					tileXpath= collectionTabXpath;
//					break;
//				case "awaiting approval" :
//					tileXpath = awaitingTabXpath;
//					break;		   
//				case "in process" :
//					tileXpath = inProcessTabXpath;
//					break;	   
//				case "completed" :
//					tileXpath = completedTabXpath;
//					break;
//				case "my assignments" :
//					tileXpath = myAssignTabXpath;
//					break;
//				case "peer review" :
//					tileXpath = peerReviewTabXpath;
//					break;
//				case "generate rems id" :
//					tileXpath = generateRemdIdButtonXpath;
//					break;
//				case "action" :
//					tileXpath = actionButtontopXpath;
//					break;
//				case "suspended" :
//					tileXpath = suspendedTabXpath;
//					break;
//				default : System.out.println("Invalid workflow tab view");
//			}
//			return element(By.xpath(tileXpath)).isVisible();
//		}
		
//		  public void viewModulesTile1(String tileName) throws Throwable {
//		    	this.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		    	String tileXpath = "";
//				switch(tab.toLowerCase()) {
//					case "rfs" :
//						tileXpath = rfsTabXpath;
//					    break;		   
//					case "awaiting approval" :
//						tileXpath = awaitingTabXpath;
//						break;		   
//					case "in progress" :
//						tileXpath = inProcessTabXpath;
//						break;	   
//					case "completed" :
//						tileXpath = completedTabXpath;
//						break;
//					case "my assignments" :
//						tileXpath = myAssignTabXpath;
//						break;
//					case "peer review" :
//						tileXpath = peerReviewTabXpath;
//						break;
//					case "collections" :
//						tileXpath = collectionTabXpath;
//						break;
//					case "suspended" :
//						tileXpath = suspendedTabXpath;
//						break;	
//						
//					default : System.out.println("Invalid workflow tab view");
//					
//				}
//				  find(By.xpath(tabXpath)).waitUntilClickable().click();
//			   }
	
}
