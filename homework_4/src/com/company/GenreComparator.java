package com.company;

import com.company.entities.Audio;

import java.util.Comparator;

public class GenreComparator implements Comparator<Audio> {
    @Override
    public int compare(Audio audio1, Audio audio2) {
        if (audio1==null) return 1;
        if (audio2==null) return -1;
        return audio1.getGenre().compareTo(audio2.getGenre());
    }
}
