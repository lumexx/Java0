package com.company.entities;

public class AudioWAV extends Audio {
    private int quality;

    public AudioWAV(int quality) {
        this.quality = quality;
    }

    public AudioWAV(String name, String genre, int length, int quality) {
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
