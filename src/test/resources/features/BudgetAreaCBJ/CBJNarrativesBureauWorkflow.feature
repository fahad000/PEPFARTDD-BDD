@cbj-narrative-approval-bureau @reliable
Feature: CBJ Bureau Overview Narrative Status and CBJ Bureau Overview Narrative Status
		 As a user (with the appropriate status), 
		 I want to be able to update Bureau Overview narratives and advance them through the approval 
		 and clearance process
		 while preserving them from any intentional or accidental changes by unauthorized users. 
		         
#PBI-19581
@version:Release4
@test-1 
Scenario: 'FRA' Approval  
        Given that the 'FRA User' has logged into the facts info application
        And I view my 'Budget Formulation' tile
        When I select 'Congressional Budget Justification' from Budget Area
        And select the 'East Asia and Pacific' from the Bureau dropdown list        
        And I view the 'Bureau Overview' tab
        And the following top level dropdown menu should not display:
   	  	    |Operating Unit|
        Then the 'Save' and 'Discard' buttons should be enabled
        And the narrative status should be 'Initial' 
        When I click on the 'Update' button         
        Then the narrative status should be 'Bureau Approved' 
        And the 'Update Status' and 'Re-Open' button should be active
        When select the 'Near East' from the Bureau dropdown list
        Then the narrative status should be 'Initial' 
@test-2         
Scenario: 'F User' Approval
        Given that the 'F User' has logged into the facts info application
        And I view my 'Budget Formulation' tile
        When I select 'Congressional Budget Justification' from Budget Area
        And select the 'East Asia and Pacific' from the Bureau dropdown list        
        And I view the 'Bureau Overview' tab
        Then the following top level dropdown menu should not display:
   	  	    |Operating Unit|
        When I click on the 'Update' button         
        Then the narrative status should be 'BRM Approved' 
        When I click on the 'Update' button         
        Then the narrative status should be 'F POC Cleared' 
        When I click on the 'Update' button         
        Then the narrative status should be 'All Others Cleared'
               
        
 @test-3
Scenario: Bring the staus into initial stage  
        Given that the 'FRA User' has logged into the facts info application
        And I view my 'Budget Formulation' tile
        When I select 'Congressional Budget Justification' from Budget Area 
        When select the 'East Asia and Pacific' from the Bureau dropdown list       
        And I view the 'Bureau Overview' tab
        Then I click on the 'Re-Open' button  
        And I click on the 'Re-Open' button   
        And I click on the 'Re-Open' button
        And I click on the 'Re-Open' button            
        Then the narrative status should be 'Initial'         
 @test-4         
Scenario: Non-functional bureau the should skip the 'Bureau Approved'
        Given that the 'F User' has logged into the facts info application
        And I view my 'Budget Formulation' tile
        When I select 'Congressional Budget Justification' from Budget Area
        And select the 'CT - Bureau of Counterterrorism and Countering Violent Extremism' from the Bureau dropdown list        
        And I view the 'Bureau Overview' tab
        Then the following top level dropdown menu should not display:
   	  	    |Operating Unit|
        When I click on the 'Update' button         
        Then the narrative status should be 'BRM Approved' 
        When I click on the 'Update' button         
        Then the narrative status should be 'F POC Cleared' 
        When I click on the 'Update' button         
        Then the narrative status should be 'All Others Cleared'        
 @test-5
Scenario: Bring the staus into initial stage  
        Given that the 'FRA User' has logged into the facts info application
        And I view my 'Budget Formulation' tile
        When I select 'Congressional Budget Justification' from Budget Area 
        When select the 'CT - Bureau of Counterterrorism and Countering Violent Extremism' from the Bureau dropdown list       
        And I view the 'Bureau Overview' tab
        And I click on the 'Re-Open' button   
        And I click on the 'Re-Open' button
        And I click on the 'Re-Open' button            
        Then the narrative status should be 'Initial' 
                 
