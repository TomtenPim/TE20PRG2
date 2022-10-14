package MVCKryptreing;

import javax.swing.*;

public class KrypteringControler {
    private KrypteringView theView;
    private KrypteringModel theModel;

    public KrypteringControler(KrypteringView theView, KrypteringModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        // Tell the View that when ever the calculate button
        // is clicked to execute the actionPerformed method
        // in the CalculateListener inner class
        this.theView.addEncryptListener(new EncryptListener());
    }

    private class EncryptListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
            // Surround interactions with the view with
            // a try block in case numbers weren't
            // properly entered
            try{
                String text = theView.getText();
                String key = theView.getKey();
                theModel.encrypt(text, key);
                theView.showEncryption(theModel.getEncryptValue());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 String");
            }
        }
    }
}
