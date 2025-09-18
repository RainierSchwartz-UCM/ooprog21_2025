import javax.swing.*;

public class UsingJOptionPaneDialogs {

    public static void main(String[] args) {
        
        while (true) {
            
            String name = JOptionPane.showInputDialog(null, "Please enter your name:");

            
            if (name == null) {
                JOptionPane.showMessageDialog(null, "You must enter a name!");
                System.exit(0); 
            }

            
            int response = JOptionPane.showConfirmDialog(null, "Do you want to display your name: " + name + "?");

            
            if (response == JOptionPane.YES_NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Your name is: " + name);
                break; 
            }
            
        }
    }
}