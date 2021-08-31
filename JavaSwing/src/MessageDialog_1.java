import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
class MessageDialog_1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Wrong Password","Warning",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Wrong input", "Harmful", 2);

        ImageIcon img =new ImageIcon("images.jpg");
        JOptionPane.showMessageDialog(null,"Unclear","Hazardous",2,img);
    }
}
