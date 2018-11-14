package com.FactsInfo.BudgetFormulation.pages.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.PageObject;

public class LogingPage extends PageObject{	
//	   static String loginUrl ="https://ngtest.dfafacts.gov";
	   static String loginUrl ="https://pepfar.dfafacts.gov/mechanisms/search";
	    By checkTerms = By.xpath(".//*[@id='chkTerms']");
	    String userXpath = ".//*[@id='loginName']";
	    String passwordXpath = ".//*[@id='Password']";
	    By login = By.xpath(".//*[@class='_3qCP34LvaPLptYEIksSr_a']");
	    By logoutButton = By.xpath(".//*[@class='Application___logoutButton']");
	    By userName = By.xpath(".//*[@id='loginName']");
	    By passwordInput = By.xpath(".//*[@id='Password']");
	    By submitButton = By.xpath(".//button[@id='btnLogin']");
	   
//	        @Before
//	        public void beforeScenario(){
//	            System.out.println("this will run before the actual scenario");
//	        }
//
//	        @After
//	        public void afterScenario(){
//	            System.out.println("this will run after scneario is finished, even if it failed");
//	        }

	    
	           public void visit() { 
	        	   
//   	            WebDriver driver;
////	        	System.setProperty("webdriver.gecko.driver","/Users/Documents/geckodriver");
//	        	System.setProperty("webdriver.chrome.driver","/Users/Documents/chromedriver");
//	        	driver= new ChromeDriver();
////	            driver = new FirefoxDriver();
////	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                driver.get(loginUrl);
//	    	      
//          this.openAt("https://ngtest.dfafacts.gov");
	       this.openAt("https://pepfar.dfafacts.gov/mechanisms/search");
//		  this.getDriver().manage().window().maximize();      
	    }
	    
	    public void login(String user,String password) {
	    	element(checkTerms).click();
			typeInto(element(userName),user);
			typeInto(element(passwordInput),password);
			element(submitButton).click();
			System.out.println("The user " + user + " has logged in with " + password);	
		}
	    
	    public void login(String user) {
	    		typeInto(element(userName),user);
			element(submitButton).click();
	    		System.out.println("The user " + user + " has logged in with no password");	
	    	}
		 	
		public void logout(String user) {
		    	System.out.println("Loggin out");
				element(logoutButton).click();
		 }
		 public boolean loginVisible() {
		     return element(login).isVisible();		
	    }
		 
		 public void LoginWithRole(String role) {
			//convert role to login name
			String user = formatRole(role);
			String password = "";
			
			//enter login name
			element(checkTerms).click();
//			waitFor(ExpectedConditions.presenceOfElementLocated(userXpath));
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
			 String user = null;
			 switch(role.toLowerCase()) {
			 case "FRA USER" :
				 user="nicholsjl1@state.gov";
				 break;
			 case "F USER" :
				 user="fisherBE@state.gov";
				 break;
			 case "BRM USER" :
				 user="pissa@usaid.gov";
				 break;
			 case "OU Admin" :
				 user="rharris@usaid.gov";
				 break;
			 case "BP User" :
				 user="Mariami@test.state.gov";
				 break;
			 case "OU User" :
				 user="porterja@state.gov";
				 break;
			 case "Budget Bureau" :
				 user="syousuf@usaid.gov";
				 break;
			 default : 
				 System.out.println("Invalid user role");
				 break;
			 }
			 return user;
		 }
	}
		





