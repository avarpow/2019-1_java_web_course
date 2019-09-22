package authorbook;

import authorbook.Author;

public class Book {
    private String name;
    private Author author;
    private Double price;
    private Integer qty= 0;

    public Book(String name, Author author, Double price, Integer qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public Book(String name, Author author,  Double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public Double getPrice() {
        return this.price;
    }

    public Integer getQty() {
        return this.qty;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    
    public String toString() {
        return "Book[name = " + this.name +", "+this.author.toString()+", price = "+this.price.toString()+", qty = "+this.qty.toString()+"]";
    }
}