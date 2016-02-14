package com.work;

public class HelloBean { 
    
    private String helloWord; 
    private String name; 
    
    public HelloBean() { 
        
    } 

    public HelloBean(String helloWord, String name) { 
        this.helloWord = helloWord; 
        this.name = name; 
    }    
    
    public String getHelloWord() { 
        return helloWord; 
    } 

    public void setHelloWord(String helloword) { 
        this.helloWord = helloword; 
    } 

    public String getName() { 
        return name; 
    } 

    public void setName(String name) { 
        this.name = name; 
    } 
    
} 