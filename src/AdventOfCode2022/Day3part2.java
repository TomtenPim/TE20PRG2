package AdventOfCode2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3part2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner dataraw = new Scanner(new File("src/AdventOfCode2022/Day3data"));
        String ryggsäck1 = "";
        String ryggsäck2 = "";
        String ryggsäck3 = "";

        int points = 0;

        while (dataraw.hasNext()) {
            ryggsäck1 = dataraw.nextLine();
            ryggsäck2 = dataraw.nextLine();
            ryggsäck3 = dataraw.nextLine();

            for (int i = 0; i < ryggsäck1.length(); i++) {
                for (int j = 0; j < ryggsäck2.length(); j++) {
                    for (int k = 0; k < ryggsäck3.length(); k++) {
                        if (ryggsäck1.charAt(i) == ryggsäck2.charAt(j) && ryggsäck1.charAt(i) == ryggsäck3.charAt(k) ) {
                            if (ryggsäck1.charAt(i) > 96) {
                                points += ryggsäck1.charAt(i) - 96;
                            } else {
                                points += ryggsäck1.charAt(i) - 38;
                            }
                            ryggsäck1 = "";
                            ryggsäck2 = "";
                            ryggsäck3 = "";
                        }
                    }
                }
            }
        }
        System.out.println("prioritetssumman av allt blir " + points);
    }
}

