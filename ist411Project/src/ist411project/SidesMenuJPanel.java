/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ist411project;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author annie
 */
public class SidesMenuJPanel extends JPanel{
    
    JButton fries, curlyFries, onionRings, salad, fruit, mozzSticks, friedPickles, yogurt, next;
    
    SidesMenuJPanel() {
        GridLayout gridLayout = new GridLayout(2,4,50,50);
        setLayout(gridLayout);
        
        Dimension size = new Dimension(10,50);
            
        fries = new JButton("French Fries");
            fries.setPreferredSize(size);
            add(fries);
        curlyFries = new JButton("Curly Fries");
            curlyFries.setPreferredSize(size);
            add(curlyFries);
        onionRings = new JButton("Onion Rings");
            onionRings.setPreferredSize(size);
            add(onionRings);
        salad = new JButton("Salad");
            salad.setPreferredSize(size);
            add(salad);
        fruit = new JButton("Fruit");
            fruit.setPreferredSize(size);
            add(fruit);
        mozzSticks = new JButton("Mozzarella Sticks");
            mozzSticks.setPreferredSize(size);
            add(mozzSticks);
        friedPickles = new JButton("Fried Pickles");
            friedPickles.setPreferredSize(size);
            add(friedPickles);
        yogurt = new JButton("Yogurt");
            yogurt.setPreferredSize(size);
            add(yogurt);
        next = new JButton("Next");
            next.setPreferredSize(size);
            add(next);
    }
    
}
