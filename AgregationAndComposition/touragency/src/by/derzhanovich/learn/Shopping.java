package by.derzhanovich.learn;

public class Shopping extends Tour {
    public Shopping(boolean meal, String transport, int days) {
        super(meal, transport, days);
        this.type = "shopping";
    }
    @Override
    public String toString() {
        return "Tour type: " + type + super.toString();
    }
}
