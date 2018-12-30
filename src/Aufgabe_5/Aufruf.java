package Aufgabe_5;

import java.util.ArrayList;
import java.util.List;

public class Aufruf
{
    public static void main(String[] args)
    {
        //ArrayList erstellen
        List<Student> studenten = new ArrayList<>();

        //Mit Werten befüllen
        studenten.add(new Student("josef", 1810653192, 2018));
        studenten.add(new Student("josef", 1810653202, 2018));
        studenten.add(new Student("josef", 1810653072, 2018));

        //über for-each Schleife ausgeben
        for(Student j:studenten)
        {
            System.out.println(j.toString());
        }
    }


}
