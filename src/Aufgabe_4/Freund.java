package Aufgabe_4;

public class Freund
{
    //Variable
    private String name;

    //Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Konstruktor
    public Freund(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name = " + name ;
    }
}
