import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class internet {
    public static void main(String[] args) throws IOException {
        String links = "";
        Boolean isLink = false;
        Boolean newLine = false;

        URL resource = new URL("https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life");
        Scanner urlScanner = new Scanner(resource.openStream());
        while (urlScanner.hasNext()) {
           String line = urlScanner.nextLine();
            for (int i = 8; i < line.length(); i++){

                if (line.charAt(i-8) == 'a' && line.charAt(i-2) == '=' && line.charAt(i-1) == '"' && line.charAt(i) == 'h'){
                    isLink = true;
                    newLine = true;
                }

                else if (line.charAt(i) == '"'){
                    isLink = false;
                    if (newLine == true){
                        links += "\n";
                    }
                    newLine = false;
                }

                if(isLink == true){
                    links += line.charAt(i);
                }
            }
        }
        System.out.println(links);
    }
}