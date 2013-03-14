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
    protected JToggleButton btn1, btn2, btn3;
    protected JLabel text1;
    protected ImageIcon ico1, ico2, ico3, icos1, icos2, icos3;

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
        pg.setLayout(new BoxLayout(pg, BoxLayout.Y_AXIS));

        this.addLeftComponents(pg);
    }

    private void addLeftComponents(JPanel p) {
        btn1 = new JToggleButton();
        btn2 = new JToggleButton();
        btn3 = new JToggleButton();
        text1 = new JLabel();
       
        
        //Nom
        
        btn1.setName("1");
        btn2.setName("2");
        btn3.setName("3");
        
        
        //Icones

        ico1 = new ImageIcon("img/One.png");
        ico2 = new ImageIcon("img/Two.png");
        ico3 = new ImageIcon("img/Three.png");
        icos1 = new ImageIcon("img/OneSelected.png");
        icos2 = new ImageIcon("img/TwoSelected.png");
        icos3 = new ImageIcon("img/ThreeSelected.png");

        btn1.setIcon(ico1);
        btn2.setIcon(ico2);
        btn3.setIcon(ico3);
        btn1.setSelectedIcon(icos1);
        btn2.setSelectedIcon(icos2);
        btn3.setSelectedIcon(icos3);
        
        //Listeners
        
        ActionListener listener = new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             JToggleButton btn = (JToggleButton) e.getSource();
             StringBuffer buff = new StringBuffer();
             buff.append("Button" + btn.getName() + " : ");
                if(btn.isSelected())
                {
                    buff.append("selected");
                } else
                {
                    buff.append("unselected");
                }
               text1.setText(buff.toString());
            }
        };
        
        btn1.addActionListener(listener);
        btn2.addActionListener(listener);
        btn3.addActionListener(listener);

        //Ajout des composants sur le conteneur
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(text1);

    }

    class BarreMenu extends JMenuBar {

        private JMenu file = new JMenu("File");

        BarreMenu(JFrame frame) {
            add(file);

            //ajout des items de File
            file.add(new JMenuItem("Quit") {
                {
                    addActionListener(new QuitListener());
                }
            });
        }

        //listener de l'item Quitter ;)
        class QuitListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }
    }
}
