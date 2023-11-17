#Search for hotels
#https://www.aadvantagehotels.com/
Feature: Search hotels 
As a user, I should be able to search for the hotels.

Background: 
Given I am on the Hotels page.

Scenario: I should be able to see the list of available hotels.
Given I click on Earn Miles.
And I enter the city "Washington DC".
And I select the Date from Nov 20 to Dec 20.
And I select 1 Room.
And I select 2 Adults.
And I select 1 Children.
And I select the age of child1 as 10.
When I click on Apply
And I click on Search Hotels
Then I should be able to see the list of available hotels.
And I should be able to select Lowest price first option in Sort by.




