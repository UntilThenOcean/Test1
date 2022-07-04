package com.company;

import java.util.*;
import java.io.*;

public class Jukebox1 {
    
    ArrayList<Song> songList = new ArrayList<Song>();
    
    public static void main(String[] args) {
        new Jukebox1().go();
    }

    private void go() {
        getSongs();
        System.out.println(">>>>>previous>>>>>>");
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(">>>>>>Now>>>>>>");
        System.out.println(songList);
    }

    private void getSongs() {
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
            
        }catch (Exception ex) {
            ex.printStackTrace();
            
        }
    }

    private void addSong(String lineToParse) {

        String[] tokens = lineToParse.split("/");

        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}
