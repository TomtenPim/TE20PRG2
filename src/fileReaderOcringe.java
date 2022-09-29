import java.io.*;
import java.util.Scanner;

public class fileReaderOcringe {
    public static void main(String[] args) {

        int [] number = new int [2073155];

        //Scannar in varje rad i Random.txt och skriver in dem i Integern number
        try{
            Scanner scanner = new Scanner(new File("Random.txt"));
            int i = 0;

            while(scanner.hasNextInt()) {
                number[i++] = scanner.nextInt();
            }
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //Skep
        try {
            DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Binary.txt")));
        for (int i=0; i < number.length; i++){
                   output.writeInt(number[i]);
        }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

