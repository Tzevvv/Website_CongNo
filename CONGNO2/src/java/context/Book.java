/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

public class Book {
    private String title;
    private String author;
    private double price;
 
    public Book() {
    }
 
    public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String toString() {
        return String.format("%s - %s - %f", title, author, price);
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
 
    
}