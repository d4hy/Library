/* 
*  File Name: CD.java
*  Course: TCSS143 –Fundamentals of Object-Oriented Programming Theory and
*  Application
*  Assignment: Programming Asssignment 3
*  Due Date: 03/03/2022
*  Instructor: Menaka Abraham
*/

/**
* This class inherits from the superclass MediaItem and contains
* getter and setter methods for artist and genre. Each CD object
* has an id, title, stock, runtime, artist, and genre. 
*
* @author Amanda Nguyen, David Hoang
* @version 2/28/2022
*/

public class CD extends MediaItem implements Comparable<CD>{
   // instance fields
	private String artist;
	private String genre;
	
/**
* Constructor initializes the id, title, runtime, artist, and genre.
*/
	public  CD (String id,String title,double runtime, String artist, String genre){
		super(id,title,runtime);
		setArtist(artist);
      setGenre(genre);
	}
   
/**
* Getter method for artist returns the artist of the CD.
*
* @return artist of CD object
*/
	public String getArtist(){
		return artist;
	}
   
/**
* Getter method for genre returns the genre of the CD.
*
* @return genre of CD object
*/
	public String getGenre(){
		return genre;
	}
   
/**
* Setter method setArtist assigns parameters to the private field artist.
* An IllegalArgumentException will be thrown if artist is null.
*
* @param artist artist to set
*/
	public void setArtist(String artist){
      if(artist==null){
         throw new IllegalArgumentException("artist cannot be null");
      }
		this.artist= artist;
	}
   
/** 
* Setter method setGenre assigns parameters to the private field genre.
* An IllegalArgumentException will be thrown if genre is null.
*
* @param genre genre to set
*/
	public void setGenre(String genre){
      if(genre==null){
         throw new IllegalArgumentException("genre cannot be null");
      }
		this.genre= genre;
	}
	
/**
* The method compareTo compares two cd object's artist and genre by
* lexicographical ordering. An IllegalArgumentException will be thrown
* if other CD object is null.
*
* @param other other CD object used to compare
* @return 0 if CD objects are equal, < 0 if other CD object is greater,
* else returns > 0 if CD object is greater.
*/
	public int compareTo(CD other){
      if(other== null){
         throw new IllegalArgumentException("cd cannot be null");
      }
		if(!artist.equals(other.getArtist())) {
			return artist.compareTo(other.getArtist());
		}

		return genre.compareTo(other.getGenre());
		
		
	}
/**
* The method toString returns a representation of the CD object
*
* @return the CD object's id, title, stock, runtime, artist, and genre.
*/
   public String  toString (){
      
         return super.toString()+"\nArtist: "+ artist
         +"\nGenre: "+ genre;
     
    
   }
}