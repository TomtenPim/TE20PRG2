package AdventOfCode2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3part1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner dataraw = new Scanner(new File("src/AdventOfCode2022/Day3data"));
        String ryggsäck = "";
        String fack1 = "";
        String fack2 = "";
        int points = 0;

        while(dataraw.hasNext()){
            ryggsäck = dataraw.nextLine();
            for(int d = 0; d < ryggsäck.length()/2; d++) {
                fack1 += ryggsäck.charAt(d);
            }
            for (int d = ryggsäck.length()/2; d < ryggsäck.length(); d++){
                fack2 += ryggsäck.charAt(d);
            }

            for(int i = 0; i < fack2.length(); i++){
                for (int j = 0; j < fack2.length(); j++){
                    if(fack1.charAt(i) == fack2.charAt(j)){
                        if (fack1.charAt(i) > 96){
                            points += fack1.charAt(i)-96;
                        }
                        else {
                            points += fack1.charAt(i)-38;
                        }
                        fack1 = "";
                        fack2 = "";
                    }
                }
            }

        }
        System.out.println("prioritetssumman av allt blir " + points);
    }
}
