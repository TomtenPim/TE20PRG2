package MVCKryptreing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class KrypteringControler {
    private KrypteringView theView;
    private KrypteringModel theModel;

    public KrypteringControler(KrypteringView theView, KrypteringModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.setVisible(true);
        // Tell the View that when ever the calculate button
        // is clicked to execute the actionPerformed method
        // in the CalculateListener inner class
        this.theView.addCryptListener(new EncryptListener());
    }

    private class EncryptListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            // Surround interactions with the view with
            // a try block in case numbers weren't
            // properly entered
            System.out.println("hej");
            try{
                String text = theView.getText();
                String key = theView.getKey();
                theModel.encrypt(text, key);
                theView.setCrypt(theModel.getEncryptValue());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 Strings");
            }
        }
    }

    public static void main(String[] args) {
        KrypteringControler crypttest = new KrypteringControler(new KrypteringView(),new KrypteringModel());
    }
}
