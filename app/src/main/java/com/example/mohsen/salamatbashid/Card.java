package com.example.mohsen.salamatbashid;

public class Card {

    private int title, context;
    private int containNoImage = -1 ;
    private int imageID = containNoImage;

    public Card(int imageID, int title, int context){
        this.title = title;
        this.context = context ;
        this.imageID = imageID ;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getContext() {
        return context;
    }

    public void setContext(int context) {
        this.context = context;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

}
