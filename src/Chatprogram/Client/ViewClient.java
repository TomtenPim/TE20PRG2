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

    public String getTextArea() { return textArea1.toString(); }

    public void setTextField1() { }
}
