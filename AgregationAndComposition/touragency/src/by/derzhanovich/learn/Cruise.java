package by.derzhanovich.learn;

public class Cruise extends Tour {
    public Cruise(boolean meal, String transport, int days) {
        super(meal, transport, days);
        this.type = "cruise";

    }
    @Override
    public String toString() {
        return "Tour type: " + type + super.toString();
    }

}
