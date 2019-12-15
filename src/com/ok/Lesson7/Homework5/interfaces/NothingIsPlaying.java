package com.ok.Lesson7.Homework5.interfaces;

public class NothingIsPlaying implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Nothing is playing");
    }
}
