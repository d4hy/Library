/*
*  File Name: CDTest.java
*  Course: TCSS143 –Fundamentals of Object-Oriented Programming Theory and
*  Application
*  Assignment: Programming Asssignment 3
*  Due Date: 03/03/2022
*  Instructor: Menaka Abraham
*/

/**
* This class will test the CD class methods and exception handling.
*
* @author Amanda Nguyen, David Hoang
* @version 2/28/2022
*/


public class CDTest{
	
 /**
* The main method will create new CD objects and print the CD objects. It
* will also call to the compareTo method from the CD class to compare
* CD objects.
*/
	public static void main (String [] args){
		
		CD cd= new CD("M110","Greatest Hits Of The 70's Set",69.0,"Various","Pop");
		System.out.println(cd);
		
		cd.setId("J202");
		cd.setTitle("3005");
		cd.setRunTime(120.0);
		cd.setArtist("Childish Gambino");
		cd.setGenre("Hip-Hop");
		System.out.println(cd);
		
		
		CD cd2= new CD("J110","Nostalgia Track",69.0,"David Hoang","R&B");
		
		
		System.out.println(cd.compareTo(cd2));
		cd.setArtist("David Hoang");
		
		System.out.println(cd.compareTo(cd2));
		cd2.setGenre("Hip-Hop");
		System.out.println(cd.compareTo(cd2));
		
		System.out.println();
      System.out.println("Exception handling for CD class:");
		//exception handling
		
		testNegativeRunTime();
		
		testNullArtist();
      
      testNullGenre();
	}
/**
* The method testNegativeRunTime tests exception handling in method
* setRuntime in MediaItem class. The method will try to create a new
* CD object with a negative runtime and catch an IllegalArgumentException
* if found.
*/
	public static void testNegativeRunTime(){
		try {
			CD testCD= new CD("M110","Greatest Hits Of The 70's Set",-23003,"Various","Pop");
			
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}
/**
* The method testNullArtist tests exception handling in method
* setArtist in CD class. The method will try to create a new
* CD object with a null artist and catch an IllegalArgumentException
* if found.
*/
	public static void testNullArtist(){
		try {
			CD testCD= new CD("M110","Greatest Hits Of The 70's Set",3006,null,"Pop");
			
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
/**
* The method testNullGenre tests exception handling in method
* setGenre in CD class. The method will try to create a new
* CD object with a null genre and catch an IllegalArgumentException
* if found.
*/   
   public static void testNullGenre(){
		try {
			CD testCD= new CD("M110","Greatest Hits Of The 70's Set",3006,"Society",null);
			
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}