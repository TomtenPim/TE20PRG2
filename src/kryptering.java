import javax.swing.*;

public class kryptering {
    public static void main(String[] args) {

        //int input = Integer.parseInt(JOptionPane.showInputDialog(null,"Det som ska krypteras här tack"));
        //int key = Integer.parseInt(JOptionPane.showInputDialog(null,"Nyckel här tack"));

        String input = JOptionPane.showInputDialog(null,"Det som ska krypteras här tack");
        String key = JOptionPane.showInputDialog(null,"Nyckel här tack");
        String output = "";
        int[] hexInput = new int[input.length()];
        int[] hexKey = new int[key.length()];

        for(int i = 0; i<input.length() ; i++){
            hexInput[i] = input.charAt(i);
        }

        for(int i = 0; i<key.length() ; i++){
            hexKey[i] = key.charAt(i);
        }
        output += (Encrypt(input.length(),hexInput,hexKey));
        System.out.println(output);
    }

    static int[] Encrypt(int length, int hexInput[], int hexKey[]){

        int[] output = new int[length];

        for(int i=0; i > length; i++){
        output[i] += hexInput[i] ^ hexKey[i];
        }
        return output;
    }
}
