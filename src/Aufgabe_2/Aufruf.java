package Aufgabe_2;

import javax.swing.*;
import java.util.Random;

public class Aufruf
{
    public static void main(String[] args)
    {
        // Eingabe der Array-Größe
        int eingabe = Integer.parseInt(JOptionPane.showInputDialog("Größe des Arrays angeben"));

        int[] array = new int [eingabe];

        //Befüllung des Arrays
        for(int i = 0; i < eingabe; i++)
        {
            Random random = new Random();

            array[i] = random.nextInt(1000);
        }

        //Ausgabe des Arrays
        // -1 da ansonsten OutOfBoundsException
        for (int j = array.length - 1 ; j >= 0; j--)
        {
            System.out.println(array[j]);
        }

        //System.out.println(array.length);
    }
}
