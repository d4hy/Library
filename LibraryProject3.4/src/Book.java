/* 
*  File Name: Book.java
*  Course: TCSS143 –Fundamentals of Object-Oriented Programming Theory and
*  Application
*  Assignment: Programming Asssignment 3
*  Due Date: 03/03/2022
*  Instructor: Menaka Abraham
*/

/**
* This class inherits from the superclass Item and represents Books 
* in the Library. Each Book object has an id, title, stock, author,
* year, and publisher.
*
* @author Amanda Nguyen, David Hoang
* @version 2/28/2022
*/



public class Book extends Item implements Comparable<Book> {

	private String author;
	private int year;
	private String publisher;
	
/**
* Constructor initializes the id, title, author, year, and publisher.
*/
	public Book(String id,String title,String author,int year, String publisher){
		super(id,title);
		setAuthor(author);
      setYear(year);
      setPublisher(publisher);
		
	}
	
/**
* Getter method for author returns the author of book.
*
* @return author of book
*/
	public String getAuthor(){
		return author;
	}
	
/**
* Getter method for year returns the year of book.
*
* @return year of book
*/
	public int getYear(){
		return year;
	}
	
/**
* Getter method for publisher returns publisher of book.
*
* @return publisher of book
*/
	public String getPublisher(){
		return publisher;
	}
	
/**
* Setter method setAuthor will assign parameters to private field author.
* An IllegalArgumentException will be thrown if author is null.
*
* @param author author to set
*/
	public void setAuthor(String author){
      if(author== null){
         throw new IllegalArgumentException("author cannot be null");
      }
		this.author=author;
	}
	
/**
* Setter method setYear will assign parameters to private field year.
* An IllegalArgumentException will be thrown if year is negative.
*
* @param year year to set
*/
	public void setYear(int year){
      if(year<0){
         throw new IllegalArgumentException("year cannot be negative");
      }
		this.year=year;
	}
	
/**
* Setter method setPublisher will assign parameters to private field 
* publisher. An IllegalArgumentException will be thrown if publisher
* is null.
*
* @param publisher publisher to set
*/
	public void setPublisher (String publisher) {
      if(publisher== null){
         throw new IllegalArgumentException("publisher cannot be null");
      }
		this.publisher = publisher;
		
	}
	
/**
* The method toString returns a representation of the Book object
*
* @return the Book object's id, title, stock, artist, year, and publisher.
*/
	public String toString(){
		
		return super.toString()+"\nAuthor: "+ author
		+"\nYear: "+year
		+"\nPublisher: "+publisher;
		
		
	}
	
/**
* The method compareTo compares two Book object's year.
* An IllegalArgumentException will be thrown if other Book object
* is null.
*
* @param other other Book object used to compare
* @return 0 if years are equal, < 0 if other Book object is published later,
* else returns > 0 if other Book object is published earlier.
*/
	public int compareTo(Book other){
      if(other==null){
         throw new IllegalArgumentException("book cannot be null");
      }
		return year - other.year;
		
	}
	
}