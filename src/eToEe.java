import javax.swing.*;

public class eToEe {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null,"Vad var hälsningen?");
        String output = "";
        for( int i = 0; i < input.length(); i++){
            if( input.charAt(i) == 'e')
                output += "ee";
            else
                output += input.charAt(i);
        }
        System.out.println(output);
    }
}