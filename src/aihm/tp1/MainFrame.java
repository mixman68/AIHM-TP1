package aihm.tp1;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author greg
 */
public class MainFrame extends JFrame {

    private JSplitPane panel;
    
    //Boutons
    JButton btn1,btn2,btn3;
    ImageIcon ico1,ico2,ico3;

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
        
        
        //PanneauGauche
        JPanel pg = new JPanel();
        panel.setLeftComponent(pg);
        pg.setLayout(new BoxLayout(pg,BoxLayout.Y_AXIS));
        
        this.addLeftComponents(pg);
    }
    
    
    private void addLeftComponents(JPanel p)
    {
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        
        ico1 = new ImageIcon("img/One.png");
        ico2 = new ImageIcon("img/Two.png");
        ico3 = new ImageIcon("img/Three.png");
        
        btn1.setIcon(ico1);
        btn2.setIcon(ico2);
        btn3.setIcon(ico3);
        
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        
        //icones par defaut
       
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
