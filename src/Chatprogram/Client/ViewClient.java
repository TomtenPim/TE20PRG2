package Chatprogram.Client;
import javax.swing.*;
import java.awt.*;

public class ViewClient {
    private JTextField textField1;
    private JTextArea textArea1;
    private JButton sendButton;
    private JButton exitButton;
    private JPanel ClientView;

    public static void main(String[] args) {
        JFrame frame = new JFrame("ViewClient");
        frame.setContentPane(new ViewClient().ClientView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Container getClientView() {
        return ClientView;
    }
}
