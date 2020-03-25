package by.derzhanovich.learn;

public class Resort extends Tour{

    public Resort(boolean meal, String transport, int days) {
        super(meal, transport, days);
        this.type = "resort";
    }
    @Override
    public String toString() {
        return "Tour type: " + type + super.toString();
    }
}
