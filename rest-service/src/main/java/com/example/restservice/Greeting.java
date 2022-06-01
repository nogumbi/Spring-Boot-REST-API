package com.example.restservice;

public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content){
        /**
         * id field is for the unique identifier for the greeting
         * content is the textual representation of the greeting
         **/
        this.id = id;
        this.content = content;
    }

    public long getId(){

        return id;
    }

    public String getContent(){
        return content;
    }
    
}
