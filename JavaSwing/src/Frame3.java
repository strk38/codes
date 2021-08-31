import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;

public class Frame3 extends JFrame{

    private ImageIcon icon;
    private Container c;

    public static void main(String[] args) {
        Frame3 frame=new Frame3();
        frame.setVisible(true);

    }


    Frame3(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,400,500);
        setTitle("Frame no 3(Rosae) . ");

        initComponent();
    }

    public void initComponent(){

        c=this.getContentPane();
        c.setBackground(Color.GRAY);

        icon=new ImageIcon(getClass().getResource("images.jpg"));
        this.setIconImage(icon.getImage());
    }
}
