import java.awt.*;
class Vikash extends Frame
{
    Vikash()
    {
        Button b=new Button("Home");
        b.setBounds(30,100,80,30);

        add(b);
        setSize(400,450);
        setLayout(null);
        setVisible(true);

    }
}


public class UI_1 {
    public static void main(String[] args) {
        Vikash v=new Vikash();

    }
}
