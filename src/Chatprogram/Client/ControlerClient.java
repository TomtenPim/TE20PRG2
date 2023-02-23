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
        m.getStreams();
    }

    public static void main(String[] args) {
        String ip = JOptionPane.showInputDialog(null,"Enter IP here");
        int port = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter port here (must be numbers)"));
        ControlerClient c = new ControlerClient(new ModelClient(ip,port), new ViewClient());
    }
}
