package PgrOlympiaden23;
import javax.swing.*;

public class del1morot {
    public static void main(String[] args) {
        double morot = Integer.parseInt(JOptionPane.showInputDialog(null,"Antal morötter"));
        double torTid = Integer.parseInt(JOptionPane.showInputDialog(null,"Hur lång tid tar tor"));
        double morTid = Integer.parseInt(JOptionPane.showInputDialog(null,"Hur lång tid tar mor"));
        double torAnt = 0;
        double morAnt = 0;

        if (morot/torTid == morot%torTid && morot/morTid == morot%morTid){
            System.out.println("Den sista moroten lämnas");
            morot--;
        }

        for (double i = 1; torAnt+morAnt < morot; i++){
            torAnt= Math.floor(i/torTid) +1;
            morAnt= Math.floor(i/morTid) +1;
        }

        System.out.println("Tor äter " + torAnt + " morötter \nMor äter "  + morAnt + " morötter");
    }
}