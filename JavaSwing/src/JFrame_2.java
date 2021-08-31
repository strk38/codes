import javax.swing.JFrame;
public class JFrame_2 extends JFrame {//OOP

    JFrame_2(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,400,500);
        setTitle("Frame no 2. ");
    }

    public static void main(String[] args) {
        JFrame_2 frame = new JFrame_2();
        frame.setVisible(true);

    }
}
