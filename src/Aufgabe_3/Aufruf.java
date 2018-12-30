package Aufgabe_3;

import javax.swing.*;
import java.util.Random;

public class Aufruf
{
    public static void main(String[] args)
    {
     int [] array = new int[100];


        //Befüllung des Arrays
        for(int i = 0; i < array.length; i++)
        {
            Random random = new Random();
            array[i] = random.nextInt();
        }

        while(true)
        {
            //Index eingeben und Ausgabe des Wertes bei Wert <index>
            int index = Integer.parseInt(JOptionPane.showInputDialog("Index angeben:"));
            JOptionPane.showMessageDialog(null, "Value: " + array[index]);

            //Neuen Wert eingeben und Wert für den Index an Position <index> setzen
            array[index] = Integer.parseInt(JOptionPane.showInputDialog("Neuer Wert:"));
        }

    }
}
