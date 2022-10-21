package MVCKryptreing;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;

public class KrypteringView extends JFrame{
        private JLabel textLabel = new JLabel("Skriv in den sträng du vill kryptera här.");
        public JTextField text = new JTextField(10);
        private JLabel fileLabel = new JLabel("Alternativt skriv in namnet på filen du vill kryptera här.");
        public JTextField file = new JTextField(10);
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
            cryptPanel.add(fileLabel);
            cryptPanel.add(file);
            cryptPanel.add(keyLabel);
            cryptPanel.add(key);
            cryptPanel.add(encryptButton);
            cryptPanel.add(showEncryption);
            this.add(cryptPanel);
        }

    public String getText() {
        if (fileLabel.getText().equals("")==false){
            String fileText = "";
            int [] number = new int[0];

            try{
                Scanner scanner = new Scanner(new File(fileLabel.getText()));
                int i = 0;

                while(scanner.hasNextInt()) {
                    number[i++]= scanner.nextInt();
                }
            } catch (IOException e){
                System.out.println("An error occurred.");
                e.printStackTrace();

                try {
                    DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Binary.txt")));
                    for (int i=0; i < number.length; i++){
                        output.writeInt(number[i]);
                    }
                } catch (IOException e2) {
                    System.out.println("Another error occurred.");
                    e.printStackTrace();
                }
            }
            return fileText;
        }
            else{
            return (text.getText());
        }
    }



    public String getKey() {
        return (key.getText());
    }

    public void setCrypt(String solution) {
        showEncryption.setText(solution);
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

    public void showEncryption(String encryptValue) {
    }
}
