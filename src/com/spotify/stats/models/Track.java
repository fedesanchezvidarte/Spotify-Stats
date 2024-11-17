package com.spotify.stats.models;

import com.google.gson.Gson;

public class Track {
    private String name;
    private String artist;

    // Constructor - Empty
    public Track() {}

    // Constructor - Complete
    public Track(String name, String artist) {
        this.setName(name);
        this.setArtist(artist);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        if (artist == null || artist.isEmpty()) {
            throw new IllegalArgumentException("Artist cannot be null or empty");
        }
        this.artist = artist;
    }

    public static Track fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Track.class);
    }

    @Override
    public String toString() {
        return "Track{name='" + name + "', artist='" + artist + "'}";
    }
}

