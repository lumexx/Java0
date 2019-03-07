package com.company.entities;

public class AudioMP3 extends Audio {
    private int quality;

    public AudioMP3(int quality) {
        this.quality = quality;
    }

    public AudioMP3(String name, String genre, int length, int quality) {
        super(name, genre, length);
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return (super.toString() + "quality=" + quality + '}');
    }
}
