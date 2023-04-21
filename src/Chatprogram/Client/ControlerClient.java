package Chatprogram.Client;

import Chatprogram.ListenerThread;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        v.getSendButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {m.setMessage(v.getTextField());
            }
        });

    }



    public static void main(String[] args) {
        //String ip = JOptionPane.showInputDialog(null,"Enter IPv4 here");
        //int port = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter port here (must be numbers)"));
        String name = JOptionPane.showInputDialog(null,"Enter name here");
        ControlerClient c = new ControlerClient(new ModelClient("10.80.45.132",413,name), new ViewClient());
    }

}
