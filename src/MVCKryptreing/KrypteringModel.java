package MVCKryptreing;

public class KrypteringModel {
    private String encryptValue = "";

    public void encrypt(String text, String key) {
        encryptValue = "";
        int[] Input = new int[text.length()];
        int[] Key = new int[text.length()];

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
