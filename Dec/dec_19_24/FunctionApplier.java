
Question-1
-------------
Design a Software System for a Media Player
---------------------------------------------------
Define an interface named as MediaPlayer 
 in this interface declare two abstract method

Methods :

name 			: play()
Return Type  		:void
Access Modifier 	:public


Methods :

name 			: stop()
Return Type  		:void
Access Modifier 	:public

Define another interface AdvancedmediaPlayer that extends MediaPlayer
and in this interface add one more abstract method i.e :
 
name 			: pause()
Return Type  		:void
Access Modifier 	:public


Create a class MusicPlayer that implements AdvancedMediaPlayer and provides implementations 
for the methods, and write some standard printing message.

Create a class VideoPlayer that implements AdvancedMediaPlayer and provides implementations 
for the methods. and write some standard printing message.

Take  a Test class to demonstrate the functionality of the media player system.


Test Case-1 :
--------------

Sample Input:

Song Title: " Life"

Expected Output :

MusicPlayer [Song Title: Life]
Playing music	: Life
Pausing music	: Life
Stopping music	: Life


Test Case-2 :
---------------
Sample Input :" "

Expected Output :
error message :Title is not be empty string.

======================================================================================================

Question-2
-------------

Design a Caluculator Program
----------------------------------

Define an interface Calculator :
 create one abstract method 

Methods :

name 			: calculateSum ()
Return Type  		:void
Arguments Type       :varargs type
Access Modifier 	:public

Take one normal class SimpleCalculator which implements Calculator interface

in this class just implement the overriden method calculateSum and write the specific logic in this method.

Create a Main class named as CalculatorTest nad instantiate the object and call the method for execution.


Test Case-1:

Sum of 1, 2, 3:
Sample Input :1,2,3

Expected Output: "Sum of the numbers: 6"

Test Case-2:
Sum of 10, 20, 30, 40:
Sample Input :(10, 20, 30, 40)
Expected Output: "Sum of the numbers: 100"

Test Case-3:
Sum of 5:
Sample Input :5
Expected Output: "Sum of the numbers: 5"

Test Case-4:

Sample Input :
Expected Output: "Sum of the numbers: 0"
