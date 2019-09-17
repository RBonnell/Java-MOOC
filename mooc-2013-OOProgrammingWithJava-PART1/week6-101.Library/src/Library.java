
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 358721
 */
public class Library {
    private ArrayList<Book> library;
    
    public Library(){
        this.library = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook){
       library.add(newBook);
    }
    
    public void printBooks(){
        for (Book book : library){
            System.out.println(book);
        }
    }
    
    public ArrayList<Book> searchByTitle(String searched){
        ArrayList<Book> bookList = new ArrayList<Book>();
        for (Book book : library){
            if (StringUtils.included(book.title(), searched)){
                bookList.add(book);
            }
        }
        return bookList;
    }
    
    public ArrayList<Book> searchByPublisher(String searched){
        ArrayList<Book> bookList = new ArrayList<Book>();
        for (Book book : library){
            if (StringUtils.included(book.publisher(), searched)){
                bookList.add(book);
            }
        }
        return bookList;
    }
        
    public ArrayList<Book> searchByYear(int searched){
        ArrayList<Book> bookList = new ArrayList<Book>();
        for (Book book : library){
            if (book.year() == searched){
                bookList.add(book);
            }
        }
        return bookList;
    }
}
