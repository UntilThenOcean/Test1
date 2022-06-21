package com.company;

import javax.sound.midi.*;

public class MiniMiniMusicApp {

    public static void main(String[] args) {

        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();

    }

    public void play() {

        try{

            // got sequencer and open
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            // create a new sequence
            Sequence seq = new Sequence(Sequence.PPQ, 4);

            // create a new track
            Track track = seq.createTrack();

            // create message
            ShortMessage a = new ShortMessage();
            // setting
            a.setMessage(144,1,100,100);
            // using message create midievent
            MidiEvent noteOn = new MidiEvent(a,1);
            // add MidiEvent into track
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,44,100);
            MidiEvent noteOff = new MidiEvent(b,3);
            track.add(noteOff);

            // let sequencer go start to play music
            player.setSequence(seq);

            player.start();


        }catch (Exception ex){

            ex.printStackTrace();

        }
    }
}
