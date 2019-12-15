package com.ok.Lesson7.Homework5.interfaces;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MusicalInstrument instrument;

        if (new Random().nextInt(10) % 5 == 0) {
            instrument = new Piano();
        } else if (new Random().nextInt(10) % 2 == 0) {
            instrument = new Guitar();
        } else if (new Random().nextInt(10) % 2 != 0) {
            instrument = new Violin();
        } else {
            instrument = new NothingIsPlaying();
        }

        instrument.play();
    }
}
