import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionDemo1 extends JFrame {

    private Container c;
    private JTextField tf1,tf2;

    ActionDemo1(){
        initComponents();
    }
    public void initComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        tf1=new JTextField();
        tf1.setBounds(50,50,150,50);
        c.add(tf1);

        tf2=new JTextField();
        tf2.setBounds(50,110,150,50);
        c.add(tf2);

        /*tf1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=tf1.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"You didnt enter anything");
                }
                else {
                    JOptionPane.showMessageDialog(null, "tf1 = " + s);
                }
            }
        });*/

        Handler handler =new Handler();
        tf1.addActionListener(handler);
        tf2.addActionListener(handler);
    }
    class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==tf1){
                String s=tf1.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"You didnt enter anything");
                }
                else {
                    JOptionPane.showMessageDialog(null, "tf1 = " + s);
                }
            }
            else{
                String s=tf2.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"You didnt enter anything");
                }
                else {
                    JOptionPane.showMessageDialog(null, "tf2 = " + s);
                }
            }


        }
    }
    public static void main(String[] args) {
        ActionDemo1 frame=new ActionDemo1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
        frame.setTitle("Action Listener Demo. ");
    }
}