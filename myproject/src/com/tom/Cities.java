package com.tom;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Cities {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        ArrayList<String> areas = new ArrayList<>();
        ArrayList<String> postCodes = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader("data02.txt"));
            String line = in.readLine();
            String lastCity = "";
            while(line != null) {
                System.out.println(line);
                String[] tokens = line.split(",");
                if(!tokens[0].equals(lastCity)) {
                    lastCity = tokens[0];
                    cities.add(lastCity);
                }
                areas.add(tokens[1]);
                postCodes.add(tokens[2]);
                line = in.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } System.out.println(cities);
    }
}
