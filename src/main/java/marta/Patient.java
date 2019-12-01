package marta;

public class Patient {

    private String pesel;
    private String name;

    public Patient(String pesel, String name) {
        this.pesel = pesel;
        this.name = name;
    }

    public String getPesel() {
        return pesel;
    }

    public String getName() {
        return name;
    }
}
