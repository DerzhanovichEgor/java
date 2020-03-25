package by.derzhanovich.learn;

public class Excurrsion extends Tour{


    public Excurrsion(boolean meal, String transport, int days) {
        super(meal, transport, days);
        this.type = "excursion";
    }

    @Override
    public String toString() {
        return "Tour type: " + type + super.toString();
    }
}
