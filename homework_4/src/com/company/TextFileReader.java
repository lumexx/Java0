package com.company;

import com.company.entities.AudioMP3;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class TextFileReader {

    public void listFill(File file, List list) {
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                try {
                    String[] line = sc.nextLine().split(",");
                    list.add(new AudioMP3(line[0], line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3])));
                } catch (Exception e) {
                    System.out.println("Error");
                }
            }
        } catch (FileNotFoundException ex) {
            //
        }
    }
}

