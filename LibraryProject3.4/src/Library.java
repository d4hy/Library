/* 
*  File Name: Library.java
*  Course: TCSS143 –Fundamentals of Object-Oriented Programming Theory and
*  Application
*  Assignment: Programming Asssignment 3
*  Due Date: 03/03/2022
*  Instructor: Menaka Abraham
*/

import java.util.*;

/**
* This class represents a Library. The class will add Item objects to the
* ArrayList, search through the ArrayList using a title, checkout or 
* checkin an Item object, and print the elements of the ArrayList in 
* full or by Item type.
*
* @author Amanda Nguyen, David Hoang
* @version 2/28/2022
*/
public class Library{
	
	private ArrayList <Item> libList;
	
	public enum ItemType {BOOK, CD};
/**
* Constructer intializes ArrayList of Item objects
*/
	public Library() {
		
		this.libList = new ArrayList<Item>();
		
		
	}
/**
* The method addItem will add the Item object into the ArrayList.
* An IllegalArgumentException will be thrown if item is null.
*
* @param item object from the Item class
*/
	public void addItem(Item item) {
   if (item == null) {
      throw new IllegalArgumentException("item cannot be null.");
      }
		libList.add(item);
	}
	
/**
* The method search will go through the ArrayList and determine if
* the Item object title is in the ArrayList. An IllegalArgumentException
* will be thrown if title is null.
*
* @param title title of the Item object
* @return Item object if found, else returns null
*/
	public Item search (String title) {
   if (title == null) {
      throw new IllegalArgumentException("title cannot be null.");
      }
		for(int i = 0; i < libList.size(); i++) {
			if (libList.get(i).getTitle().equalsIgnoreCase(title)) {
				return libList.get(i);
			}
		}
		return null;
	}
	
/**
* The method checkout will call the method search to determine if the Item
* object is in the ArrayList. If the Item object is found and still available
* the availability will be set to false. Otherwise, it will throw an 
* IllegalStateException.
*
* @param title is the title of the Item object
*/
	public void checkout (String title) {
		Item itemTocheckOut= search(title);
		if (itemTocheckOut == null) {
			throw new IllegalStateException("Title does not exist.");
		} else if (!itemTocheckOut.getAvailable()) {
			throw new IllegalStateException("Item not available.");
		} else {
			itemTocheckOut.isAvailable(false);
		}
	}
	
/**
* The method checkin will call the method search to determine if the Item
* object is in the ArrayList. If the Item object is found and not available
* the availability will be set to true. Otherwise, it will throw an 
* IllegalStateException.
*
* @param title title of the Item object

*/
	public void checkin(String title) {
		Item itemToCheckIn = search(title);
		if (itemToCheckIn == null) {
			throw new IllegalStateException("Title does not exist");
		} else if (itemToCheckIn.getAvailable()) {
			throw new IllegalStateException("Item is still available");
		}
		itemToCheckIn.isAvailable(true);
	}
	
/**
* The method getList will create a new ArrayList and add Item objects
* into the new ArrayList based on the item type. An IllegalArgumentException
* will be thrown is type is null.
*
* @param type type of Item object (CD or Book)
* @return ArrayList of Item objects of that type
*/
	public List<Item> getList (ItemType type) {
   if (type == null) {
      throw new IllegalArgumentException("type cannot be null.");
      }
		ArrayList<Item> listOf = new ArrayList<Item>();
		if (type == ItemType.BOOK) {
			for (int i = 0; i < libList.size(); i++) {
				if (libList.get(i) instanceof Book)
					listOf.add(libList.get(i));
			}
		} else {
			for (int i = 0; i <libList.size(); i++) {
				if (libList.get(i) instanceof CD)
					listOf.add(libList.get(i));
			}
		}
		return listOf;
	}
	
/**
* The method toString will print out the Library Inventory by using a for
* loop and adding the Item objects found from each index into a string.
* Returns the string of Item objects found.
*
* @return the Library inventory
*/
	public String toString(){
		String inventory = "\nLibrary Inventory: ";
		String item = "";
		for(int i = 0; i < libList.size(); i++) {
			if(libList.get(i) instanceof Book) {
				item = "Type: Book";
			} else {
				item = "Type: CD";
			}
			inventory += "\n" + (i+1) + ". " + item + "\n" + libList.get(i);
		}
		return inventory;
	}
}