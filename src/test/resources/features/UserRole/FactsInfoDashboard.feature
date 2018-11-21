@dashboard @reliable
Feature: FACTS Info system dashboard

As a FACTS Info user, 
I want view all modules based on my user role and permission
		
#PBI-000
@version:Release1.0 
@scenario:test-1 
Scenario Outline: Log in with user role
		Given that the '<user>' has logged into the facts info application
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
		Examples:
			| user       | 
			| FRA USER   | 
				
#PBI-000 
@version:Release1.0 
@scenario:test-2 
Scenario Outline: Log in with user role
		Given that the '<user>' has logged into the facts info application
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
		Examples:
			| user     | 
			| F USER   |
			
##PBI-000
@version:Release1.0 
@scenario:test-4 
Scenario Outline: Log in with user role
		Given that the <user> has logged into the facts info application
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
       Examples:
			| user     | 
			| Budget Bureau|	 
		
			
   #PBI-000
@version:Release1.0 
@scenario:test-4 
Scenario Outline: Log in with user role
		Given that the <user> has logged into the facts info application
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
       Examples:
			| user     | 
			| BRM USER |

   #PBI-000
@version:Release1.0 
@scenario:test-4 
Scenario Outline: Log in with user role
		Given that the <user> has logged into the facts info application
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
			
       Examples:
			| user     | 
			| OU User  |
			
   #PBI-000
@version:Release1.0 
@scenario:test-4 
Scenario Outline: Log in with user role
		Given that the <user> has logged into the facts info application
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
       Examples:
			| user     | 
			| OU Admin |	
			
   #PBI-000
@version:Release1.0 
@scenario:test-4 
Scenario Outline: Log in with user role
		Given that the <user> has logged into the facts info application
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
       Examples:
			| user     | 
			| BP User |	