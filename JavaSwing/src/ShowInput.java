import javax.swing.*;
import javax.swing.JOptionPane.*;

public class ShowInput {
    public static void main(String[] args) {
        String name =JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Welcome, "+name);

        String s_name =JOptionPane.showInputDialog("Enter your name: ","name");
        String f_name= JOptionPane.showInputDialog(null,"Enter your first name: ","This is title",JOptionPane.QUESTION_MESSAGE);
        String l_name=JOptionPane.showInputDialog("Enter your last name: ");

        String full_name=f_name+" "+l_name;
        JOptionPane.showMessageDialog(null,"Your full name is : "+full_name);


    }
}
