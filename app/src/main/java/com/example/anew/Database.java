package com.example.anew;

public class Database {
    public int length;
    // TODO: implement this class
    private String Information;
    private Objects[] objects = new Objects[100];
    
    
    public String addObject(Objects objects) {
        //通过object添加object
        if (this.length < 100) {
            this.objects[this.length] = objects;
            this.length += 1;
            this.Information = "Object added sucessfully";
            return this.Information;
        } else {
            this.Information = "invalid";
            return this.Information;
        }
    }
    
    public void addObject(String object, String info) {
        //通过名字和具体信息在数据库中添加object
        if (this.length <= 100) {
            Objects objects = new Objects(object, info);
            this.objects[this.length] = objects;
            this.length += 1;
            this.Information = "Object added sucessfully";
        } else {
            this.Information = "invalid";
        }
    }
    
    public Objects[] getAllObjects() {
        //放回没有null的列表
        Objects[] objects = new Objects[this.length];
        for (int i = 0; i < length; i++) {
            objects[i] = this.objects[i];
        }
        return objects;
    }
    
    
    public String nameOf(String s) {
        //检索数据库，如果找到就显示信息找不到就把information设为invalid
        boolean judge = true;
        int j = 0;
        while (j < this.length && judge == true) {
            if (this.objects[j].getName() == s) {
                judge = false;
            } else {
                j++;
            }
        }
        this.Information = "found successfully";
        if (judge == false)
            return this.objects[j].getInformation();
        else
            this.Information = "invalid";
        return this.Information;
    }
    
    public void clearObjects() {
    //全清列表
        for (int i = 0; i < this.length; i++) {
            this.objects[i] = null;
        }
        this.length = 0;
        this.Information = "Database cleared";
    }
    
    public void updateInformation(String s, String i) {
        //第一个参数是object的名字，第二个参数是object的具体信息,两个参数必须是string 用来修改Object的名字和信息
        //使用例 updateInformation （“兔子”，”炖汤材料“）更新兔子的信息为炖汤材料
        boolean judge = true;
        int j = 0;
        while (j < this.length && judge == true) {
            if (this.objects[j].getName() == s) {
                this.objects[j].setInformation(i);
                judge = false;
            } else j++;
        }
        this.Information = "updated sucessfully";
    }
    
    public void removeInformation(String name) {
        //通过名字移除对应的object参数为object的名字，自然为String类
        //使用例：removeInformation("兔子“）移除名字为兔子的object
        boolean judge = true;
        int j = 0;
        while (j < this.length && judge == true) {
            if (this.objects[j].getName() == name) {
                judge = false;
            } else j++;
            for (int i = j; i < this.length - j; i++) {
                this.objects[j] = this.objects[i];
            }
        }
    }
        
        
        public String getInformation () {
            return this.Information;
        }
    }

