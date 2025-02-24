
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class UI_03 extends JFrame
{
    JLabel l1,l2,l3;
    JTextField f1,f2;
    JButton b1,b2,b3;
    JFrame jf;
    public UI_03()
    {
        jf = new JFrame("FlowLayout Example");
        jf.setSize(400,400);
        l1=new JLabel("Enter your Name : ");
        l2=new JLabel("Enter your City : ");
        f1=new JTextField(15);
        f2=new JTextField(15);
        b1=new JButton("Clear");
        b2=new JButton("Submit");
        b3=new JButton("Exit");
        jf.setLayout(new FlowLayout());

        jf.add(l1);
        jf.add(f1);
        jf.add(l2);
        jf.add(f2);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);

        jf.setVisible(true);


    }
    public static void main(String[] args)
    {
        new UI_03();
    }
}


//UI_04.java


