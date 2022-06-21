package com.company;

import javax.sound.midi.*;

public class MiniMusicPlayer {

    public static void main(String[] args) {

        try {

            // create & open sequencer
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            // create & track
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();


        for (int i = 5; i < 61; i+=4) {

            // add into track
            track.add(makeEvent(144,1,i,100,i));
            track.add(makeEvent(128,1,i,100,i+2));

        }

            // send sequence into sequencer
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();


        }catch (Exception ex){

            ex.printStackTrace();
        }


    }


    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {

        MidiEvent event = null;

        try {

            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);



        }catch (Exception e) {}

        return event;


    }

}
