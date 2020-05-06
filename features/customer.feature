Feature: Customer Feature

   Scenario: The bidder detail should be added successfully
    Given Launch the Myweb application using chrome browser
    When click the User link and navigated to product list
    And click on Bid link
    When i want to enter write step with <productname> <productmode> <name> <email> 
    Then entered data should be added to the bidder details table
    And click on go to the product list button 
    Then user should be navigated to product list page
  
    #Examples: 
      | productname  | productmodel | name  		|email						|
      | TV			 |    Solidar			| satish 		|satishk2005@gmail.com	|
      | TV			 |Solidar					| Ratish    |RatishK2004@gmail.com	|

#<phone> <postaladdress> <bitamount>
#Examples: 
#      | productname  | productmodel | name  		|email						|phone				|postaladdress  |bitamount
#      | Mobile			 |    Sony			| jothi 		|jothi@yahoo.com	|8987676545		|Newyork				|5000
#      | Mobile			 |sony					| xavier    |xaver@yahoo.com	|2343234567		|canada					|6000