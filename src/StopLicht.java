import javax.swing.*;
import java.awt.*;

public class StopLicht extends JPanel {
  public final static int ROOD = 0;
  public final static int GROEN = 1;
  private int kleur = GROEN;

  public StopLicht() {
    setOpaque(false);
    setPreferredSize(new Dimension(150, 200));
  }

  public void springOp(int i) {
    kleur = i;
    repaint();
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.GRAY);
    int midden = getWidth() / 2;
    int hoogte = getHeight();
    g.fillRect(midden - 30, hoogte - 180, 60, 110);
    g.fillRect(midden - 5, hoogte - 70, 10, 70);
    switch(kleur) {
      case ROOD:
        g.setColor(Color.RED);
        g.fillOval(midden - 20, hoogte - 170, 40, 40);
        break;
      case GROEN:
        g.setColor(Color.GREEN);
        g.fillOval(midden - 20, hoogte - 120, 40, 40);
    }
  }
}
