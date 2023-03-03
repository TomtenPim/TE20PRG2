package Chatprogram.Client;
import javax.swing.*;
import java.awt.*;

public class ViewClient {
    private JTextField textField1;
    private JTextArea textArea1;
    private JButton sendButton;
    private JPanel ClientView;

    public Container getClientView() {
        return ClientView;
    }

    public String getTextField() { return textField1.toString(); }

    public JButton getSendButton() { return sendButton; }

    public void setTextField1(String s) { textArea1 = new JTextArea(s); }
}
