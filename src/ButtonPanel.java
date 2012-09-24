
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonPanel extends JPanel implements ActionListener {

    StopLicht sl;
    JButton rood;
    Timer timerGroen, timerProgress;
    JProgressBar progressBar;

    ButtonPanel(StopLicht sl) {
        this.setLayout(new BorderLayout());
        this.sl = sl;
        
        this.rood = new JButton("rood");
        this.add(rood);
        
        this.rood.addActionListener(this);
        
        this.progressBar = new JProgressBar(0, 50);
        this.add(this.progressBar, BorderLayout.NORTH);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rood) {
            sl.springOp(StopLicht.ROOD);
            
            /* Timer with 5 sec delay, to go back to green */
            timerGroen = new Timer(5000, new TimerGroenAction());
            timerGroen.start();
            
            timerProgress = new Timer(100, new TimerProgressAction());
            timerProgress.start();
        }
    }
          
    class TimerGroenAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            sl.springOp(StopLicht.GROEN);
            timerGroen.stop();
        }        
    }
    
    class TimerProgressAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            progressBar.setValue(progressBar.getValue() + 1);
            
            if (progressBar.getValue() == progressBar.getMaximum()) {
                progressBar.setValue(0);
                timerProgress.stop();
            }
        }        
    }
}
