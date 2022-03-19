package com.example.anew;

public class Objects {
    // 这个类有两个参数，一个是名字一个是信息
    private String name;
    private String information;
    
    public Objects(String name, String information) {
        this.name = name;
        this.information = information;
    }
    
    public String getInformation() {
        return information;
    }
    
    public String getName() {
        return name;
    }
    
    public void setInformation(String information) {
        this.information = information;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}