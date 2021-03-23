package com.oop;

public abstract class MusicFormat {

    public String musicFormat;

    public MusicFormat(String musicFormat) { this.musicFormat = musicFormat; }

    @Override
    public String toString() { return "Audio Format: " + this.musicFormat; }

}
