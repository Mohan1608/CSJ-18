package cj.HackerRank;

import java.util.Scanner;

public class LineNumber {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int counter = 1;

        while (line.hasNextLine()) {
            String l = line.nextLine();

            System.out.println(counter + " " + l);
            counter++;
        }
    }
}

