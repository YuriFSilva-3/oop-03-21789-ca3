package com.oop;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class MusicTracker extends MusicFormat implements MyInterface {

    private String music, band, genre;
    private int released;

    private static Formatter output;
    private static String musicFile = "musicTracker.txt";

    @Override
    public String toString() {

        return super.toString();

    }

    protected MusicTracker(String music, String band, String genre, int released, String musicFormat) {

        super(musicFormat);
        this.music = music;
        this.band = band;
        this.genre = genre;
        this.released = released;

    }

    public void trackList() {

        System.out.println(this.music + " from " + this.band + " is a " + this.genre + " song. Released on " + this.released + " and available on " + this.musicFormat + "format.");

    }

    @Override
    public void toWrite(String fileToOpen) {

        try {
            FileWriter fileWriter = new FileWriter(fileToOpen, true);
            output = new Formatter(fileWriter);
        } catch (SecurityException securityException) {
            System.out.println("EXAMPLE 1");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("EXAMPLE 2");
            System.exit(1);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

    @Override
    public void toRead(String file) {

        try {
            output = new Formatter(file);
        } catch (IOException ioException) {
            System.err.println("EXAMPLE 3");
            System.exit(1);
        }

    }

}

