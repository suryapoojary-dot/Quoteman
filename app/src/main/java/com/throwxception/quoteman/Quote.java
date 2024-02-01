package com.throwxception.quoteman;

public class Quote {

    String name;
    String the_quote;
    int image; // R.id.image gets converted into a random number like 123456




    public Quote(String name, String the_quote, int image) {
        this.name = name;
        this.the_quote = the_quote;
        this.image = image;
    }
}
