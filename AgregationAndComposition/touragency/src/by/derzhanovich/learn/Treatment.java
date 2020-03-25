package by.derzhanovich.learn;

public class Treatment extends Tour {
    public Treatment(boolean meal, String transport, int days) {
        super(meal, transport, days);
        this.type = "treatment";
    }


    @Override
    public String toString() {
        return "Tour type: " + type + super.toString();
    }
}
