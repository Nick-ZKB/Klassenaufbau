package exercise2;

public class Patient {

    //TODO: Declare Private Attributes
    private String name;
    private int alter;
    private String Geschlecht;

    //TODO: Create Constructor
    public Patient(String name, int alter, String Geschlecht) {
        this.name = name;
        this.alter = alter;
        this.Geschlecht = Geschlecht;
    }

    //TODO: Add Getter and Setter Methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getGeschlecht() {
        return Geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        Geschlecht = geschlecht;
    }


    //TODO: Add toString Method

    @Override
    public String toString() {
        return this.name + " is " + this.alter + " years old and is a " + this.Geschlecht;
    }

}
