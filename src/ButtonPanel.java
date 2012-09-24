import javax.swing.*;
import java.awt.event.*;

public class ButtonPanel extends JPanel implements ActionListener {
  StopLicht sl;
  JButton rood;

  ButtonPanel(StopLicht sl) {
    this.sl = sl;
    rood = new JButton("rood");
    add(rood);
    rood.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == rood) {
      sl.springOp(StopLicht.ROOD);
      try {
        Thread.sleep(5000);
      }
      catch(InterruptedException ie) {}
      sl.springOp(StopLicht.GROEN);
    }
  }
}
