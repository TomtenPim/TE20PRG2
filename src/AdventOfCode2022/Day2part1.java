package AdventOfCode2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2part1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner dataraw = new Scanner(new File("src/AdventOfCode2022/Day2data"));
        String data = "";
        int points = 0;

        while (dataraw.hasNext()){
            data = dataraw.nextLine();

            if(data.charAt(2) == data.charAt(0)+23){
                points += 3;
            }

            if(data.charAt(2)-1 == data.charAt(0)+23){
                points += 6;
            }

            if(data.charAt(2)+2 == data.charAt(0)+23){
                points += 6;
            }

            points += (data.charAt(2) - 87);
            System.out.println(points);
        }
    }
}
