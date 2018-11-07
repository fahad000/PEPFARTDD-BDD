package com.FactsInfo.BudgetFormulationPage;

import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.Sleep;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.PageObject;

public class LogingPage extends PageObject{	
	   static String loginUrl ="https://ngtest.dfafacts.gov";
	    By checkTerms = By.xpath(".//*[@id='chkTerms']");
	    By userXpath =By.xpath( ".//*[@id='loginName']");
	    String passwordXpath = ".//*[@id='Password']";
	    By notificationCloseXpath = By.xpath(".//button[@class='close']");
	    By passwordInput = By.xpath(".//*[@id='Password']");
	    static String submitButton =".//button[@id='btnLogin']";
	    
	   
	    
	      public void visit() { 
	        	   
//   	            WebDriver driver;
////	        	System.setProperty("webdriver.gecko.driver","/Users/Documents/geckodriver");
//	        	System.setProperty("webdriver.chrome.driver","/Users/Documents/chromedriver");
//	        	driver= new ChromeDriver();
////	            driver = new FirefoxDriver();
////	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                driver.get(loginUrl);
//	    	      
          this.openAt(loginUrl);  		     
//		  this.getDriver().manage().window().maximize();  
	      }
	      
          public void notificationClose() {
        	  element(notificationCloseXpath).click();
          
	    }
          
          public void acknowladgeCheckTerms() {
        	  element(checkTerms).click();
          
	    }
	    
	    public void login(String user,String password) {
	    	element(checkTerms).click();
			typeInto(element(userXpath),user);
			waitFor(ExpectedConditions.presenceOfElementLocated(passwordInput));
			typeInto(element(passwordInput),password);
			element(submitButton).click();
			System.out.println("The user " + user + " has logged in with " + password);	
		}
	    
	    public void login(String user) {
	    		typeInto(element(userXpath),user);
			element(submitButton).click();
	    		System.out.println("The user " + user + " has logged in with no password");	
	    	}
		 	
//		public void logout(String user) {
//		    	System.out.println("Loggin out");
//				element(logoutButton).click();
//		 }
//		 public boolean loginVisible() {
//		     return element(login).isVisible();		
//	    }
		 
		 public void LoginWithRole(String role) throws InterruptedException {
			//convert role to login name
			String user =formatRole(role);
			String password = "";
			
			//enter login name
			element(checkTerms).click();
			waitFor(ExpectedConditions.presenceOfElementLocated(userXpath));
//			element(userXpath).click();
//			typeInto(element(userXpath),user);
			element(userXpath).sendKeys(user);
					
			//enter password
			if(role=="viewer") {
				password="FactsInfo01!";
			}
			else {
				password="FactsInfo01!";
			}
			waitFor(ExpectedConditions.presenceOfElementLocated(passwordInput));
////			element(passwordInput).click();
			element(passwordInput).sendKeys(password);
//			typeInto(element(passwordInput),password);
			
			//submit
//			getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 Thread.sleep(1000);
			find(By.xpath(submitButton)).waitUntilClickable().click();
			 Thread.sleep(1000);
		 }
		 
		 public String formatRole(String role) {
			 String user = "";
			 switch(role.toLowerCase()) {
			 case "fra user" :
				 user="testFRAUser@state.gov";
				 break;
			 case "f user" :
				 user="testFUser@state.gov";
				 break;
			 case "brm user" :
				 user="testBRMuser@state.gov";
				 break;
			 case "ou admin" :
				 user="testOUAdmin@state.gov";
				 break;
			 case "bp user" :
				 user="Mariami@test.state.gov";
				 break;
			 case "ou user" :
				 user="testOUuser1@state.gov";
				 break;
			 case "budget bureau" :
				 user="TestBudgetBuearu@state.gov";
				 break;
			 default : 
				 System.out.println("Invalid user role");
				 break;
			 }
			 return user;
		 }
		 
		 
		 public void workflowLogin(String role) {
//			 System.out.println("Logging into the common u/i");
			 String user = null;
			 String password =null;
			 switch(role.toLowerCase()) {
			 case "fra user" :
				 user="nicholsjl1@state.gov";
				 password="FactsInfo01!";
				 break;
			 case "f user" :
				 user="fisherBE@state.gov";
				 password="FactsInfo01!";
				 break;
			 case "brm user" :
				 user="pissa@usaid.gov";
				 password="FactsInfo01!";
				 break;
			 case "ou user" :
				 user="porterja@state.gov";
				 password="FactsInfo01!";
				 break;
			 case "bp user" :
				 user="Mariami@test.state.gov";
				 password="FactsInfo01!";
				 break;
			 case "ou admin" :
				 user="rharris@usaid.gov";
				 password="FactsInfo01!";
				 break;
			 case "budget bureau" :
				 user="syousuf@usaid.gov";
				 password="FactsInfo01!";
				 break;
			 default : 
				 System.out.println("Invalid user role");
				 break;
			 }
			element(checkTerms).click();
			typeInto(element(userXpath),user);
			typeInto(element(passwordInput),password);
			//submit
			element(submitButton).click();
			//System.out.println("The user " + user + " has logged in with " + password);		      
		 }
		
	}
		





