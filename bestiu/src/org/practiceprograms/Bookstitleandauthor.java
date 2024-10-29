package org.practiceprograms;
public class Bookstitleandauthor {
	public static void main(String[] args) {
		class Book {
		    private String title;
		    private String author;
		    public Book(String title, String author) {
		        this.title = title;
		        this.author = author;
		    }
		    public void displayInfo() {
		        System.out.println("Book Title: " + title);
		        System.out.println("Author: " + author);
		    }
		}
		        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald");
		        myBook.displayInfo();
		    }
	}
