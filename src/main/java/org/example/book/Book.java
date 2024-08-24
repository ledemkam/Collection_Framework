package org.example.book;

public class Book  extends LibrairyItem implements Loanable {

     private    String author;

      public Book(String author) {

        this.author = author;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


@Override
    public void displayInfo(){
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println("ISBN " + getIsbn());
    }


    @Override
    public void loanItem() {
        System.out.println("Book has been loaned");
    }

    @Override
    public void returnItem() {
        System.out.println("Book has been returned");
    }
}
