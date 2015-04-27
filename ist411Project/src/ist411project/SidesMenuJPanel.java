/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ist411project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import ist411project.Inventory;

/**
 *
 * @author annie
 */
public class SidesMenuJPanel extends JPanel implements ActionListener{
    
    JButton fries, curlyFries, onionRings, salad, fruit, mozzSticks, friedPickles, yogurt, next;
    String sideChoice;
    SidesMenuJPanel() {
        GridLayout gridLayout = new GridLayout(2,4,40,50);
        setLayout(gridLayout);
        setBackground(Color.green);
        Dimension size = new Dimension(10,50);
            
        fries = new JButton("French Fries");
            fries.setPreferredSize(size);
            fries.addActionListener(this);
            add(fries);
        curlyFries = new JButton("Curly Fries");
            curlyFries.setPreferredSize(size);
            curlyFries.addActionListener(this);           
            add(curlyFries);
        onionRings = new JButton("Onion Rings");
            onionRings.setPreferredSize(size);            
            onionRings.addActionListener(this);
            add(onionRings);
        salad = new JButton("Salad");
            salad.setPreferredSize(size);          
            salad.addActionListener(this);             
            add(salad);
        fruit = new JButton("Fruit");
            fruit.setPreferredSize(size);          
            fruit.addActionListener(this);          
            add(fruit);
            
            
        mozzSticks = new JButton();
            mozzSticks.setLayout(new BorderLayout());
            mozzSticks.setText("<html>Mozzarella<br/>Sticks</html>");
            mozzSticks.setPreferredSize(size);            
            mozzSticks.addActionListener(this);           
            add(mozzSticks);
        friedPickles = new JButton("Fried Pickles");
            friedPickles.setPreferredSize(size);          
            friedPickles.addActionListener(this);           
            add(friedPickles);
        yogurt = new JButton("Yogurt");
            yogurt.setPreferredSize(size);        
            yogurt.addActionListener(this);           
            add(yogurt);
        next = new JButton("Next");
            next.setPreferredSize(size);
            add(next);
    }
    
       public void buttonsEnabled() {
        fries.setEnabled(true);
        curlyFries.setEnabled(true);
        onionRings.setEnabled(true);
        salad.setEnabled(true);
        fruit.setEnabled(true);
        mozzSticks.setEnabled(true);
        friedPickles.setEnabled(true);
        yogurt.setEnabled(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == fries){
            buttonsEnabled();
            fries.setEnabled(false);
            sideChoice = "fries";
        }
        if(obj == curlyFries){ 
            buttonsEnabled();
            curlyFries.setEnabled(false);
            sideChoice = "curlyFries";
        }
        if(obj == onionRings){ 
            buttonsEnabled();
            onionRings.setEnabled(false);
            sideChoice = "onionRings";
        }
        if(obj == salad){ 
            buttonsEnabled();
            salad.setEnabled(false);
            sideChoice = "salad";
        }
        if(obj == fruit){
            buttonsEnabled();
            fruit.setEnabled(false);
            sideChoice = "fruit";
        }
        if(obj == mozzSticks){ 
            buttonsEnabled();
            mozzSticks.setEnabled(false);
            sideChoice = "mozzSticks";
        }
        if(obj == friedPickles){ 
            buttonsEnabled();
            friedPickles.setEnabled(false);
            sideChoice = "friedPickles";
        }
        if(obj == yogurt){ 
            buttonsEnabled();
            yogurt.setEnabled(false);
            sideChoice = "yougurt";
        }
        
        
        
        
        
    }
}
