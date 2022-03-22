package com.example.project;

public class Data {
    private String name;
    private String userName;
    private String password;
    private String phNUm;

    public Data(String name,String userName,String password,String phNUm){
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.phNUm = phNUm;
    }
    public void setName(){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setUserName(){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }
    public void setPassword(){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setPhNUm(){
        this.phNUm = phNUm;
    }
    public String getPhNUm(){
        return phNUm;
    }
}
