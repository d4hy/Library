/* 
*  File Name: MediaItem.java
*  Course: TCSS143 –Fundamentals of Object-Oriented Programming Theory and
*  Application
*  Assignment: Programming Asssignment 3
*  Due Date: 03/03/2022
*  Instructor: Menaka Abraham
*/

/**
* This class inherits from the superclass Item and represents MediaItem
* in the Library. This class serves as a superclass for other media items
* such as CDs. Each MediaItem object has an id, title, stock, and runtime.
*
* @author Amanda Nguyen, David Hoang
* @version 2/28/2022
*/
public abstract class MediaItem extends Item{
	private double runtime;
	
/**
* Constructor initializes the id, title, and runtime.
*/
	public MediaItem(String id,String title,double runtime){
		super(id,title);
		setRunTime(runtime);
	}

/**
* Getter method for runtime returns the runtime.
*
* @return runtime of MediaItem object.
*/
	public double getRunTime(){
		return runtime;
		
	}

/**
* Setter method setRuntime assigns paramaters to private field runtime.
* An IllegalArgumentException will be thrown if runtime is negative.
*
* @param runtime runtime to set.
*/
	public void setRunTime(double runtime){
      if(runtime<0){
         throw new IllegalArgumentException("runtime cannot be negative");
      }
		this.runtime= runtime;
		
	}

/**
* The method toString returns a representation of MediaItem object.
*
* @return MediaItem object's id, title, stock, and runtime.
*/
	public String toString() {
		return super.toString()+"\nRuntime: "+ getRunTime();
	}
}