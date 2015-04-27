/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist411project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Graeson
 */
public class Inventory extends Thread {

    int whiteBread, wheat, italian, wholeGrain, ham, turkey, roastBeef, bologna, americanCheese, provalone;
    int fries, curlyFries, onionRings, salad, fruit, mozzSticks, friedPickles, yogurt;

    public Inventory() {
        //white = wheat = italian = wholeGrain = ham = turkey = roastBeef = bologna = americanCheese = provalone = 100;
        //fries = curlyFries = onionRings = salad = fruit = mozzSticks = friedPickles = yogurt = 100;
    }

    public void run() {
        
    }
    
    public void getInventory() throws IOException  {
        //reads the inventory text file to get the inventory values for each item
        
        String filePath = "inventory.txt";
        
        FileReader fr = new FileReader(filePath);
        BufferedReader inventoryReader = new BufferedReader(fr);
        
        int numberOfLines = 18;
        String[] textData = new String[numberOfLines];
        
        int i;
        
        for (i=0; i < numberOfLines; i++)   {
            textData[i] = inventoryReader.readLine();
        }
        //sets the local values based on the inventory items in the text file
         whiteBread     = Integer.valueOf(textData[0]);
         wheat          = Integer.valueOf(textData[1]);
         italian        = Integer.valueOf(textData[2]);
         wholeGrain     = Integer.valueOf(textData[3]);
         ham            = Integer.valueOf(textData[4]);
         turkey         = Integer.valueOf(textData[5]);
         roastBeef      = Integer.valueOf(textData[6]);
         bologna        = Integer.valueOf(textData[7]);
         americanCheese = Integer.valueOf(textData[8]);
         provalone      = Integer.valueOf(textData[9]);
         fries          = Integer.valueOf(textData[10]);
         curlyFries     = Integer.valueOf(textData[11]);
         onionRings     = Integer.valueOf(textData[12]);
         salad          = Integer.valueOf(textData[13]);
         fruit          = Integer.valueOf(textData[14]);
         mozzSticks     = Integer.valueOf(textData[15]);
         friedPickles   = Integer.valueOf(textData[16]);
         yogurt         = Integer.valueOf(textData[17]);
         
         setInventory();
    }
    
    public void setInventory() throws IOException  {
       //updates the text file to include the most recent inventory values
       BufferedWriter fw = new BufferedWriter(new FileWriter("inventory.txt"));
       int[] inventoryValues = new int[]{whiteBread, wheat, italian, wholeGrain, ham, turkey, roastBeef, bologna, americanCheese, provalone, fries, curlyFries, onionRings, salad, fruit, mozzSticks, friedPickles, yogurt};      
       
       try {
        // Tab delimited file will be written to data with the name tab-file.csv
        FileWriter fos = new FileWriter("inventory.txt");
        PrintWriter dos = new PrintWriter(fos);
        // loop through all your data and print it to the file
        for (int i=0; i<inventoryValues.length; i++)
        {
            dos.print(inventoryValues[i]);
            dos.println();
        }
            dos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("Error Writing to Inventory File");
        }
        } 
    
    public void decreasePickedBread(String s) throws IOException {
        if (s.equals("white"))
        {
            whiteBread--;
            System.out.println(s +" bread inventory: "+ whiteBread);
        }
        if (s.equals("wheat"))
        {
            wheat--;
        }
        if (s.equals("italian"))
        {
            italian--;
        }
        if (s.equals("wholeGrain"))
        {
            wholeGrain--;
        }
        setInventory();
    }

    public void decreasePickedMeat(String n) throws IOException {
        if (n.equals("ham"))
        {
            ham--;
        }
        if (n.equals("turkey"))
        {
            turkey--;
        }
        if (n.equals("roastBeef"))
        {
            roastBeef--;
        }
        if (n.equals("bologna"))
        {
            bologna--;
        }
        setInventory();
    }

    public void decreasePickedCheese(String v) throws IOException {
        if (v.equals("americanCheese"))
        {
            americanCheese--;
        }
        if (v.equals("provalone"))
        {
            provalone--;
        }
        setInventory();
    }

    public void decreasePickedSide(String k) throws IOException {
        if (k.equals("fries"))
        {
            fries--;
        }
        if (k.equals("curlyFries"))
        {
            curlyFries--;
        }
        if (k.equals("onionRings"))
        {
            onionRings--;
        }
        if (k.equals("salad"))
        {
            salad--;
        }

        if (k.equals("fruit"))
        {
            fruit--;
        }
        if (k.equals("mozzSticks"))
        {
            mozzSticks--;
        }
        if (k.equals("friedPickles"))
        {
            friedPickles--;
        }
        if (k.equals("yogurt"))
        {
            yogurt--;
        }
        setInventory();
    }
}

/*
    
 public void wholeGrain() {

 }

 public void hamMeat() {

 }

 public void turkeyMeat() {

 }

 public void roastBeefMeat() {

 }

 public void bolognaMeat() {

 }

 public void americanCheese() {
 }

 public void provaloneCheese() {
 }

 public void frenchFries() {
 }

 public void curlyFries() {
 }

 public void onionRings() {
 }

 public void salad() {
 }

 public void fruit() {
 }

 public void mozzSticks() {
 }

 public void friedPickels() {
 }

 public void yogurt() {
 }

 }

 */
