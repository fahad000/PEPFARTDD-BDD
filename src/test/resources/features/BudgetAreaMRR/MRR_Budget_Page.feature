Feature: Mission Resource Request page

#PBI-000
@version:Release1.0
@scenario:test-2 @cbj2
Scenario: Verify account type in Account dropdown list
   	  	Given that the FRA User has logged into the facts info application
   	  	When I view my 'Budget Formulation' tile 
		Then the Budget Formulation home page should display
		And I view the 'Budget' tab
		Then I view the account dropdown following option should exist:   		  
# 	  	|*ESDF|
   	  	|ESDF - OCO|FMF|FMF - OCO|GHP-STATE|GHP-USAID|IDA|IDA - OCO|IMET|
   	  	|INCLE|INCLE - OCO|MRA|MRA - OCO|NADR ATA|NADR ATA - OCO|NADR CTBT IMS|NADR CTBTO PrepComm|NADR CWD|
   	  	|NADR CWD - OCO|NADR EXBS|NADR CWD - OCO|NADR GTR|NADR EXBS - OCO|NADR IAEA|NADR NDF|NADR TIP|
   	  	|NADR TIP - OCO|NADR WMDT|PKO|PKO - OCO|TI|TI - OCO||USAID Admin|USAID Admin - OCO|
 #PBI-000
@version:Release1.0
@scenario:test-2 
Scenario Outline: Verify account type in Account dropdown list
   	  	Given that the FRA User has logged into the facts info application
   	  	When I view my Budget Formulation tile 
		Then the Budget Formulation home page should display
		And I view the 'Budget' tab
		And Select ESDF - OCO from account dropdown list   
		And I click on the other tab 
		Then I should be able to enter <value> in the budget grid and save   
		  Examples:
		  |value|
		  |200|    
			  	

   	  	
   	  	   	  	
  
   	  	
   	  	