package com.learn.beans;

public class DVDInfo {
    String title;
    String genre;
    String leadActor;

    public DVDInfo(String title, String genre, String leadActor) {
        this.title = title;
        this.genre = genre;
        this.leadActor = leadActor;
    }
    public String toString() {
        return title + " " + genre + " " + leadActor + "\n";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }
}
