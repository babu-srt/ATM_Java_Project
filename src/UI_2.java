import java.awt.*;
import java.awt.event.*;

class Amol extends Frame
{
    Label l;
    Amol()
    {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });


        l=new Label("Window Closing");
        this.add(l);
        setTitle("Sinhagad");
        setSize(400,450);
        setLayout(null);
        setVisible(true);
    }
}
public class UI_2 {
    public static void main(String[] args) {
        Amol l=new Amol();

    }
}
