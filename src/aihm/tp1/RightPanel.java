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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author greg
 */
public class RightPanel extends JPanel {

    protected JSlider slider;
    protected JPanel child;
    
    protected int sliderMin,sliderMax;

    RightPanel() {
        init();
        initSlider();
    }
    
    private void init() {
        sliderMin = 0;
        sliderMax = 100;
        
        this.child = new ChildPanel();
        this.setLayout(new BorderLayout());

        this.add(child,BorderLayout.CENTER);
    }

    private void initSlider() {
        slider = new JSlider(JSlider.VERTICAL,sliderMin,sliderMax,sliderMin);
        this.add(slider,BorderLayout.EAST);
        slider.addChangeListener(new SliderListener());
    }
    
    class SliderListener implements ChangeListener
    {

        @Override
        public void stateChanged(ChangeEvent e) {
            JSlider slider = (JSlider) e.getSource();
            child.repaint();
        }
        
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
            int value = slider.getValue();
            
            
            int yrect = (this.getHeight()-100)*(sliderMax-value)/sliderMax;
            super.paintComponent(g);
            g.setColor(Color.black);
            //g.drawRect(0,0,50,50);
            g.drawLine(60,10, 60, this.getHeight());
            g.drawLine(150, 10, 150, this.getHeight());
            g.drawRect(65, yrect, 80, 99);
            g.setColor(Color.cyan);
            g.fillRect(66, yrect+1, 79, 97);
            
            g.setColor(Color.black);
            
            StringBuffer buff = new StringBuffer();
            buff.append(value);
            buff.append(" %");
            g.drawString(buff.toString(), 100, yrect+20);
        }
    }
}
