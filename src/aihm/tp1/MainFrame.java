package aihm.tp1;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author greg
 */
public class MainFrame extends JFrame {

    private JSplitPane panel;

    public MainFrame() {
        initComponants();
        
        
        //fermeture de la fenete
        addWindowListener(new WindowAdapter() {
              @Override
              public void windowClosing(WindowEvent e) {
                System.exit(0);
              }
            });
    }

    private void initComponants() {
        //ajout menu
        this.setJMenuBar(new BarreMenu(this));
        
        //ajout panneau principal
        panel = new JSplitPane();
        this.add(panel);
    }

    class BarreMenu extends JMenuBar {
        private JMenu file = new JMenu("File");
        
        BarreMenu(JFrame frame) {
            add(file);
            
            //ajout des items de File
            file.add(new JMenuItem("Quit")
            {
                {
                    addActionListener(new QuitListener());
                }
            });
        }
        
        
        //listener de l'item Quitter ;)
        class QuitListener implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
            
        }
    }
}
