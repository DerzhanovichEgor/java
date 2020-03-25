package by.derzhanovich.learn;

public class Tour {
    private boolean meal;
    private String transport;
    private int days;
    public String type;

    public Tour() {
    }

    public Tour(boolean meal, String transport, int days) {
        this.meal = meal;
        this.transport = transport;
        this.days = days;
    }

    public boolean isMeal() {
        return meal;
    }

    public String getTransport() {
        return transport;
    }

    public int getDays() {
        return days;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return " - meal: " + meal +
                ", transport: " + transport +
                ", days: " + days + ";\n";

    }
}
