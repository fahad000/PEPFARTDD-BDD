@budget-user-role @reliable
Feature: User role and permission
As a Budget Formulation user, I should have access to Bereau and OU(s) based on my permisson
  	  	
 #PBI-000
@version:Release1.0
@scenario:test-4 @marcus
Scenario Outline: Verify that the FRA, F, and BRM user can access all Bureau/OU(s)
   	  	Given that the <user> has logged into the facts info application
		When I view my Budget Formulation tile 
   	  	Then the following OU options should be avaiable:
	  	  	|Angola|Benin|Botswana|Burkina Faso|Burundi|Cabo Verde|
	   	  	|Cameroon|Central African Republic|Chad|Comoros|Democratic Republic of the Congo|Djibouti|
	   	  	|Eswatini|Ethiopia|Gabon|Gambia, The|Ghana|Guinea|
	   	  	|Kenya|Lesotho|Liberia|Madagascar|Malawi|Mali|
	   	  	|Mauritania|Mauritius|Namibia|Niger|Nigeria|Republic of the Congo|
			|Rwanda|Sao Tome and Principe|Senegal|Seychelles|Sierra Leone|Somalia|
			|South Africa|South Sudan|State Africa Regional|Sudan|Tanzania|Togo|
			|Uganda|USAID Africa Regional|USAID Central Africa Regional|USAID East Africa Regional|USAID Sahel Regional Program|USAID Southern Africa Regional|
       	 	|Guinea-Bissau|African Union|USAID West Africa Regional|Zambia|Zimbabwe|Zimbabwe|
     	And the following bureau options should be available:
	   	  	|Africa|East Asia and Pacific|Europe and Eurasia|Near East|
	   	  	|South and Central Asia|USAID Asia Regional|Western Hemisphere|AVC - Arms Control, Verification, and Compliance| 
	   	  	|BFS - Bureau for Food Security|CSO - Conflict and Stabilization Operations|CT - Bureau of Counterterrorism and Countering Violent Extremism|DCHA - Democracy, Conflict, and Humanitarian Assistance|
	   		|DRL - Democracy, Human Rights and Labor|E3 - Economic Growth, Education, and Environment|EB - Economic and Business Affairs|ECA - Educational and Cultural Affairs|
			|ENR - Energy Resources|GH - Global Health|GH - International Partnerships|INL - International Narcotics and Law Enforcement Affairs|
			|ISN - International Security and Nonproliferation|J/GCJ – Office of Global Criminal Justice|J/TIP - Office to Monitor and Combat Trafficking In Persons|LAB - Global Development Lab|
			|OES - Oceans and International Environmental and Scientific Affairs|Office of U.S. Foreign Assistance Resources|Other Funding|PM - Political-Military Affairs|
			|PPL - Policy, Planning and Learning|PRM - Population, Refugees, and Migration|S/GAC - Office of the Global AIDS Coordinator|Special Representatives|
			|USAID Management|USAID Program Management Initiatives|USAID Management|USAID Management|
			
#			|USAID Development Budget|F Staff Recommendation|  	  	
	   	  	Examples:
		   	  	|user|
		   	  	|FRA User|
		   	  	|F User|
		   	  	|BRM USER|

 #PBI-000
@version:Release1.0
@scenario:test-4 @brm
Scenario: Verify that BRM USER can access all Bureau/OU(s) and only edit assigned OU
   	  	Given that the BRM USER has logged into the facts info application
		When I view my Budget Formulation tile
#		Then the following OU options should be avaiable:
#   	  		|Bangladesh|
   	  	And I view the Budget tab
		And Select ESDF - OCO from account dropdown list   
		And I click on the other tab 
		Then I should be able to enter 200 in the budget grid and save 	 
			
 
 
 #PBI-000
@version:Release1.0
@scenario:test-4  
Scenario Outline: Verify that the "OU Admin" user has access to assigned OU’s Only  
   	  	Given that the <user> has logged into the facts info application
		When I view my Budget Formulation tile 
   	  	Then the following OU options should be avaiable:
   	  		|Bangladesh|
   	  	Then the following bureau options should be available:
   	  		|South and Central Asia|
   	  	Examples:
	   	  	|user|
	   	  	|OU Admin|
 #PBI-000
@version:Release1.0
@scenario:test-4
Scenario Outline: Verify that the "OU" user has access to assigned OU’s Only 
   	  	Given that the <user> has logged into the facts info application
		When I view my Budget Formulation tile 
   	  	Then the following OU options should be avaiable:
   	  		|Afghanistan|
   	    Then the following bureau options should be available:
   	  		|South and Central Asia| 
   	  	Examples:
	   	  	|user|
	   	  	|OU User|   	  	  	  	  	  	   	  	
#PBI-000 
@version:Release1.0
@scenario:test-4 
Scenario Outline: Verify that Budget Bureau user can access to all OU’s associated with assigned Bureaus Only 
   	  	Given that the <user> has logged into the facts info application
   	  	When I view my Budget Formulation tile  
   	  	Then the following bureau options should be available:
   	  		|Western Hemisphere|
   	  	And the following OU options should be avaiable:
	   	  	|Argentina|Bahamas, The|Barbados and Eastern Caribbean|Belize|Bolivia|Brazil|Colombia|Chile|
	   	  	|Costa Rica|Cuba|Dominica|Dominican Republic|USAID South America Regional|USAID South America Regional|Venezuela|Ecuador|
	   	  	|El Salvador|Guatemala|Guyana|Haiti|Honduras|Jamaica|Mexico|Nicaragua|
	   	  	|Panama|Paraguay|Peru|State Western Hemisphere Regional|Suriname|Trinidad and Tobago|Uruguay|USAID Caribbean Development Program|
	#   	  	|USAID South America Regional|   	  	
   	  	Examples:
	   	  	|user|
	   	  	| Budget Bureau|
   	  