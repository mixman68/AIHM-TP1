package aihm.tp1;

import javax.swing.SwingUtilities;

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
                MainFrame frame = new MainFrame();
                //frame.pack();
                frame.setSize(400,200);
                frame.setVisible(true);
            }
        });
    }
}
