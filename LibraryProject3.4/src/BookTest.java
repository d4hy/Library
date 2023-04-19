/*
*  File Name: BookTest.java
*  Course: TCSS143 –Fundamentals of Object-Oriented Programming Theory and
*  Application
*  Assignment: Programming Asssignment 3
*  Due Date: 03/03/2022
*  Instructor: Menaka Abraham
*/

/**
* This class test the methods from Book class and exception handling in
* Book class and Item class.
*
* @author Amanda Nguyen, David Hoang
* @version 2/28/2022
*/

public class BookTest{
/**
* The main method will create new Book objects and print the Book objects.
* It will also call to the compareTo method from the Book class to compare
* Book objects.
*/
	public static void main(String []args){
		Book b1= new Book("B100","Building Java Programs",
		"Reges & Stepp",2020,"Pearson");
		
		
		Book book2 = new Book("B111", "C Primer Plus",
		"Prata", 2015, "Addison");
		
		Book book3 = new Book("B101", "Introduction to Computing",
		"Patt & Patel", 2020, "Wiley");
		
		System.out.println(b1);
		System.out.println(book2);
		System.out.println(book3);
		
		System.out.println(book2.compareTo(b1)); // if year is earlier, it will return < 0
		System.out.println(b1.compareTo(book3)); // if year is equal it will return 0
		System.out.println(book3.compareTo(book2)); // if year is later it will return > 0
		
		System.out.println();
		b1.setId("KBD100");
		b1.setTitle("Guide to Custom Keyboards");
		b1.isAvailable(false);
		b1.setAuthor("David Hoang");
		b1.setYear(2022);
		b1.setPublisher("Among us");
		System.out.println(b1);
		
      System.out.println();
		System.out.println("Exception Handling for Book class:");
		// Exception Handling test code
		testNullId();

      // testing for titles
      testNullTitle();
      
      // testing for author
      testNullAuthor();
      
      // testing for year
      testNegativeYear();
      // testing for publisher
      testNullPublisher();
	}
/**
* The method testNullId will test exception handling of method
* setId in Item class. The method will try to create a new Book 
* object with null id and catch IllegalArgumentException if found.
*/
	public static void testNullId(){
		try {
			Book testBook= new Book(null,"Building Java Programs",
			"Reges & Stepp", 2020, "Pearson");
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}
/**
* The method testNullTitle will test exception handling in method
* setTitle in Item class. The method will try to create a new Book 
* object with null title and catch IllegalArgumentException if found.
*/
   public static void testNullTitle(){
		try {
			Book testBook= new Book("hello", null,
			"Reges & Stepp", 2020, "Pearson");
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
     }
/**
* The method testNullAuthor will test exception handling in method
* setAuthor in Book class. The method will try to create a new Book 
* object with null author and catch IllegalArgumentException if found.
*/      
	
   public static void testNullAuthor(){
		try {
			Book testBook= new Book("hello", "Building Java Programs",
			null, 2020, "Pearson");
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
/**
* The method testNegativeYear will test exception handling in method
* setYear in Book class. The method will try to create a new Book 
* object with a negative year and catch IllegalArgumentException if found.
*/      
	}
   public static void testNegativeYear(){
		try {
			Book testBook= new Book("hello", "Building Java Programs",
			"Reges & Stepp", -23, "Pearson");
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
/**
* The method testNullPublisher will test exception handling in method
* setPublisher in Book class. The method will try to create a new Book 
* object with null publisher and catch IllegalArgumentException if found.
*/      
	}
   public static void testNullPublisher(){
		try {
			Book testBook= new Book("hello", "Building Java Programs",
			"Reges & Stepp", 2020, null);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
      
	}
}