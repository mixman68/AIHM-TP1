package aihm.tp1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author greg
 */
public class RightPanel extends JPanel {

    JSlider slider;
    JPanel child;

    RightPanel() {
        init();
        initSlider();
    }
    
    private void init() {
        this.child = new ChildPanel();
        this.setLayout(new BorderLayout());

        this.add(child,BorderLayout.CENTER);
    }

    private void initSlider() {
        slider = new JSlider(JSlider.VERTICAL);
        this.add(slider,BorderLayout.EAST);
    }
    
    class ChildPanel extends JPanel {
        ChildPanel()
        {
            this.setBackground(Color.white);
            this.setLayout(null);
            this.setPreferredSize(new Dimension(400,400));
        }
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.black);
            //g.drawRect(0,0,50,50);
            g.drawLine(60,10, 60, this.getHeight());
            g.drawLine(150, 10, 150, this.getHeight());
            g.drawRect(65, this.getHeight(), 80, -100);
            g.setColor(Color.cyan);
            g.fillRect(66, this.getHeight()-1, 79, -97);
        }
    }
}
