@cbj-narrative-approval-other @reliable
Feature: CBJ Other Accounts Narrative Status and CBJ Bureau Overview Narrative Status
   As a user (with the appropriate status), 
   I want to be able to update Other Accounts narratives and advance them through the approval 
   and clearance process
   while preserving them from any intentional or accidental changes by unauthorized users.

  #PBI-19581
  @version:Release4 @test-1
  Scenario: 'FRA' Approval
    Given that the 'FRA User' has logged into the facts info application
    And I view my 'Budget Formulation' tile
    When I select 'Congressional Budget Justification' from Budget Area
    And select the 'CT - Bureau of Counterterrorism and Countering Violent Extremism' from the Bureau dropdown list
    And I view the 'Other Accounts' tab
    Then the 'Save' and 'Discard' buttons should be enabled
    And the narrative status should be 'Initial'
    When I click on the 'Update' button
    Then the narrative status should be 'BRM Approved'
    And the 'Update Status' and 'Re-Open' button should be active

  @test-2
  Scenario: 'F User' Approval
    Given that the 'F User' has logged into the facts info application
    And I view my 'Budget Formulation' tile
    When I select 'Congressional Budget Justification' from Budget Area
    And select the 'CT - Bureau of Counterterrorism and Countering Violent Extremism' from the Bureau dropdown list
    And I view the 'Other Accounts' tab
    When I click on the 'Update' button
    Then the narrative status should be 'F POC Cleared'
    And the 'Update Status' and 'Re-Open' button should be active

  @test-3
  Scenario: 'F POC' Approval
    Given that the 'F User' has logged into the facts info application
    And I view my 'Budget Formulation' tile
    When I select 'Congressional Budget Justification' from Budget Area
    And select the 'CT - Bureau of Counterterrorism and Countering Violent Extremism' from the Bureau dropdown list
    And I view the 'Other Accounts' tab
    When I click on the 'Update' button
    Then the narrative status should be 'All Others Cleared'
    And the 'Update Status' and 'Re-Open' button should be disabled

  @test-4
  Scenario: Functional Bureau should go theough all level of approval
    Given that the 'F User' has logged into the facts info application
    And I view my 'Budget Formulation' tile
    When I select 'Congressional Budget Justification' from Budget Area
    And select the 'GH - Global Health' from the Bureau dropdown list
    And I view the 'Other Accounts' tab
    Then the narrative status should be 'Initial'
    When I click on the 'Update' button
    Then the narrative status should be 'Bureau Approved'
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
    When select the 'GH - Global Health' from the Bureau dropdown list
    And I view the 'Other Accounts' tab
    Then the narrative status should be 'All Others Cleared'
    Then I click on the 'Re-Open' button
    And I click on the 'Re-Open' button
    And I click on the 'Re-Open' button
    And I click on the 'Re-Open' button
    Then the narrative status should be 'Initial'

  #PBI-20117
  @test-6
  Scenario Outline: Changing the Account or 'Operating Unit' dropdown on the "Other Account" tab the Narrative Status should change as well
    Given that the 'F User' has logged into the facts info application
    And I view my 'Budget Formulation' tile
    When I select 'Congressional Budget Justification' from Budget Area
    And select the '<bureau>' from the Bureau dropdown list
    And I view the 'Other Accounts' tab
    When selecting an '<accoutType>' from above list that is funded
    Then the narrative status should be 'Initial'

    Examples: 
      | bureau                                                    | accoutType                                          |
      #			|CT - Bureau of Counterterrorism and Countering Violent Extremism|Counterterrorism Partnerships Fund|
      #			|CT - Bureau of Counterterrorism and Countering Violent Extremism|Counterterrorism Financing|
      #			|CT - Bureau of Counterterrorism and Countering Violent Extremism|CT Engagement with Allies|
      #        	|ISN - International Security and Nonproliferation|Export Control and Related Border Security Assistance|
      #        	|ISN - International Security and Nonproliferation|Global Threat Reduction|
      #        	|ISN - International Security and Nonproliferation|IAEA Voluntary Contribution|
      #        	|ISN - International Security and Nonproliferation|Weapons of Mass Destruction Terrorism|
      #        	|USAID Management|USAID Operational Accounts|
      | PM - Political-Military Affairs                           | Peacekeeping Operations                             |
      #        	|PM - Political-Military Affairs|International Military Education and Training|
      #        	|PM - Political-Military Affairs|Foreign Military Financing|
      #        	|PM - Political-Military Affairs|Conventional Weapons Destruction|
      | INL - International Narcotics and Law Enforcement Affairs | International Narcotics Control and Law Enforcement |
      #        	|DCHA - Democracy, Conflict, and Humanitarian Assistance|International Disaster Assistance|
      #        	|DCHA - Democracy, Conflict, and Humanitarian Assistance|Transition Initiatives|
      | S/GAC - Office of the Global AIDS Coordinator             | Global Health Programs - State                      |
      | GH - Global Health                                        | Global Health Programs - USAID                      |

  #        	|PRM - Population, Refugees, and Migration|Migration and Refugee Assistance|
  @test-7
  Scenario: 'FRA' Approval
    Given that the 'FRA User' has logged into the facts info application
    And I view my 'Budget Formulation' tile
    When I select 'Congressional Budget Justification' from Budget Area
    And select the 'CT - Bureau of Counterterrorism and Countering Violent Extremism' from the Bureau dropdown list
    And I view the 'Other Accounts' tab
    When I click on the 'Re-Open' button
    When I click on the 'Re-Open' button
    When I click on the 'Re-Open' button
    Then the narrative status should be 'Initial'
