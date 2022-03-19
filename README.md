# Mini-Database_Satellite
EECS1022 Project
# Introduction
Our project is aimed to build an app with two functions. 

The home page will displaying our database, users can search definitions of words from it.

The side page will provide users a game called Win the Lottery. 

# Design
●	Using Android Studio, we create a home page displaying our database and a side page showing a game called Win the Lottery.

●	There will be a button on the home page, clicking this button will take users to the side page which is the lottery game.

●	There will be a text box where user can input the word that they want to search.

●	There will be a button widget below which has a confirm on it.

●	Using the onclick, after clicking on this button, we pass the value of the text box to a java function called nameof which loop through the database, if successfully found, return the definition else we return invalid as output.

●	All the output will be on the textbox on the bottom of screen.

●	If user enter null, textbox below will show user the prompt “please enter something before clicking on search”.

●	For the database there is a class called object which has two values: information and name.

●	Name represent the name of object while information shows the definition of this object.

●	Database class create a object array which has a length of 100, and information to show the status.

●	We can add object into database by addObject method if beyond 100, information will be invalid and new object will not be added.

●	In the lottery game, users can see two text box that shows the game title and the input request.

●	Users can input a two-digit number, then click the button.

●	The system automatically generates a two-digit number, and when the user enters two numbers, compares the numbers that are not identical. 

●	If the numbers are identical, the prize of 10,000 is displayed; if it matches a number in the lottery, 5,000 is displayed; if the number entered matches only one number in the lottery in case of discontinuity, $500 is displayed. Else, display 0.

