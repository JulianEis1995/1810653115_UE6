package Aufgabe_4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Aufruf
{
    public static void main(String[] args)
    {
        //Arraylist erstellen
        List<Freund> freunde = new ArrayList<>();

        //Schleife zum Befüllen der Studenten / Arraylist
        for (int i = 1; i <= 5; i++)
        {
            freunde.add(new Freund(JOptionPane.showInputDialog("Freund eingeben: ")));
        }

        //Ausgabe mithilfe der toString() Methode
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i+1 + ". Freund: " + freunde.get(i).toString());
        }
    }
}