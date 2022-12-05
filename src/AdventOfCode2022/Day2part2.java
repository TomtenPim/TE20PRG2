package AdventOfCode2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2part2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner dataraw = new Scanner(new File("src/AdventOfCode2022/Day2data"));
        String data = "";
        int points = 0;

        while (dataraw.hasNext()){
            data = dataraw.nextLine();

            if(data.charAt(2) == 88){
                if(data.charAt(0)-1 == 64){
                    points += data.charAt(0)-62;
                }
                else {
                    points += data.charAt(0)-65;
                }
            }

            if(data.charAt(2) == 89){
                points += data.charAt(0)-61;
            }

            if(data.charAt(2) == 90){
                points += 6;
                if(data.charAt(0)+1 == 68){
                    points += data.charAt(0)-66;
                }
                else {
                    points += data.charAt(0)-63;
                }
            }
            System.out.println(points);
        }
    }
}
