package com.driver;

public class RWOnly {
    private String name;
    public RWOnly()
    {
        this.name= "";
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String str)
    {
        this.name= str;
    }
}
