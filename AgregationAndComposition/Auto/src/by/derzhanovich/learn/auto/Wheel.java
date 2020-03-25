package by.derzhanovich.learn.auto;

public class Wheel {
    private int tireHeight;
    public Wheel(){}

    public Wheel(int tireHeight) {
        this.tireHeight = tireHeight;
    }

    public int getTireHeight() {
        return tireHeight;
    }

    public void setTireHeight(int tireHeight) {
        this.tireHeight = tireHeight;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "tireHeight=" + tireHeight +
                '}';
    }
   public Wheel changeWheel(Wheel wheel){
           wheel = new Wheel();
           System.out.println("Wheel has been changed successfully. You can continue your trip");
           return wheel;
    }
}
