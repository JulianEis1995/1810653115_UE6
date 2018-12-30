package Aufgabe_5;

public class Student
{
    //Variablen
    private String name;
    private int matrikelnummer;
    private int jahrgang;

    //Getter und Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMatrikelnummer() {
        return matrikelnummer;
    }
    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }
    public int getJahrgang() {
        return jahrgang;
    }
    public void setJahrgang(int jahrgang) {
        this.jahrgang = jahrgang;
    }

    // Konstruktor
    public Student(String name, int matrikelnummer, int jahrgang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.jahrgang = jahrgang;
    }

    //toString()

    @Override
    public String toString() {
        return "Student: " + "name = " + name + ", matrikelnummer = " + matrikelnummer + ", jahrgang = " + jahrgang;
    }
}
