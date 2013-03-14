package aihm.tp1;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author greg
 */
public class AIHMTP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                    //look and feel
                    /*UIManager.setLookAndFeel(
                                        UIManager.getSystemLookAndFeelClassName());*/
                    
                    MainFrame frame = new MainFrame();
                    //frame.pack();
                    frame.setSize(400,200);
                    frame.setVisible(true);
            }
        });
    }
}
