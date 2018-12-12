@FACTSdashboard @reliable
Feature: FACTS Info system dashboard

As a FACTS Info user, 
I want view all modules based on my user role and permission
		
#PBI-000
@version:Release1.0 
@scenario:test-1 
Scenario: Log in with user 'FRA USER' role
		Given that the 'FRA USER' has logged into the facts info application
		Then the following tile should be visible:
			|Manage Help|
			|Manage Notifications|
			|Manage User Request|
			|Reference Data Management|				  		
			|User Accounts|
			|Budget Formulation|
			|Evaluation Registry|
			|Notifications|
			|Help|
			|OP|
			|Review and Final Submission|
			|Partner Search|
			|PPR|
			|Public Private Partnership|
			|Reports|
			|Review and Approval|
		And the following tile should not be visible:
			|Evaluation Registry Admin|		 
				
#PBI-000 
@version:Release1.0 
@scenario:test-2 
Scenario: Log in with user 'F USER' role
		Given that the 'F USER' has logged into the facts info application
		Then the following tile should be visible:							  		
			|Budget Formulation|
			|Evaluation Registry|
			|Notifications|
			|Help|
			|OP|
			|Review and Final Submission|
			|Partner Search|
			|PPR|
			|Public Private Partnership|
			|Reports|
			|Review and Approval|
		And the following tile should not be visible:
			|Reference Data Management|
			|Evaluation Registry Admin|
			|Manage User Request|
			|Manage Notifications|
			|Manage Help|	 
			
##PBI-000
@version:Release1.0 
@scenario:test-4 
Scenario: Log in with user 'Budget Bureau' role
		Given that the 'Budget Bureau' has logged into the facts info application
		Then the following tile should be visible:							  		
			|Budget Formulation|
			|Notifications|
			|Help|
			|OP| 
			|Review and Final Submission|
			|Partner Search|
			|Public Private Partnership|
			|Reports|
			|Review and Approval|
		And the following tile should not be visible:
			|Evaluation Registry Admin|
			|Evaluation Registry|
			|Manage Notifications|
			|Manage Help|
			|Reference Data Management|
			|User Accounts|	
			|Manage User Request|
			|PPR|	 
					
   #PBI-000
@version:Release1.0 
@scenario:test-4 
Scenario: Log in with user 'BRM USER' role
		Given that the 'BRM USER' has logged into the facts info application
		Then the following tile should be visible:							  		
			|Budget Formulation|
			|Evaluation Registry|
			|Notifications|
			|Help|
			|OP| 
			|Review and Final Submission|
			|Partner Search|
			|Public Private Partnership|
			|Reports|
			|Review and Approval|
		And the following tile should not be visible:
			|Evaluation Registry Admin|
			|Manage Notifications|
			|Manage Help|
			|Reference Data Management|
			|User Accounts|	
			|Manage User Request|
			|PPR|

   #PBI-000
@version:Release1.0 
@scenario:test-4 
Scenario: Log in with user 'OU User' role
		Given that the 'OU User' has logged into the facts info application
		Then the following tile should be visible:							  		
			|Budget Formulation|
			|Evaluation Registry|
			|Notifications|
			|Help|
			|OP|
			|PPR| 
			|Review and Final Submission|
			|Partner Search|
			|Public Private Partnership|
			|Reports|
			|Review and Approval|
		And the following tile should not be visible:
			|Evaluation Registry Admin|
			|Manage Notifications|
			|Manage Help|
			|Reference Data Management|
			|User Accounts|	
			|Manage User Request|
			
   #PBI-000
@version:Release1.0 
@scenario:test-4 
Scenario: Log in with user 'OU Admin' role
		Given that the 'OU Admin' has logged into the facts info application
		Then the following tile should be visible:
			|User Accounts|	
			|Manage User Request|							  		
			|Budget Formulation|
			|Evaluation Registry|
			|Notifications|
			|Help|
			|OP|
			|PPR| 
			|Review and Final Submission|
			|Partner Search|
			|Public Private Partnership|
			|Reports|
			|Review and Approval|
		And the following tile should not be visible:
			|Evaluation Registry Admin|
			|Manage Notifications|
			|Manage Help|
			|Reference Data Management|				
			
   #PBI-000
@version:Release1.0 
@scenario:test-4 
Scenario: Log in with user 'BP User' role
		Given that the 'BP User' has logged into the facts info application
		Then the following tile should be visible:
			|Budget Formulation|
			|Notifications|
			|Reports|
			|Help|
		And the following tile should not be visible:
			|Evaluation Registry Admin|
			|Manage Notifications|
			|Manage Help|
			|Reference Data Management|
			|User Accounts|	
			|Manage User Request|							  		
			|Evaluation Registry|
			|OP|
			|PPR| 
			|Review and Final Submission|
			|Partner Search|
			|Public Private Partnership|
			|Review and Approval|			
