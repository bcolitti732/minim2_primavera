package edu.upc.dsa.models;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Question {
    private String sender;
    private String title;
    private String message;
    private String date;

    // Constructor
    public Question() {
    }



    public Question(String sender, String title, String message, String date) {
        this.sender = sender;
        this.title = title;
        this.message = message;
        this.date = date;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String email) {
        this.title = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
