@ebs @reliable
Feature: As a BP user, I should be able do my job by entering funding in the individul narratives 
	
#PBI-19581
@version:Release4
@test-1 
Scenario: Enter narrative in to the text box 
        Given that the 'BP user' has logged into the facts info application
        And I view my 'Budget Formulation' tile
        When I select 'Executive Budget Summary' from Budget Area 
        And I view the 'EBS' tab
        When I enter my EBS narrative and save 
        Then the 'Save' and 'Discard' buttons should be enabled
        
