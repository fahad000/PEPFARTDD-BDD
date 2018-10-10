package com.FactsInfo.BudgetFormulationPage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.core.pages.PageObject;

public class LogingPage extends PageObject{	
	   static String loginUrl ="https://ngtest.dfafacts.gov";
	    By checkTerms = By.xpath(".//*[@id='chkTerms']");
	    String userXpath = ".//*[@id='loginName']";
	    String passwordXpath = ".//*[@id='Password']";
	    By notificationCloseXpath = By.xpath(".//button[@class='close']");
	    By passwordInput = By.xpath(".//*[@id='Password']");
	    By submitButton = By.xpath(".//button[@id='btnLogin']");
	    
	   
	    
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
		 
		 public void LoginWithRole(String role) {
			//convert role to login name
			String user =formatRole(role);
			String password = "";
			
			//enter login name
			element(checkTerms).click();
			typeInto(element(userXpath),user);
					
			//enter password
			if(role=="viewer") {
				password="FactsInfo01!";
			}
			else {
				password="FactsInfo01!";
			}
			typeInto(element(passwordInput),password);
			
			//submit
			element(submitButton).click();
		 }
		 
		 public String formatRole(String role) {
			 String user = "";
			 switch(role.toLowerCase()) {
			 case "fra user" :
				 user="nicholsjl1@state.gov";
				 break;
			 case "f user" :
				 user="fisherBE@state.gov";
				 break;
			 case "brm user" :
				 user="pissa@usaid.gov";
				 break;
			 case "ou admin" :
				 user="rharris@usaid.gov";
				 break;
			 case "bp user" :
				 user="Mariami@test.state.gov";
				 break;
			 case "ou user" :
				 user="porterja@state.gov";
				 break;
			 case "budget bureau" :
				 user="syousuf@usaid.gov";
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
		





