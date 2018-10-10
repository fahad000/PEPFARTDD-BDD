@dashboard @reliable
Feature: FACTS Info system dashboard

As a FACTS Info user, 
I want view all modules based on my user role and permission
		
#PBI-000
@version:Release1.0 @smoke
@scenario:test-1 
Scenario Outline: Log in with user role
		Given that the <user> has logged into the facts info application
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
@version:Release1.0 @smoke
@scenario:test-2 
Scenario Outline: Log in with user role
		Given that the <user> has logged into the facts info application
		Then the following tile should be visible:			
			|Reference Data Management|				  		
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
			|Manage User Request|
			|Manage Notifications|
			|Manage Help|
			|User Accounts|		 
		Examples:
			| user     | 
			| F USER   |
			
##PBI-000
#@version:Release1.0 @smoke
#@scenario:test-3 
#Scenario: Log in with user role
#		Given that the <user> has logged into the facts info application
#		Then the following tile should be visible:							  		
#			|Budget Formulation|
#			|User Accounts|
#			|Manage User Request|
#			|Evaluation Registry|
#			|Notifications|
#			|Help|
#			|OP| 
#			|Review and Final Submission|
#			|Partner Search|
#			|PPR|
#			|Public Private Partnership|
#			|Reports|
#			|Review and Approval|
#		And the following tile should not be visible:
#			|Evaluation Registry Admin|
#			|Manage Notifications|
#			|Manage Help|
#			|Reference Data Management|		 
		
			
   #PBI-000
@version:Release1.0 @smoke
@scenario:test-4 
Scenario Outline: Log in with user role
		Given that the <user> has logged into the facts info application
		Then the following tile should be visible:							  		
			|Budget Formulation|
			|User Accounts|
			|Manage User Request|
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
			|Manage Notifications|
			|Manage Help|
			|Reference Data Management|	
       Examples:
			| user     | 
			| BRM USER |
			| Budget Bureau |		