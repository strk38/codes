import javax.swing.JFrame;

public class JFrame_1 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400,300);
        //frame.setLocationRelativeTo(null);
        //frame.setLocation(300,150);

        frame.setBounds(350,150,400,300);
        frame.setTitle("Frame Demo ");
        frame.setResizable(false); //frame cant be resized

    }
}
