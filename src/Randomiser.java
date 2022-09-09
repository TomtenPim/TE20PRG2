import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;

public class Randomiser {
    public static void main(String[] args) {

        int x;
        Random r = new Random();

        try {
            Writer output = new FileWriter("Random.txt", false);
            for (int i = 0; i < 1920 * 1080; i++) {
                x = r.nextInt(0xffffff);
                output.write(new Integer(x).toString());
                output.write("\n");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
