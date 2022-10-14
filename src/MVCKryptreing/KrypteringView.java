package MVCKryptreing;
import java.awt.event.ActionListener;
import javax.swing.*;

public class KrypteringView extends JFrame{
        private JLabel textLabel = new JLabel("Skriv in det du vill kryptera här.");
        public JTextField text = new JTextField(10);
        private JLabel keyLabel = new JLabel("Skriv in din krypteringsnyckel här.");
        public JTextField key = new JTextField(10);
        private JButton encryptButton = new JButton("Kryptera");
        public JTextField showEncryption = new JTextField(10);
    private JPanel View;

    KrypteringView() {
            JPanel cryptPanel = new JPanel();
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(600, 200);
            cryptPanel.add(textLabel);
            cryptPanel.add(text);
            cryptPanel.add(keyLabel);
            cryptPanel.add(key);
            cryptPanel.add(encryptButton);
            cryptPanel.add(showEncryption);
            this.add(cryptPanel);
        }

    public String getText() {
        return (text.getText());
    }

    public String getKey() {
        return (key.getText());
    }

    public void setCrypt(int solution) {
        showEncryption.setText(Integer.toString(solution));
    }

    // If the calculateButton is clicked execute a method
    // in the Controller named actionPerformed
    void addCryptListener(ActionListener listenForCryptButton) {
        encryptButton.addActionListener(listenForCryptButton);
    }

    // Open a popup that contains the error message passed
    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

    //Debugging help
    public static void main(String[] args) {
        KrypteringView test = new KrypteringView();
        test.setVisible(true);
    }
}
