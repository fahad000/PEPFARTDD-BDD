@home @reliable
Feature: Log in to the FACTS Info system 

As a FACTS Info user, 
I want to successfully lon in to the Application 
So that, I can perform my job based on my permission

#Given that the user has logged into the application

#PBI-000
@version:Release1.0
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
		|Evaluation Registry Admin|
		|Help|
#		|Notifications|
#		|OP|
#		|Op Admin|
#		|PPR|
#		|Review and Final Submission|
#		|Partner Search|
#		|Review and Approval|
#		|Public Private Partnership|
#		|Reports|
		
			
		Examples:
		| user       | 
		| FRA USER   | 
		
#PBI-000
@version:Release1.0
@scenario:test-2
Scenario: Navigate to drop down menus and tabs 
   	  	Given that the FRA User has logged into the facts info application
   	  	When I view my Budget Formulation tile 
		Then the Budget Formulation home page should display
   	  	And the following top level navigation menu should display:
   	  	|Fiscal Year|
   	  	|Budget Area|
   	  	|Bureau|
   	  	|Operating Unit|
   	  	And the following tabs should display:
   	  	|Home|
   	  	|Budget|
   	  	|Over Target Request|
   	  	|Attributions|
   	  	|Narrative|
   	  	|Mission Objectives|
   	  	|Mission Objective Validation|
   	  	
#PBI-000
@version:Release1.0
@scenario:test-3
Scenario: Navigate to drop down menus and tabs 
   	  	Given that the FRA User has logged into the facts info application
   	  	When I view Budget Area drop down menu
   	  	Then the following options should be avaiable:
   	  	|Mission Resource Request|
   	  	|Bureau Resource Request|
   	  	|Roundtables|
   	  	|USAID Development Budget|
   	  	|F Staff Recommendation|
   	  	|Bureau Appeal|
   	  	|OMB Submission|
   	  	|Congressional Budget Justification|

#PBI-000
@version:Release1.0
@scenario:test-4
Scenario: Navigate to drop down menus and tabs 
   	  	Given that the FRA User has logged into the facts info application
   	  	When I view the Budget Area drop down menu
   	  	Then the following bureau options should be avaiable:
   	  	|Africa|
   	  	|East Asia and Pacific|
   	  	|Europe and Eurasia|
   	  	|USAID Development Budget|
   	  	|F Staff Recommendation|
   	  	|Near East|
   	  	|South and Central Asia|
   	  	|USAID Asia Regional| 
   	  	|Western Hemisphere|
   	  	|AVC - Arms Control, Verification, and Compliance|  	  	
   	  	|BFS - Bureau for Food Security|
   	  	|CSO - Conflict and Stabilization Operations|
   	  	|CT - Bureau of Counterterrorism and Countering Violent Extremism|
   	  	|DCHA - Democracy, Conflict, and Humanitarian Assistance|
   	  	|DRL - Democracy, Human Rights and Labor|
   	  	|E3 - Economic Growth, Education, and Environment|
   	  	|EB - Economic and Business Affairs|
   	  	|ECA - Educational and Cultural Affairs|
   	  	|ENR - Energy Resources|
   	  	|GH - Global Health|
   	  	|GH - International Partnerships|
   	  	|INL - International Narcotics and Law Enforcement Affairs|
   	  	|IO - International Organizations|
   	  	|ISN - International Security and Nonproliferation|
   	  	|J/GCJ – Office of Global Criminal Justice|
   	  	|J/TIP - Office to Monitor and Combat Trafficking In Persons|
   	  	|LAB - Global Development Lab|
   	  	|OES - Oceans and International Environmental and Scientific Affairs|
   	  	|Office of U.S. Foreign Assistance Resources|
   	  	|Other Funding|
   	  	|PM - Political-Military Affairs|
   	  	|PPL - Policy, Planning and Learning|
   	  	|PRM - Population, Refugees, and Migration|
   	  	|S/GAC - Office of the Global AIDS Coordinator|
   	  	|Special Representatives|
   	  	|USAID Management|
   	  	|USAID Program Management Initiatives|
   	  	
 #PBI-000
@version:Release1.0
@scenario:test-4
Scenario: Navigate to drop down menus and tabs 
   	  	Given that the FRA User has logged into the facts info application
   	  	When I view the Budget Area drop down menu
   	  	Then the following Operating Unit options should be avaiable:
   	  	|Angola|
   	  	|Benin|  	  	
   	  	|Botswana|
   	  	|Burkina Faso|
   	  	|Burundi|
   	  	|Cabo Verde|
   	  	|Cameroon|
   	  	|Central African Republic|
   	  	|Chad|
   	  	|Comoros|
   	  	|Cote d'Ivoire|
   	  	|Democratic Republic of the Congo|
   	  	|Djibouti|
   	  	|Eswatini|
   	  	|Ethiopia|
   	  	|Gabon|
   	  	|Gambia, The|
   	  	|Ghana|
   	  	|Guinea|
   	  	|Guinea-Bissau|
   	  	|Kenya|
   	  	|Lesotho|
   	  	|Liberia|
   	  	|Madagascar|
   	  	|Malawi|
   	  	|Mali|
   	  	|Mauritania|
   	  	|Mauritius|
   	  	|Namibia|
   	  	|Niger|
   	  	|Nigeria|
   	  	|Republic of the Congo|
   	  	|Rwanda|
   	  	|Sao Tome and Principe|
   	  	|Senegal|
   	  	|Seychelles|
   	  	|Sierra Leone|
   	  	|Somalia|
   	  	|South Africa|
   	  	|South Sudan|
   	  	|State Africa Regional|
   	  	|Sudan|
   	  	|Tanzania|
   	  	|Togo|
   	  	|Uganda|
   	  	|USAID Africa Regional|
   	  	|USAID Central Africa Regional|
   	  	|USAID East Africa Regional|
   	  	|USAID Sahel Regional Program|
   	  	|USAID Southern Africa Regional|
   	  	|USAID West Africa Regional|
   	  	|Zambia|
   	  	|Zimbabwe|
   	  	||
   	  	
   	  
   	  	
   	  	
   	  	
   	  	
   	  	
   	  	
   	  	
   	  	
   	      
