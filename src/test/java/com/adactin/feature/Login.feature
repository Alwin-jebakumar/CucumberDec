Feature: Checking Login Functionality With Different Scenarios In Adactin Application

Scenario Outline: Login Functionality

Given user Launch The Url 

When user Enter The "<Username>" In Username Field

And user Enter The "<Password>" In Password Field

Then user Click On The Login Button And Validate The "<Page>"

Examples:
	
			|		Username		|		Password		|	 Page 			|
			|		james213		|		james@123		|	https://adactinhotelapp.com/	|
			|		jeyarajalwin|		james@123		|	https://adactinhotelapp.com/	|
			|		james213		|		3VN6C5			|	https://adactinhotelapp.com/	|
			|		jeyarajalwin|		3VN6C5			|	https://adactinhotelapp.com/SearchHotel.php	|
 