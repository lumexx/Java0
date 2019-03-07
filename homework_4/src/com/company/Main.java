package com.company;

import com.company.entities.Audio;
import com.company.entities.Disk;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static final String PATH = "src/res/first.txt";
    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        File file = new File(PATH);
        TextFileReader textFileReader = new TextFileReader();
        List<Audio> list = new ArrayList<>();
        textFileReader.listFill(file, list);
        Disk disk = new Disk(list);
        System.out.println(findLength(disk));
        findAudioInRange(disk, 0, 200);
        disk.sortByGenre();
        System.out.println(Arrays.toString(disk.getPlayList().toArray()));
        log.info("successful");
    }

    public static int findLength(Disk disk) {
        int length = 0;
        List<Audio> playList = disk.getPlayList();
        for (Audio item : playList) {
            length += item.getLength();
        }
        return length;
    }

    public static void findAudioInRange(Disk disk, int min, int max) {
        List<Audio> playList = disk.getPlayList();
        for (Audio item : playList) {
            if (min < item.getLength() && item.getLength() < max) {
                System.out.println(item);
            }
        }
    }
}
