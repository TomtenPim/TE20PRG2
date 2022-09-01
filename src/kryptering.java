import javax.swing.*;

public class kryptering {
    public static void main(String[] args) {
        //String input = JOptionPane.showInputDialog(null,"Det som ska krypteras här tack");
        //String key = JOptionPane.showInputDialog(null,"Nyckel här tack");

        int input = Integer.parseInt(JOptionPane.showInputDialog(null,"Det som ska krypteras här tack"));
        int key = Integer.parseInt(JOptionPane.showInputDialog(null,"Nyckel här tack"));
        System.out.println(Encrypt(input,key));

    }
    static int Encrypt(int input, int key){
        int output = input^key;
        return output;
    }
}
