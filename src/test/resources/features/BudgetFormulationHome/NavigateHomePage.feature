@home @reliable
Feature: Log in to the FACTS Info system 

As a FACTS Info user, 
I want to successfully log in to the Application 
So that, I can perform my job based on my permission

Background:  	
        Given that the 'FRA User' has logged into the facts info application
   	  	When I view my 'Budget Formulation' tile
   	  	Then the Budget Formulation home page should display
   	  	
#PBI-000
@version:Release1.0
@scenario:test-2 
Scenario: Navigate to the tab options 		
		And the following top level dropdown menu should display:
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
	   	Then MRR home should have 'Pre-Submit Report' and 'Save' buttons
   	  	Then the following options should be available:   
	   	  	|Mission Resource Request|
	   	  	|Bureau Resource Request|
	   	  	|Roundtables|
	   	  	|USAID Development Budget|
	   	  	|F Staff Recommendation|
	   	  	|Bureau Appeal|
	   	  	|OMB Submission|
	   	  	|Congressional Budget Justification|  
	   	  	|Executive Budget Summary|	  	
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

   	  	
   	  	
   	  	
   	  	
   	  	
   	  	
   	      
