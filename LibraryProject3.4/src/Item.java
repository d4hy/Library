/* 
*  File Name: Item.java
*  Course: TCSS143 –Fundamentals of Object-Oriented Programming Theory and
*  Application
*  Assignment: Programming Asssignment 3
*  Due Date: 03/03/2022
*  Instructor: Menaka Abraham
*/

/**
* This class represents Item objects. Each Item object contains an id,
* title, and availability.
*
* @author Amanda Nguyen, David Hoang
* @version 2/28/2022
*/

public abstract class Item{
   //instance fields
	private String id;
	private String title;
	private boolean available;
	
/**
* Constructor that initializes id, title, and set available to true.
*/
	public Item(String id,String title){
		setId(id);
		setTitle(title);
		isAvailable(true);
		
	}
	
/**
* Getter method for id returns the id of the item.
*
* @return Item object id
*/
	public String getId(){
    
		return id;
	}
	
/**
* Getter method for title returns the title of the item.
*
* @return Item object title
*/
	public String getTitle (){
		return title;
	}
	
/**
* Getter method for available returns true or false depending on the item
* stock.
*
* @return true if Item is available, false if not.
*/
	public boolean getAvailable(){
		return available;
	}
	
/**
* Setter method setId will take parameters and assign it to the private
* field id. An IlleglArgumentException will be thrown if id is null.
*
*
* @param id id to set
*/
	public void setId(String id){
      if(id == null){
            throw new IllegalArgumentException("id cannot be null");
         }
		this.id= id;
	}
	
/**
* Setter method setTitle will take parameters and assign it to the private
* field title. An IlleglArgumentException will be thrown if title is null.
*
* @param title title to set
*/
	public void setTitle(String title){
      if(title == null){
            throw new IllegalArgumentException("title cannot be null");
         }
		this.title = title;
	}
	
/**
* Setter method setAvailable will take parameters and assign it to the 
* private field available.
*
* @param available availablility to set
*/
	public void isAvailable(boolean available){
		this.available= available;
	}
	
/**
* The method toString will check if the Item object is available.
* If it is, stock will equal to "Yes" else stock equals "No". Returns
* a representation of the Item object.
*
* @return the Item object id, title, and stock.
*/
	public String toString(){
		String stock="";
		
		if(available){
			stock= "Yes";
		} else{
			stock="No";
		}
		
		return "Id: "+id
		+"\nTitle: "+title
		+"\nIn Stock: "+ stock;
		
	}
}