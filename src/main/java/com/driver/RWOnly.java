package com.driver;

public class RWOnly {
    private String name;
    RWOnly()
    {
        this.name= "";
    }
    
    public String get()
    {
        return this.name;
    }
    
    public void set(String str)
    {
        this.name= str;
    }
}
