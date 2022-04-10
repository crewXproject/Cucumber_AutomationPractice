
Feature: CRW012_sortFunctionalityWomenSection
 

  
  	Scenario: User be able to sort item name from A to Z
  
    When Click on the tab WOMEN on top of the home page
    And Select sorted Product name: A to Z
    Then User should be able to view the product which is sort by Product Name: A to Z
 
    Scenario: User be able to sort item price from low to high
  
    When Click on the tab WOMEN on top of the home page
    And Select sorted Product Price: Lowest First
    Then User should be able to view the product which is sort by Product price from low to high
    
    Scenario: User be able to sort item by stock
  
    When Click on the tab WOMEN on top of the home page
    And Select sort by In stock
    Then User should be able to view the product which is sort by In stock product only
