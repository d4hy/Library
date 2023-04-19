/* 
*  File Name: LibraryTest.java
*  Course: TCSS143 –Fundamentals of Object-Oriented Programming Theory and
*  Application
*  Assignment: Programming Asssignment 3
*  Due Date: 03/03/2022
*  Instructor: Menaka Abraham
*/

import java.util.*;

/**
* This class tests exception handling for Library class' methods.
*/

public class LibraryTest {

/**
* The main method calls methods to test the exception handling in the Library class.
*/
    public static void main(String[]    args)    {
        Library library =    new Library();
        // Adding some books and cds
        library.addItem(new Book("B100",    "Building Java Programs", "Reges & Stepp", 2020, "Pearson"));
        library.addItem(new Book("B101",    "Introduction to Computing", "Patt & Patel",    2019,    "Wiley"));
        library.addItem(new Book("B102",    "Learning Python", "Lutz",    2013,    "O'Riley"));
        library.addItem(new CD("C100", "30",    58, "Adele", "Rock"));
        library.addItem(new CD("C101", "Motown Classics Gold",    120, "Various", "Soul"));
        library.addItem(new CD("C102", "Born This Way",    15, "Lady Gaga", "Pop"));
        
        System.out.println("Exception handling for method addItem: ");
        testAddNullItem(library);
        System.out.println("Exception handling for method search: ");
        testNullSearch(library);
        System.out.println("Exception handling for method checkout: ");
        testNullCheckout(library);
        System.out.println("Exception handling for method checkin: ");
        testNullCheckIn(library);
        System.out.println("Exception handling for method getList: ");
        testGetNullList(library);
    }
/**
* The method testAddNullItem will test the exception handling of the method
* addItem in the Library class. The method will try to call addItem with
* null parameters and catch the IllegalArgumentException if found.
*
* @param library library object to call methods from Library class
*/
    public static void testAddNullItem(Library library){
        
        try{
            library.addItem(null);
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
    }
/**
* The method testNullSearch will test the exception handling of the method
* search in the Library class. The method will try to call search with
* null parameters and catch the IllegalArgumentException if found.
*
* @param library library object to call methods from Library class
*/
    public static void testNullSearch(Library library){
        
        
        try{
            library.search(null);
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
/**
* The method testNullCheckout will test the exception handling of the method
* checkout in the Library class. The method will try to call checkout with
* null parameters and catch the IllegalArgumentException if found.
*
* @param library library object to call methods from Library class
*/
    public static void testNullCheckout(Library library){
        try{
            library.checkout(null);
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
/**
* The method testNullCheckIn will test the exception handling of the method
* checkin in the Library class. The method will try to call checkin with
* null parameters and catch the IllegalArgumentException if found.
*
* @param library library object to call methods from Library class
*/
    public static void testNullCheckIn(Library library){
        try{
            library.checkin(null);
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
/**
* The method testGetNullList will test the exception handling of the method
* getList in the Library class. The method will try to call getList with
* null parameters and catch the IllegalArgumentException if found.
*
* @param library library object to call methods from Library class
*/
    public static void testGetNullList(Library library){
        try{
            library.getList(null);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}