/*import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class fileReader {
    public static void main(String[] args) {
        BufferedReader inFile = openTextFileForReading("info.text");
        ArrayList<String> fileContent = readAllText(inFile);
        String file = "file.txt";
        DataOutputStream outFile = openBinaryFileWriting("info.dat");
        writeTextAsBinary(fileContent, outFile);
    }

    private static void writeTextAsBinary(ArrayList<String> fileContent) {
        for (int i = 0; i < fileContent.size(); i++){
            try{
                outFile.write(fileContent.get(i).getBytes());
            } catch (IOException e) {

            }
        }
    }

    private static ArrayList<String> readAllText(BufferedReader inFile) {
        ArrayList<String> text = new ArrayList<>();
        try{
            String line = inFile.readLine();
            while(line != null) {
                text.add(line);
                line = inFile.readLine();
            }
        } catch ()
    }

    private static BufferedReader openTextFileForReading(String file) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("File not found, use keyboard instead!");
            ;
        }
        return in;
    }
}*/
