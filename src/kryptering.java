import javax.swing.*;

public class kryptering {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null,"Det som ska krypteras här tack");
        String key = JOptionPane.showInputDialog(null,"Nyckel här tack");
        int[] Input = new int[input.length()];
        int[] Output = new int[input.length()];
        int[] Key = new int[input.length()];

        for(int i = 0; i<input.length() ; i++){
            int keyWrap = (i/key.length());
            Input[i] = input.charAt(i);
            Key[i] = key.charAt(i-(keyWrap*key.length()));
        }

        for(int i = 0; i<input.length(); i++){
           Output[i] += (Encrypt(i,Input,Key));
           System.out.print((char)(Output)[i]);
        }
        System.out.println("");
    }

    static int Encrypt(int i, int Input[], int Key[]){
        int out = Input[i] ^ Key[i];
        return out;
    }
}