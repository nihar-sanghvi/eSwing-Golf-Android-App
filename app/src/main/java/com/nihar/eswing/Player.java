package com.nihar.eswing;

/**
 * Created by sangn008 on 6/1/15.
 */
public class Player {

    public int id;
    public String name;
    public String displayName;

    public Player(){}

    public Player(String name, String displayName) {
        super();
        this.name = name;
        this.displayName = displayName;
    }

    //getters & setters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDisplayName(){
        return displayName;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDisplayName(String displayName){
        this.displayName = displayName;
    }
    @Override
    public String toString() {
        return "Player [id=" + id + ", name=" + name + ", displayName=" + displayName
                + "]";
    }
}
