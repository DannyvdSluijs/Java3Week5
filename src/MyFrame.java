
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    StopLicht sl;
    ButtonPanel bp;

    MyFrame() {
        sl = new StopLicht();
        bp = new ButtonPanel(sl);

        Container c = getContentPane();
        c.add(bp, BorderLayout.SOUTH);
        c.add(sl, BorderLayout.CENTER);
        c.setBackground(Color.BLUE);

        setTitle("stoplicht");
        setLocation(300, 200);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
