Feature: Visit Wekipedia and validate authentication

  Background: Go to the main URL
    Given User navigate wekipedia main page
    When User click on login link
    And Enter valid "MoIshak" and "Mohamed$123"
    And User click on login
    Then User logged into his account successfully

Scenario: Validate that user can search for  article and add it to watchlist
          Given User Enter a title in the search bar
          When User click on search button 
          When User click on add to watchlist icon
          When User naviage to watchlist page
          When User view the watchlist
          Then User can clear the watchlist

 Scenario: Validate that user can add External URLs to his profile
          Given User Open profile dorpdown
          When  User select Preferences option
          And   User Scroll down to URL to external Profiles textarea
          And   User Enter some links 
          And   User click Save button
          Then  Links are saved successfully
  
                
Scenario: Validate that user can change language from english to turkie
          Given User Enter a title in the search bar
          When User click on search button 
          When User click Languages dropdown
          And User Enter a langauge name in the dropdown searchbar
          And User selected from suggestion dropdown 
          Then The Lanuguage is changed successfully
           

#Scenario: Validate that user can logged out successfully






  #Scenario: Validate that user can add a new topic
    #When User click on Talk link
    #And user click on Add topic link
    #Then user can add new Topic
    
    
    
    
