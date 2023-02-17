package Chatprogram.Client;

import javax.swing.*;

public class ControlerClient {
    private ModelClient m;
    private ViewClient v;

    public ControlerClient(ModelClient m, ViewClient v) {
        JFrame frame = new JFrame("ViewClient");
        frame.setContentPane(v.getClientView());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ControlerClient c = new ControlerClient(new ModelClient(), new ViewClient());
    }
}
