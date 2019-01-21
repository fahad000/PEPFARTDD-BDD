package com.FactsInfo.PEPFARPage;

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
	//static String loginUrl ="https://training.dfafacts.gov";
//	   static String loginUrl ="https://ngtest.dfafacts.gov";
//	 static String loginUrl = System.getProperty("LoginUrl", "https://pepfar.dfafacts.gov/mechanisms/search");
//	    By checkTerms = By.xpath(".//*[@id='chkTerms']");
//	    By userXpath =By.xpath( ".//*[@id='loginName']");
//	    String passwordXpath = ".//*[@id='Password']";
//	    By notificationCloseXpath = By.xpath(".//button[@class='close']");
//	    By passwordInput = By.xpath(".//*[@id='Password']");
//	    static String submitButton =".//button[@id='btnLogin']";
	
	
	   static String loginUrl ="https://pepfar.dfafacts.gov/mechanisms/search";   
	   By checkTerms = By.xpath(".//button[@class='mat-button mat-primary']");
	   By userXpath =By.xpath( ".//input[@formcontrolname='email']");
	   String passwordXpath = ".//input[@id='mat-input-35']";
	    By notificationCloseXpath = By.xpath(".//button[@class='close']");
	    By passwordInput = By.xpath(".//input[@formcontrolname='password']");
	    static String submitButton =".//button[@class='mat-raised-button mat-primary']";
		   
	    
	      public void visit() { 	    	      
          this.openAt(loginUrl);  		      
	      }
	      
          public void notificationClose() {
        	  element(notificationCloseXpath).click();
          
	    }
          
          public void acknowladgeCheckTerms() throws InterruptedException {   
        	  Thread.sleep(1500);
       	  element(checkTerms).waitUntilEnabled().click();
       	      Thread.sleep(1500);
          
	    }
	    
	    public void login(String user,String password) {
//	    	element(checkTerms).click();
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
		 	
		 
		 public void LoginWithRole(String role) throws InterruptedException {
			//convert role to login name
			//String user =formatRole(role);
			 String user =formatRole(role);
			String password = "";		
			//enter login name
			element(checkTerms).click();
			Thread.sleep(1000);
			this.getDriver().switchTo().defaultContent();
			element(userXpath).click();
			element(userXpath).waitUntilEnabled().sendKeys("eddycr@state.gov");
			Thread.sleep(1500);
			
			
					
			//enter password
			if(role=="viewer") {
				password="FactsInfo02!";
			}
			else {
				password="FactsInfo02!";
			}
			waitFor(ExpectedConditions.presenceOfElementLocated(passwordInput));
			Thread.sleep(2500);
			element(passwordInput).click();
			element(passwordInput).sendKeys(password);
			Thread.sleep(1500);
			find(By.xpath(submitButton)).waitUntilClickable().click();
			Thread.sleep(1500);
		 }
		 
		 public String formatRole(String role) {
			 String user = "";
			 switch(role.toLowerCase()) {
			 case "HQ user" :
				 user="eddycr@state.gov";
				 break;
//			 case "f user" :
//				 user="testFUser@state.gov";
//				 break;
//			 case "brm user" :
//				 user="testBRMuser@state.gov";
//				 break;
//			 case "ou admin" :
//				 user="testOUAdmin@state.gov";
//				 break;
//			 case "bp user" :
//				 user="Mariami@test.state.gov";
//				 break;
//			 case "ou user" :
//				 user="testOUuser1@state.gov";
//				 break;
//			 case "budget bureau" :
//				 user="TestBudgetBuearu@state.gov";
//				 break;
		 default : 
			 System.out.println("Invalid user role");
			 break;
			 }
			 return user;
		 }
		 
		 
		
		
	}
		





