package com.example.android.listviewsample;

/**
 * Created by Shereen on 10/9/2017.
 */

public class Song {
    private String Name;
    private String Artist;
    private String Duration;

    public Song(String name, String artist, String duration) {
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

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }
}
