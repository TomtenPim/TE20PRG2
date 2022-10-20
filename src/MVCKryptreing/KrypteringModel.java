package MVCKryptreing;

public class KrypteringModel {

    /*  String input = JOptionPane.showInputDialog(null,"Det som ska krypteras här tack");
        String key = JOptionPane.showInputDialog(null,"Nyckel här tack");
        int[] Input = new int[input.length()];
        int[] Output = new int[input.length()];
        int[] Key = new int[input.length()];

        //key-förlängare för kryptering och array placering av key och text
        for(int i = 0; i<input.length() ; i++){
            int keyWrap = (i/key.length());
            Input[i] = input.charAt(i);
            Key[i] = key.charAt(i-(keyWrap*key.length()));
        }

        //call-ar encrypt-funktionen för varje tecken och krypterar det
        for(int i = 0; i<input.length(); i++){
            Output[i] += (Encrypt(i,Input,Key));
            System.out.print((char)(Output)[i]);
        }
        System.out.println("");
    }*/

    private String encryptValue = "";

    public void encrypt(String text, String key) {
        encryptValue = "";
        int[] Input = new int[text.length()];
        int[] Key = new int[key.length()];

        for(int i = 0; i<text.length() ; i++){
            int keyWrap = (i/key.length());
            Input[i] = text.charAt(i);
            Key[i] = key.charAt(i-(keyWrap*key.length()));
        }

        for(int i = 0; i<text.length(); i++){
            encryptValue += (char)(Encrypt(i,Input,Key));
        }
    }

    public String getEncryptValue(){
        return encryptValue;
    }

    //faktiskt krypterar
       public int Encrypt(int i, int Input[], int Key[]){
           int output  = Input[i] ^ Key[i];
           return output;
        }
}
