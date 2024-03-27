package com.cybonindia.sportsapp;

public class Sport {
    String SportName;
    int SportImage;

    public Sport(String sportName, int sportImage) {
        SportName = sportName;
        SportImage = sportImage;
    }

    public String getSportName() {
        return SportName;
    }

    public void setSportName(String sportName) {
        SportName = sportName;
    }

    public int getSportImage() {
        return SportImage;
    }

    public void setSportImage(int sportImage) {
        SportImage = sportImage;
    }
}
