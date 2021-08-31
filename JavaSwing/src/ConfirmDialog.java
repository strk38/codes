import javax.swing.*;
import javax.swing.JOptionPane;
public class ConfirmDialog {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null,"Do you want to quit? ","title",JOptionPane.YES_NO_OPTION);
        if(choice==JOptionPane.YES_OPTION){
            System.out.println("Quit successful.");
           System.exit(0);
        }
        else{
            System.out.println("You have not quited yet. ");
        }
    }
}
