import javax.swing.*;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;

public class JLabel_Demo extends JFrame {

    private Container c;
    private JLabel userlabel,passlabel;
    private ImageIcon icon;
    private Font f;
    private JLabel imglabel;
    private ImageIcon img;

    JLabel_Demo(){

        initComponent();
    }

    public void initComponent(){

        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);


        f=new Font("Arial",Font.BOLD,14);

        img= new ImageIcon(getClass().getResource("images.jpg"));
        imglabel=new JLabel(img);
        imglabel.setBounds(80,90,img.getIconWidth(),img.getIconHeight());
        c.add(imglabel);

        userlabel=new JLabel();
        userlabel.setText("Enter your Username : ");
        userlabel.setBounds(50,20,200,50);
        userlabel.setFont(f);
        userlabel.setForeground(Color.RED); //font color
        userlabel.setOpaque(true); //default background is false so it is needed to use before setBackground
        userlabel.setBackground(Color.yellow);
        userlabel.setToolTipText("Enter your username"); //tips
        c.add(userlabel);

        //System.out.println(" "+userlabel.getText());
        String s =userlabel.getToolTipText();
        System.out.println(" "+s);


        passlabel=new JLabel("Enter your password : ");
        passlabel.setBounds(50,50,200,50);
        passlabel.setFont(f);
        c.add(passlabel);


        icon=new ImageIcon(getClass().getResource("images.jpg"));
        this.setIconImage(icon.getImage());

    }

    public static void main(String[] args) {

        JLabel_Demo frame= new JLabel_Demo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,400,350);

        frame.setTitle("Label Demo");

    }
}
