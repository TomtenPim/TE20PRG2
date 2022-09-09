import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fileReaderOcringe {
    public static void main(String[] args) {

        int [] number = new int [2073155];
        int [] Output = new int [2073155];

        try{
        Scanner scanner = new Scanner(new File("Random.txt"));
        int i = 0;

        while(scanner.hasNextInt())
        {
            number[i++] = scanner.nextInt();
        }
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        for (int i=0; i < number.length; i++){
            String s = Integer.toBinaryString(number[i]);
            Output [i] += Integer.parseInt(s);
        }
    }
}
