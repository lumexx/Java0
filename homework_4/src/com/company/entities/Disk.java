package com.company.entities;

import com.company.GenreComparator;

import java.util.ArrayList;
import java.util.List;

public class Disk {
    private List<Audio> playList;

    public Disk() {
    }

    public Disk(List<Audio> playList) {
        this.playList = playList;
    }

    public List<Audio> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Audio> playList) {
        this.playList = playList;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "audio=" + playList +
                '}';
    }

    public void addAudio(Audio audio) {
        if (playList != null) {
            playList.add(audio);
        } else {
            playList = new ArrayList<Audio>();
        }
    }

    public void sortByGenre() {
        playList.sort(new GenreComparator());
    }
}
