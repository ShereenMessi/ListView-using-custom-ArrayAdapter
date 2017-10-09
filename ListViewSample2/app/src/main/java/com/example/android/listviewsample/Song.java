package com.example.android.listviewsample;

/**
 * Created by Shereen on 10/9/2017.
 */

public class Song {
    private String Name;
    private String Artist;
    private int Duration;

    public Song(String name, String artist, int duration) {
        Name = name;
        Artist = artist;
        Duration = duration;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }
}
