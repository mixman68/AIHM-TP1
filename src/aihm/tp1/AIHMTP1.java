package aihm.tp1;

import java.awt.Dimension;
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
                try {
                    //look and feel
                    UIManager.setLookAndFeel(
                                        UIManager.getSystemLookAndFeelClassName());
                    
                    MainFrame frame = new MainFrame();
                    frame.pack();
                    frame.setMinimumSize(new Dimension(500,500));

                    //frame.setSize(400,200);
                    frame.setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AIHMTP1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(AIHMTP1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(AIHMTP1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(AIHMTP1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
