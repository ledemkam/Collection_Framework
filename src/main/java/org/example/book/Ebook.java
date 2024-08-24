package org.example.book;

public class Ebook extends Book {

    public Ebook( String author, String subject) {
        super( author);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private String subject;



    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}
