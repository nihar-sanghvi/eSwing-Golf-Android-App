package com.nihar.eswing;

/**
 * Created by sangn008 on 6/1/15.
 */
public class Player {

    public int id;
    public String playerName;
    public String displayName;
    public String email;
    public String password;
    public String golfSwing;
    public String gender;
    public String birthDate;
    public String address;
    public String skillLevel;
    public String inGolfIndustry;

    public Player(){}

    public Player(String playerName, String displayName) {
        super();
        this.playerName = playerName;
        this.displayName = displayName;
    }

    //getters & setters
    public int getId(){
        return id;
    }
    public String getName(){
        return playerName;
    }
    public String getDisplayName(){
        return displayName;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String playerName){
        this.playerName = playerName;
    }
    public void setDisplayName(String displayName){
        this.displayName = displayName;
    }
    @Override
    public String toString() {
        return "Player [id=" + id + ", name=" + playerName + ", displayName=" + displayName
                + "]";
    }
}
