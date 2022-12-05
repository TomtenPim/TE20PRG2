package PgrOlympiaden23;

public class del2decryptor {
    public static void main(String[] args) {

        //int chiffer = Integer.parseInt(JOptionPane.showInputDialog(null,"Kryptosträng?"));;
        int[] chiffer = {3, 2, 3, 1, 2, 4, 1};
        int lösAnt = 0;

        for (int i = 0; i < chiffer.length; i++) {
            if (i+1 == chiffer.length) lösAnt++;
            else if (chiffer[i]*10 + chiffer [i+1] <= 29){

                int j = i+2;
                if (j+1 == chiffer.length) lösAnt++;
                else if (chiffer[j]*10 + chiffer [j+1] <= 29){

                    int k = j+2;
                    if (k+1 == chiffer.length) lösAnt++;
                    else if (chiffer[k]*10 + chiffer [k+1] <= 29){

                        int l = k+2;
                        if (l+1 == chiffer.length) lösAnt++;
                        else if (chiffer[l]*10 + chiffer [l+1] <= 29){

                            int m = l+2;
                            if (m+1 == chiffer.length) lösAnt++;
                            else if (chiffer[m]*10 + chiffer [m+1] <= 29){

                                int n = m+2;
                                if (n+1 == chiffer.length) lösAnt++;
                                else if (chiffer[n]*10 + chiffer [n+1] <= 29){

                                    int o = n+2;
                                    if (o+1 == chiffer.length) lösAnt++;
                                    else if (chiffer[j]*10 + chiffer [j+1] <= 29){

                                    }
                                }
                            }
                        }
                    }
                }
            }
            lösAnt++;
        }


        System.out.println("Det finns " + lösAnt + " potentiella dekrypteringar.");
    }
}